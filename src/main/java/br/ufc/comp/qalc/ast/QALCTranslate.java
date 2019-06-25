package br.ufc.comp.qalc.ast;

import br.ufc.comp.qalc.frontend.ast.*;

import javax.swing.plaf.nimbus.State;

public class QALCTranslate extends QALCBaseVisitor<TreeNode> {

    private Parse root;

    public QALCTranslate(Parse root){
        this.root = root;
    }

    @Override
    public TreeNode visitParse(QALCParser.ParseContext ctx) {

        if(ctx.function().size() > 0){
            for(QALCParser.FunctionContext fun : ctx.function()){
                visit(fun);
            }
        }

        return this.root;
    }

    @Override
    public TreeNode visitFunction(QALCParser.FunctionContext ctx) {
        Function fun = new Function();

        if(ctx.fpars().type().size() == 0){//Função sem parametros
            this.root.addFuntion(fun);
        }else{
            for(int i = 0; i < ctx.fpars().type().size(); i++){
                fun.addParam(new Fpars(ctx.fpars().type(i).getText(), ctx.fpars().VARID(i).getText()));
                this.root.addFuntion(fun);
            }
        }
        Block b = (Block) visit(ctx.block());
        if(b.getBlocks().size() > 0){
            System.out.println(b.getBlocks().get(0).getBlocks().size());
        }

        return fun;
    }

    @Override
    public TreeNode visitBlock(QALCParser.BlockContext ctx) {
        Block block = new Block();
        for(QALCParser.StatContext st : ctx.stat()){
            if(st.block() != null){
                Block aux = (Block)visit(st.block());
                if(aux == null){
                    return null;
                }else{
                    block.addBlock(aux);
                }
            }

            //ctx.stat
        }

        return block;
    }

    @Override
    public TreeNode visitStat(QALCParser.StatContext ctx) {

        Statement stat = (Statement) visit(ctx);

        return super.visitStat(ctx);
    }

    @Override
    public TreeNode visitFor_stat(QALCParser.For_statContext ctx) {

        Expression exp1 = new Expression(ctx.expr(0));
        Expression exp2 = new Expression(ctx.expr(1));
        Expression exp3 = new Expression(ctx.expr(2));

        return new ForStatement(exp1, exp2, exp3);
    }
}
