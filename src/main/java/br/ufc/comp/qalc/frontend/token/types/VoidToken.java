package br.ufc.comp.qalc.frontend.token.types;

import br.ufc.comp.qalc.frontend.token.Token;

public class VoidToken extends Token {
    public VoidToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    @Override
    public String getTokenIdentifier() {
        return "VOID";
    }
}
