package br.ufc.comp.qalc.frontend.token.statements;

import br.ufc.comp.qalc.frontend.token.Token;

public class LkeyToken extends Token {
    public LkeyToken(long line, long start, String value){
        super(line, start, value);
    }

    @Override
    public String getTokenIdentifier() {
        return "LKEY";
    }
}
