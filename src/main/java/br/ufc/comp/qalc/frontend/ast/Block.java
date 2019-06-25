package br.ufc.comp.qalc.frontend.ast;

import java.util.ArrayList;
import java.util.List;

public class Block extends TreeNode {
    private List<Block> blocks;
    private List<Statement> statements;

    public Block(List<Block> blocks){
        this.blocks = blocks;
        this.statements = new ArrayList<Statement>();
    }

    public Block(){
        this(new ArrayList<Block>());
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void addBlock(Block block){
        blocks.add(block);
    }

    public void addStatement(Statement st){
        statements.add(st);
    }

    @Override
    public void printAtDepth(int depth) {

    }
}
