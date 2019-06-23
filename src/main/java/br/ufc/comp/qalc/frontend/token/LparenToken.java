package br.ufc.comp.qalc.frontend.token;

public class LparenToken extends Token {

    public LparenToken(long line, long start, String value) {
        super(line, start, value);
    }

    /**
     * Obtém o identificador associado ao token.
     *
     * @return delimitador lparen.
     */
    public String getLparenIdentifier() {
        interpretAttributes();
        return stringValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "LPAREN";
    }
}
