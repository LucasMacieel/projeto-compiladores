import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MainReminderScript {
    // Define o formato de data/hora a ser usado
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    // Método para parsear a data e hora a partir de uma string
    public static Date parseDateTime(String stringDataHora) {
        sdf.setLenient(false);
        try {
            return sdf.parse(stringDataHora);
        } catch (ParseException e) {
            return null;
        }
    }

    // Método para verificar a semântica do script de lembrete
    public static boolean verificarSemantica(ReminderScriptParser.ComContext com) {
        ReminderScriptBaseVisitor<Boolean> visitor = new ReminderScriptBaseVisitor<Boolean>() {
            @Override
            public Boolean visitLembrete(ReminderScriptParser.LembreteContext ctx) {
                Date dataRepeticao = parseDateTime(ctx.dataRepeticao.getText());
                if (dataRepeticao == null || !dataHoraValida(dataRepeticao)) {
                    System.err.println("Erro semântico: Formato inválido de data/hora.");
                    return false;
                }

                String opcaoRepeticao = ctx.opcaoRepeticao.getText();
                if (!repeticaoValida(opcaoRepeticao)) {
                    System.err.println("Erro semântico: Opção de repetição inválida.");
                    return false;
                }

                return true;
            }

            private boolean dataHoraValida(Date dataHora) {
                return sdf.format(dataHora).matches(
                        "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})\\s(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])\\b");
            }

            private boolean repeticaoValida(String opcaoRepeticao) {
                return opcaoRepeticao.equalsIgnoreCase("único") || opcaoRepeticao.equalsIgnoreCase("diário")
                        || opcaoRepeticao.equalsIgnoreCase("semanal")
                        || opcaoRepeticao.equalsIgnoreCase("mensal");
            }
        };

        return com.accept(visitor);
    }

    // Método para agendar um lembrete
    public static void agendarLembrete(String lembrete, String mensagem, String opcaoRepeticao, Date dataRepeticao) {
        // Executor para agendar tarefas
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        if (dataRepeticao.before(new Date())) {
            System.err.println("Erro: A data de agendamento já passou.");
            System.exit(1);
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                // Exibe a mensagem do lembrete
                System.out.println(lembrete + ": " + mensagem);
                if (opcaoRepeticao.equalsIgnoreCase("único")) {
                    // Encerra o scheduler se a repetição for única
                    scheduler.shutdown();
                } else {
                    // Calcula o próximo intervalo para a repetição
                    long delay = obterProximoIntervalo(opcaoRepeticao, dataRepeticao);
                    scheduler.schedule(this, delay, TimeUnit.MILLISECONDS);
                    dataRepeticao.setTime(System.currentTimeMillis() + delay); // Atualiza a dataRepeticao
                }
            }
        };

        // Calcula o delay inicial até a data de repetição
        long initialDelay = dataRepeticao.getTime() - System.currentTimeMillis();
        // Agenda a tarefa com o delay inicial
        scheduler.schedule(task, initialDelay, TimeUnit.MILLISECONDS);

        switch (opcaoRepeticao.toLowerCase()) {
            case "único":
                System.out.println("Agendando lembrete único para: " + dataRepeticao);
                break;
            case "diário":
                System.out.println("Agendando lembrete diário a partir de: " + dataRepeticao);
                break;
            case "semanal":
                System.out.println("Agendando lembrete semanal a partir de: " + dataRepeticao);
                break;
            case "mensal":
                System.out.println("Agendando lembrete mensal a partir de: " + dataRepeticao);
                break;
        }
    }

    // Método para obter o próximo intervalo de repetição
    private static long obterProximoIntervalo(String opcaoRepeticao, Date dataRepeticao) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataRepeticao);
        switch (opcaoRepeticao.toLowerCase()) {
            case "diário":
                calendar.add(Calendar.DAY_OF_MONTH, 1);
                break;
            case "semanal":
                calendar.add(Calendar.WEEK_OF_YEAR, 1);
                break;
            case "mensal":
                calendar.add(Calendar.MONTH, 1);
                break;
        }
        return calendar.getTimeInMillis() - System.currentTimeMillis();
    }

    // Método para executar os comandos do script de lembrete
    public static void executarComandos(ReminderScriptParser.ComContext com) {
        ReminderScriptBaseVisitor<Void> visitor = new ReminderScriptBaseVisitor<Void>() {
            @Override
            public Void visitLembrete(ReminderScriptParser.LembreteContext ctx) {
                String lembrete = ctx.nomeLembrete.getText();
                String mensagem = ctx.mensagem.getText();
                Date dataRepeticao = parseDateTime(ctx.dataRepeticao.getText());
                String opcaoRepeticao = ctx.opcaoRepeticao.getText();

                agendarLembrete(lembrete, mensagem, opcaoRepeticao, dataRepeticao);
                return null;
            }
        };
        com.accept(visitor);
    }

    // Método principal que lê o arquivo de entrada e executa o script
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName(args[0]);

        ReminderScriptLexer lexer = new ReminderScriptLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ReminderScriptParser parser = new ReminderScriptParser(tokens);

        ReminderScriptParser.ComContext com = parser.com();

        if (!verificarSemantica(com)) {
            System.err.println("O programa contém erros semânticos e não pode ser executado.");
            System.exit(1);
        }

        executarComandos(com);
    }
}
