// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReminderScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReminderScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReminderScriptParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ReminderScriptParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lembrete}
	 * labeled alternative in {@link ReminderScriptParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLembrete(ReminderScriptParser.LembreteContext ctx);
}