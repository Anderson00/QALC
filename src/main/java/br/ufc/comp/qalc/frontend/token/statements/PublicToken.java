package br.ufc.comp.qalc.frontend.token.statements;

import br.ufc.comp.qalc.frontend.token.Token;

public class PublicToken extends Token {
    public PublicToken(long line, long start, String value) {
        super(line, start, value);
    }

    @Override
    public String getTokenIdentifier() {
        return "PUBLIC";
    }
}
