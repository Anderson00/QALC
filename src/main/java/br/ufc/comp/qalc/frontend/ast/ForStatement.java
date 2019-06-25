package br.ufc.comp.qalc.frontend.ast;

public class ForStatement extends Statement {
    private Expression exp1, exp2 , exp3;

    public ForStatement(Expression exp1, Expression exp2, Expression exp3){
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.exp3 = exp3;
    }
}
