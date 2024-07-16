import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainReminderScript {
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public static Date parseDateTime(String stringDataHora) {
        sdf.setLenient(false);
        try {
            return sdf.parse(stringDataHora);
        } catch (ParseException e) {
            return null;
        }
    }

    // Método principal para realizar a análise semântica
    public static boolean verificarSemantica(ReminderScriptParser.ComContext com) {
        ReminderScriptBaseVisitor<Boolean> visitor = new ReminderScriptBaseVisitor<Boolean>() {
            // Visitante para o comando 'lembrete'
            @Override
            public Boolean visitLembrete(ReminderScriptParser.LembreteContext ctx) {
                // Verificar data/hora e opções de repetição
                Date dataRepeticao = parseDateTime(ctx.dataRepeticao.getText());
                if (dataRepeticao == null || !dataHoraValida(dataRepeticao)) {
                    System.err.println(
                            "Erro semântico: Formato inválido de data/hora para o lembrete: "
                                    + ctx.dataRepeticao.getText());
                    return false;
                }

                String opcaoRepeticao = ctx.opcaoRepeticao.getText();
                if (!repeticaoValida(opcaoRepeticao)) {
                    System.err.println(
                            "Erro semântico: Opção de repetição inválida para o lembrete: " + opcaoRepeticao);
                    return false;
                }

                return true;
            }

            // Método para validar o formato de data/hora
            private boolean dataHoraValida(Date dataHora) {
                // Implementar a lógica de validação do formato de data/hora
                return sdf.format(dataHora).matches(
                        "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})\\s(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])\\b");
            }

            // Método para validar a prioridade
            private boolean prioridadeValida(String prioridade) {
                // Verificar se a prioridade está entre as opções permitidas
                return prioridade.equals("alta") || prioridade.equals("media") || prioridade.equals("baixa");
            }

            // Método para validar as opções de repetição
            private boolean repeticaoValida(String repeticao) {
                // Verificar se a opção de repetição está entre as opções permitidas
                return repeticao.equals("unico") || repeticao.equals("diariamente")
                        || repeticao.equals("semanalmente") || repeticao.equals("mensalmente");
            }
        };

        // Executar a verificação semântica para o contexto 'start'
        return com.accept(visitor);
    }

    public static void agendarLembrete(Date dataRepeticao, String mensagem, int delaySegundos) {
        Timer timer = new Timer();
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Alerta de lembrete: " + mensagem);
            }
        };

        // Agendar a tarefa para executar na data de repeticao
        timer.schedule(tarefa, dataRepeticao);
        
        // Agendar uma repetição da tarefa a cada delaySegundos (após a data de repeticao)
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Alerta de lembrete repetido: " + mensagem);
            }
        }, dataRepeticao, delaySegundos * 1000);
    }

    public static String executarComandos(ReminderScriptParser.ComContext com) {
        ReminderScriptBaseVisitor<String> executor = new ReminderScriptBaseVisitor<String>() {
            @Override
            public String visitLembrete(ReminderScriptParser.LembreteContext ctx) {
                String nomeLembrete = ctx.nomeLembrete.getText();
                String mensagem = ctx.mensagem.getText();
                Date dataRepeticao = parseDateTime(ctx.dataRepeticao.getText());
                String opcaoRepeticao = ctx.opcaoRepeticao.getText();

                String mensagemFinal = String.format("Lembrete: %s, Mensagem: %s, Data Repetição: %s, Repetição: %s%n",
                        nomeLembrete, mensagem, sdf.format(dataRepeticao), opcaoRepeticao);

                // Agendar o lembrete
                agendarLembrete(dataRepeticao, mensagemFinal, 10); // Ajustar o delay conforme necessário

                return mensagemFinal;
            }
        };

        return com.accept(executor);
    }

    // Método main para executar o programa
    public static void main(String[] args) throws Exception {
        // Carregar o arquivo de entrada
        CharStream input = CharStreams.fromFileName(args[0]);

        // Criar o lexer e o parser
        ReminderScriptLexer lexer = new ReminderScriptLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ReminderScriptParser parser = new ReminderScriptParser(tokens);

        // Realizar a análise sintática
        ReminderScriptParser.ComContext com = parser.com();

        // Verificar a análise semântica
        if (!verificarSemantica(com)) {
            System.err.println("O programa contém erros semânticos e não pode ser executado.");
            System.exit(1);
        }

        // Se a análise semântica passou, continuar com a execução do programa
        String resultado = executarComandos(com);
        System.out.println(resultado);

        // Aqui você pode adicionar a lógica para executar o código da linguagem TaskScript
        System.out.println("Programa executado com sucesso.");
    }
}
