package br.ufc.comp.qalc.frontend.token.ignorates;

import br.ufc.comp.qalc.frontend.token.Token;

public class WhiteToken extends Token {
    public WhiteToken(long line, long start, String value) {
        super(line, start, value);
    }

    /**
     * Obtém o identificador associado ao token.
     *
     * @return delimitador espacos em branco, tabulação e quebra de linha.
     */
    public String getWhiteIdentifier() {
        interpretAttributes();
        return stringValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "WHITE";
    }
}
