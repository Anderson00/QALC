package br.ufc.comp.qalc.report.messages;

import br.ufc.comp.qalc.frontend.token.Token;

public class ErrorTokenMessage extends Message {
    protected Token token;

    public ErrorTokenMessage(Token errorToken, String msg){
        super(MessageCategory.ERROR, msg);
        token = errorToken;
    }

    /**
     * Obtém o token reconhecido que essa mensagem carrega.
     *
     * @return Token reconhecido.
     */
    public Token getToken() {
        return token;
    }
}
