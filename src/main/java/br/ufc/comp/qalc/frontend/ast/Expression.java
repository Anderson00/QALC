package br.ufc.comp.qalc.frontend.ast;

import br.ufc.comp.qalc.ast.QALCParser;

public class Expression extends TreeNode{

    private QALCParser.ExprContext context;

    public Expression(QALCParser.ExprContext context){
        this.context = context;
    }

    @Override
    public void printAtDepth(int depth) {

    }
}
