package br.ufc.comp.qalc.frontend.token.ignorates;

import br.ufc.comp.qalc.frontend.token.Token;

public class CommentToken extends Token {

    public CommentToken(long line, long start, String value){
        super(line, start, value);
    }

    /**
     * Obtém o identificador associado ao token.
     *
     * @return delimitador comentario.
     */
    public String getCommentIdentifier() {
        interpretAttributes();

        return stringValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "COM";
    }
}
