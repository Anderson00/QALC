package br.ufc.comp.qalc.frontend.ast;

import java.util.ArrayList;
import java.util.List;

public class Parse extends TreeNode{
    List<Function> list;

    public Parse(List<Function> functions){
        this.list = functions;
    }

    public Parse(){
        this(new ArrayList<Function>());
    }

    public List<Function> getFunctions() {
        return list;
    }
    public void addFuntion(Function fun){
        list.add(fun);
    }
    public void addFunctions(List<Function> funs){
        list.addAll(funs);
    }

    @Override
    public void printAtDepth(int depth) {

    }
}
