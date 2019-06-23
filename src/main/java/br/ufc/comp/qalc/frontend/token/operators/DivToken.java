package br.ufc.comp.qalc.frontend.token.operators;

import br.ufc.comp.qalc.frontend.token.Token;

public class DivToken extends Token {

    public DivToken(long line, long start, String value){
        super(line, start, value);
    }

    /**
     * Obtém o identificador associado ao token.
     *
     * @return operador Divisão.
     */
    public String getDivIdentifier() {
        interpretAttributes();
        return stringValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "DIV";
    }
}
