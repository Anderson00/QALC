package br.ufc.comp.qalc.frontend.token;

public class SemicolonToken extends Token{

    public SemicolonToken(long line, long start, String value){
        super(line, start, value);
    }

    /**
     * Obtém o identificador associado ao token.
     *
     * @return delimitador ponto e virgula.
     */
    public String getSemicolonIdentifier() {
        interpretAttributes();
        return stringValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "SEMI";
    }
}
