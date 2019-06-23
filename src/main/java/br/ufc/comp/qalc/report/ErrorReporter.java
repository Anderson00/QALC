package br.ufc.comp.qalc.report;

import br.ufc.comp.qalc.OutputVerbosity;
import br.ufc.comp.qalc.frontend.token.ErrorToken;
import br.ufc.comp.qalc.frontend.token.Token;
import br.ufc.comp.qalc.report.messages.ErrorTokenMessage;
import br.ufc.comp.qalc.report.messages.Message;
import br.ufc.comp.qalc.report.messages.MessageCategory;
import br.ufc.comp.qalc.report.messages.NewTokenMessage;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Classe especializada no relato de mensagens de erro.
 *
 * @see MessageCategory#ERROR
 */
public class ErrorReporter extends BasicReporter {
    /**
     * @see BasicReporter#BasicReporter(OutputStream)
     */
    public ErrorReporter(OutputStream stream) {
        super(stream);
    }

    /**
     * @see BasicReporter#BasicReporter(OutputStream, OutputVerbosity)
     */
    public ErrorReporter(OutputStream stream, OutputVerbosity verbosity) {
        super(stream, verbosity);
    }

    /**
     * Caso a mensagem recebida seja do tipo {@link NewTokenMessage} e
     * o token da mensagem sejá do tipo {@link ErrorToken} então:
     * reporta o reconhecimento do erro.
     * <p>
     * A depender do nível de verbosidade solicitado pelo usuário, a saída
     * possui diferentes formatos:
     *
     *
     * @param message A mensagem a consumir.
     */
    @Override
    public void consume(Message message) {
        if(message instanceof ErrorTokenMessage &&
           ((ErrorTokenMessage) message).getToken().getTokenIdentifier().equals("ERROR")){
            try{
                System.out.println("ERROR");
                Token token = ((ErrorTokenMessage) message).getToken();
                switch(verbosity){
                    case ESSENTIAL:
                        output.write(String.format("%d: %s\n",
                                token.getLineNumber(),
                                token.toString()));
                        break;
                    case ADDITIONAL_INFO:
                        output.write(String.format("%d:%d: error:\n%s\n",
                                token.getLineNumber(),
                                token.getColumnStart(),
                                token.toString()));

                        break;
                    case EVERYTHING:

                        output.write(String.format("%d:%d:%d: error: %s\n%s\n",
                                token.getLineNumber(),
                                token.getColumnStart(),
                                token.getColumnEnd(),
                                "Token não reconhecido",
                                token.toString()));
                        break;
                }

            }catch(IOException e){
                reportFailure(e);
            }
        }
    }
}
