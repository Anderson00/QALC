package br.ufc.comp.qalc.frontend.token;

public class CommaToken extends Token{

    public CommaToken(long line, long start, String value){
        super(line, start, value);
    }

    /**
     * Obtém o identificador associado ao token.
     *
     * @return identificador Comma.
     */
    public String getCommaIdentifier() {
        interpretAttributes();

        return stringValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "COMMA";
    }
}
