package br.ufc.comp.qalc.frontend.token;

public class ErrorToken extends Token {

    public ErrorToken(long line, long start, String value){
        super(line, start, value);
    }

    public String getErrorIdentifier(){
        interpretAttributes();
        return stringValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "ERROR";
    }
}
