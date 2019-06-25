package br.ufc.comp.qalc.frontend.ast;

import java.util.ArrayList;
import java.util.List;

public class Function extends TreeNode {
    List<Fpars> params;

    public Function(List<Fpars> params){
        this.params = params;
    }

    public Function(){
        this(new ArrayList<Fpars>());
    }

    public void addParam(Fpars param){
        params.add(param);
    }


    @Override
    public void printAtDepth(int depth) {

    }
}
