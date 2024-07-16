// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TaskScriptParser}.
 */
public interface TaskScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TaskScriptParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(TaskScriptParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskScriptParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(TaskScriptParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tarefa}
	 * labeled alternative in {@link TaskScriptParser#com}.
	 * @param ctx the parse tree
	 */
	void enterTarefa(TaskScriptParser.TarefaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tarefa}
	 * labeled alternative in {@link TaskScriptParser#com}.
	 * @param ctx the parse tree
	 */
	void exitTarefa(TaskScriptParser.TarefaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lembrete}
	 * labeled alternative in {@link TaskScriptParser#com}.
	 * @param ctx the parse tree
	 */
	void enterLembrete(TaskScriptParser.LembreteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lembrete}
	 * labeled alternative in {@link TaskScriptParser#com}.
	 * @param ctx the parse tree
	 */
	void exitLembrete(TaskScriptParser.LembreteContext ctx);
}