package br.ufc.comp.qalc.frontend.token;

public class RparenToken extends Token {

    public RparenToken(long line, long start, String value){
        super(line, start, value);
    }

    /**
     * Obtém o identificador associado ao token.
     *
     * @return delimitador rparen.
     */
    public String getRparenIdentifier() {
        interpretAttributes();

        return stringValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "RPAREN";
    }
}
