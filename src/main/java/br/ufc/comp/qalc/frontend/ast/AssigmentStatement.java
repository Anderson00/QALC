package br.ufc.comp.qalc.frontend.ast;

public class AssigmentStatement extends Statement{

    String type, name, value;


    public AssigmentStatement(String type, String name, String value){
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public AssigmentStatement(String type, String name){
        this(type, name, "0");
    }

}
