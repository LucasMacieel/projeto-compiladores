// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReminderScriptParser}.
 */
public interface ReminderScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReminderScriptParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ReminderScriptParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderScriptParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ReminderScriptParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lembrete}
	 * labeled alternative in {@link ReminderScriptParser#com}.
	 * @param ctx the parse tree
	 */
	void enterLembrete(ReminderScriptParser.LembreteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lembrete}
	 * labeled alternative in {@link ReminderScriptParser#com}.
	 * @param ctx the parse tree
	 */
	void exitLembrete(ReminderScriptParser.LembreteContext ctx);
}