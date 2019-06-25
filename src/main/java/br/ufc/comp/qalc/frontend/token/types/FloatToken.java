package br.ufc.comp.qalc.frontend.token.types;

import br.ufc.comp.qalc.frontend.token.Token;

public class FloatToken extends Token {
    public FloatToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    @Override
    public String getTokenIdentifier() {
        return "FLOAT";
    }
}
