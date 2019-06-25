package br.ufc.comp.qalc.frontend.token.types;

import br.ufc.comp.qalc.frontend.token.Token;

public class CharLiteralToken extends Token {
    public CharLiteralToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    @Override
    public String getTokenIdentifier() {
        return "CHARL";
    }
}
