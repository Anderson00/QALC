package br.ufc.comp.qalc.frontend.ast;

public class Fpars extends TreeNode{
    private String type, name;

    public Fpars(String type, String name){
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public void printAtDepth(int depth) {

    }
}
