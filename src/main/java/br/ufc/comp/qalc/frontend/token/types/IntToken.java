package br.ufc.comp.qalc.frontend.token.types;

import br.ufc.comp.qalc.frontend.token.Token;

public class IntToken extends Token {
    public IntToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    @Override
    public String getTokenIdentifier() {
        return "INT";
    }
}
