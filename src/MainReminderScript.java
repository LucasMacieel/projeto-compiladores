import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MainReminderScript {
    // Formato de data/hora aceito
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    // Método para analisar e converter uma string de data/hora em um objeto Date
    public static Date parseDateTime(String stringDataHora) {
        sdf.setLenient(false); // Define para não aceitar datas/hora inválidas
        try {
            return sdf.parse(stringDataHora); // Tenta converter a string para Date
        } catch (ParseException e) {
            return null; // Retorna null se a string não puder ser convertida
        }
    }

    // Método para verificar a semântica do comando
    public static boolean verificarSemantica(ReminderScriptParser.ComContext com) {
        ReminderScriptBaseVisitor<Boolean> visitor = new ReminderScriptBaseVisitor<Boolean>() {
            // Visitante para o comando 'lembrete'
            @Override
            public Boolean visitLembrete(ReminderScriptParser.LembreteContext ctx) {
                // Verifica se a data/hora é válida
                Date dataRepeticao = parseDateTime(ctx.dataRepeticao.getText());
                if (dataRepeticao == null || !dataHoraValida(dataRepeticao)) {
                    System.err.println(
                            "Erro semântico: Formato inválido de data/hora. Formato aceito - DD/MM/YYYY HH:MM");
                    return false;
                }

                // Verifica se a opção de repetição é válida
                String opcaoRepeticao = ctx.opcaoRepeticao.getText();
                if (!repeticaoValida(opcaoRepeticao)) {
                    System.err.println("Erro semântico: Opção de repetição inválida.");
                    return false;
                }

                return true;
            }

            // Método para validar o formato da data/hora
            private boolean dataHoraValida(Date dataHora) {
                // Verifica se a data/hora está no formato correto
                return sdf.format(dataHora).matches(
                        "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})\\s(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])\\b");
            }

            // Método para validar as opções de repetição
            private boolean repeticaoValida(String opcaoRepeticao) {
                // Verifica se a opção de repetição é uma das aceitas (case-insensitive)
                return opcaoRepeticao.toLowerCase().equals("único") || opcaoRepeticao.toLowerCase().equals("diário")
                        || opcaoRepeticao.toLowerCase().equals("semanal")
                        || opcaoRepeticao.toLowerCase().equals("mensal");
            }
        };

        // Executa a verificação semântica para o contexto 'com'
        return com.accept(visitor);
    }

    // Método para agendar o lembrete
    public static void agendarLembrete(String lembrete, String mensagem, String opcaoRepeticao, Date dataRepeticao) {
        Timer timer = new Timer(); // Cria um novo timer para agendamentos

        Calendar calendar = Calendar.getInstance(); // Cria uma instância de calendário
        calendar.setTime(dataRepeticao); // Define a data/hora do calendário para a data de repetição

        if (dataRepeticao.before(new Date())) {
            System.err.println("Erro: A data de agendamento já passou.");
            System.exit(1); // Retorna sem agendar se a data já passou
        }

        // Runnable para agendar o lembrete
        Runnable scheduleReminder = new Runnable() {
            @Override
            public void run() {
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        System.out.println(lembrete + ": " + mensagem);
                    }
                };

                // Agendamento baseado na opção de repetição
                switch (opcaoRepeticao.toLowerCase()) {
                    case "único":
                        System.out.println("Agendando lembrete único para: " + dataRepeticao);
                        timer.schedule(timerTask, dataRepeticao); // Agendamento único
                        break;
                    case "diário":
                        System.out.println("Agendando lembrete diário a partir de: " + dataRepeticao);
                        timer.scheduleAtFixedRate(timerTask, dataRepeticao, 24 * 60 * 60 * 1000); // Agendamento diário
                        break;
                    case "semanal":
                        System.out.println("Agendando lembrete semanal a partir de: " + dataRepeticao);
                        timer.scheduleAtFixedRate(timerTask, dataRepeticao, 7 * 24 * 60 * 60 * 1000); // Agendamento semanal
                        break;
                    case "mensal":
                        System.out.println("Agendando lembrete mensal a partir de: " + dataRepeticao);
                        timer.schedule(new TimerTask() {
                            @Override
                            public void run() {
                                timerTask.run(); // Executa a tarefa
                                calendar.add(Calendar.MONTH, 1); // Adiciona um mês à data
                                timer.schedule(this, calendar.getTime()); // Reagenda para o próximo mês
                            }
                        }, dataRepeticao);
                        break;
                }
            }
        };
        scheduleReminder.run(); // Executa o agendamento
    }

    // Método para executar os comandos
    public static void executarComandos(ReminderScriptParser.ComContext com) {
        ReminderScriptBaseVisitor<Void> visitor = new ReminderScriptBaseVisitor<Void>() {
            @Override
            public Void visitLembrete(ReminderScriptParser.LembreteContext ctx) {
                // Extrai os dados do lembrete do contexto
                String lembrete = ctx.nomeLembrete.getText();
                String mensagem = ctx.mensagem.getText();
                Date dataRepeticao = parseDateTime(ctx.dataRepeticao.getText());
                String opcaoRepeticao = ctx.opcaoRepeticao.getText();

                // Agenda o lembrete com os dados extraídos
                agendarLembrete(lembrete, mensagem, opcaoRepeticao, dataRepeticao);
                return null;
            }
        };
        com.accept(visitor); // Executa o visitante no contexto 'com'
    }

    public static void main(String[] args) throws Exception {
        // Carrega o arquivo de entrada
        CharStream input = CharStreams.fromFileName(args[0]);

        // Cria o lexer e o parser
        ReminderScriptLexer lexer = new ReminderScriptLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ReminderScriptParser parser = new ReminderScriptParser(tokens);

        // Realiza a análise sintática
        ReminderScriptParser.ComContext com = parser.com();

        // Verifica a semântica do comando
        if (!verificarSemantica(com)) {
            System.err.println("O programa contém erros semânticos e não pode ser executado.");
            System.exit(1); // Encerra o programa se houver erros semânticos
        }

        // Executa os comandos se não houver erros semânticos
        executarComandos(com);
    }
}