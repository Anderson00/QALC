package br.ufc.comp.qalc.frontend.token.operators;

import br.ufc.comp.qalc.frontend.token.Token;

public class DecToken extends Token {
    public DecToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    @Override
    public String getTokenIdentifier() {
        return "DEC";
    }
}
