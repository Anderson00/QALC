package br.ufc.comp.qalc.frontend.token.operators;

import br.ufc.comp.qalc.frontend.token.Token;

public class PowToken extends Token {

    public PowToken(long line, long start, String value){
        super(line, start, value);
    }

    /**
     * Obtém o identificador associado ao token.
     *
     * @return operador de Potenciação.
     */
    public String getPowIdentifier() {
        interpretAttributes();
        return stringValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "POW";
    }
}
