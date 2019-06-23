package br.ufc.comp.qalc.frontend.token.operators;

import br.ufc.comp.qalc.frontend.token.Token;

public class TimesToken extends Token {

    public TimesToken(long line, long start, String value){
        super(line, start, value);
    }

    /**
     * Obtém o identificador associado ao token.
     *
     * @return operaodr de multiplicação
     */
    public String getTimesIdentifier() {
        interpretAttributes();
        return stringValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "TIMES";
    }
}
