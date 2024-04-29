// Generated from /home/darla/Documentos/projetocompiladorANTLR/src/main/antlr4/compiladores/PascalSimplificado.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalSimplificadoParser}.
 */
public interface PascalSimplificadoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(PascalSimplificadoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(PascalSimplificadoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(PascalSimplificadoParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(PascalSimplificadoParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(PascalSimplificadoParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(PascalSimplificadoParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void enterMais_dc(PascalSimplificadoParser.Mais_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void exitMais_dc(PascalSimplificadoParser.Mais_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void enterCont_dc(PascalSimplificadoParser.Cont_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void exitCont_dc(PascalSimplificadoParser.Cont_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#dvar}.
	 * @param ctx the parse tree
	 */
	void enterDvar(PascalSimplificadoParser.DvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#dvar}.
	 * @param ctx the parse tree
	 */
	void exitDvar(PascalSimplificadoParser.DvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void enterTipo_var(PascalSimplificadoParser.Tipo_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void exitTipo_var(PascalSimplificadoParser.Tipo_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void enterVariaveis(PascalSimplificadoParser.VariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void exitVariaveis(PascalSimplificadoParser.VariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(PascalSimplificadoParser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(PascalSimplificadoParser.Mais_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void enterSentencas(PascalSimplificadoParser.SentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void exitSentencas(PascalSimplificadoParser.SentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterMais_sentencas(PascalSimplificadoParser.Mais_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitMais_sentencas(PascalSimplificadoParser.Mais_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterCont_sentencas(PascalSimplificadoParser.Cont_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitCont_sentencas(PascalSimplificadoParser.Cont_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#var_read}.
	 * @param ctx the parse tree
	 */
	void enterVar_read(PascalSimplificadoParser.Var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#var_read}.
	 * @param ctx the parse tree
	 */
	void exitVar_read(PascalSimplificadoParser.Var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void enterMais_var_read(PascalSimplificadoParser.Mais_var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void exitMais_var_read(PascalSimplificadoParser.Mais_var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#exp_write}.
	 * @param ctx the parse tree
	 */
	void enterExp_write(PascalSimplificadoParser.Exp_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#exp_write}.
	 * @param ctx the parse tree
	 */
	void exitExp_write(PascalSimplificadoParser.Exp_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#mais_exp_write}.
	 * @param ctx the parse tree
	 */
	void enterMais_exp_write(PascalSimplificadoParser.Mais_exp_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#mais_exp_write}.
	 * @param ctx the parse tree
	 */
	void exitMais_exp_write(PascalSimplificadoParser.Mais_exp_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(PascalSimplificadoParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(PascalSimplificadoParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void enterPfalsa(PascalSimplificadoParser.PfalsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void exitPfalsa(PascalSimplificadoParser.PfalsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_logica(PascalSimplificadoParser.Expressao_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_logica(PascalSimplificadoParser.Expressao_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#mais_expr_logica}.
	 * @param ctx the parse tree
	 */
	void enterMais_expr_logica(PascalSimplificadoParser.Mais_expr_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#mais_expr_logica}.
	 * @param ctx the parse tree
	 */
	void exitMais_expr_logica(PascalSimplificadoParser.Mais_expr_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(PascalSimplificadoParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(PascalSimplificadoParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#mais_termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterMais_termo_logico(PascalSimplificadoParser.Mais_termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#mais_termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitMais_termo_logico(PascalSimplificadoParser.Mais_termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(PascalSimplificadoParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(PascalSimplificadoParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#relacional}.
	 * @param ctx the parse tree
	 */
	void enterRelacional(PascalSimplificadoParser.RelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#relacional}.
	 * @param ctx the parse tree
	 */
	void exitRelacional(PascalSimplificadoParser.RelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(PascalSimplificadoParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(PascalSimplificadoParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void enterMais_expressao(PascalSimplificadoParser.Mais_expressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void exitMais_expressao(PascalSimplificadoParser.Mais_expressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(PascalSimplificadoParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(PascalSimplificadoParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#mais_termo}.
	 * @param ctx the parse tree
	 */
	void enterMais_termo(PascalSimplificadoParser.Mais_termoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#mais_termo}.
	 * @param ctx the parse tree
	 */
	void exitMais_termo(PascalSimplificadoParser.Mais_termoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalSimplificadoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(PascalSimplificadoParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalSimplificadoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(PascalSimplificadoParser.FatorContext ctx);
}