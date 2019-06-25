package br.ufc.comp.qalc.frontend;

import br.ufc.comp.qalc.frontend.token.*;
import br.ufc.comp.qalc.frontend.token.ignorates.CommentToken;
import br.ufc.comp.qalc.frontend.token.ignorates.WhiteToken;
import br.ufc.comp.qalc.frontend.token.operators.*;
import br.ufc.comp.qalc.frontend.token.statements.*;
import br.ufc.comp.qalc.frontend.token.types.*;

import java.io.IOException;

/**
 * Analisador Léxico da linguagem.
 * <p>
 * Funciona como uma fonte de tokens, de onde o Analisador Sintático
 * deverá ler.
 *
 * @see Source
 */
public class Scanner {

    /**
     * Último token reconhecido.
     */
    protected Token currentToken;
    /**
     * Fonte de caracteres de onde extrair os tokens.
     */
    protected Source source;

    /**
     * Constrói um Analisador Léxico a partir de uma fonte de caracteres.
     *
     * @param sourceStream Fonte a ser utilizada.
     */
    public Scanner(Source sourceStream) {
        // FIXME Lidar corretamente com as exceções.
        this.source = sourceStream;
    }

    /**
     * Consome caracteres da fonte até que eles componham um lexema de
     * um dos tokens da linguagem, coinstrói um objeto representando esse
     * token associado ao lexema lido e o retorna.
     *
     * @return Token reconhecido.
     * @throws IOException Caso haja problema na leitura da fonte.
     */
    public Token getNextToken() throws IOException {
        // TODO Reconhecimento de tokens

        if (source.getCurrentChar() == Source.EOF) {
            return currentToken = new EOFToken(source.getCurrentLine(), source.getCurrentColumn());
        } else if (Character.isDigit(source.getCurrentChar())) { // NumberToken
            StringBuilder lexema = new StringBuilder();
            boolean ponto = false; //ponto so pode aparecer uma vez

            long currentLine = source.getCurrentLine();
            long lexemeStart = source.getCurrentColumn();

            do {
                lexema.append(source.getCurrentChar());
                source.advance();
                if(source.getCurrentChar() == '.' && !ponto){
                    ponto = true;
                    lexema.append('.');
                    source.advance();
                }
            } while (Character.isDigit(source.getCurrentChar()));

            String stringValue = lexema.toString();

            return new NumberToken(currentLine, lexemeStart, stringValue);
        }else if(source.getCurrentChar() == '$'){  // Id
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            if(source.getCurrentChar() != '?'){ //verifica se é um id ou resultId
                do{
                    lexema.append(source.getCurrentChar());
                    source.advance();
                }while(Character.isLetter(source.getCurrentChar()));

                return currentToken =  new VariableIdentifierToken(currentLine, lexemaStart, lexema.toString());
            }else{
                boolean zero = false;
                boolean coringa = true;

                lexema.append(source.getCurrentChar());
                source.advance(); //Consome o char ?

                do{
                    if(source.getCurrentChar() == '0' && coringa){
                       zero = true;
                    }else if(Character.isDigit(source.getCurrentChar())){
                        zero = false;
                    }
                    coringa = false;
                    lexema.append(source.getCurrentChar());
                    source.advance();
                }while(Character.isDigit(source.getCurrentChar()));

                if(!zero){
                    //valido
                    return currentToken =  new ResultIdentifierToken(currentLine, lexemaStart, lexema.toString());
                }
            }
        }else if(source.getCurrentChar() == '@'){ //funcão
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            do{
                lexema.append(source.getCurrentChar());
                source.advance();
            }while(Character.isLetter(source.getCurrentChar()));

            return new FunctionIdentifierToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '+'){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            if(source.getCurrentChar() == '+'){
                lexema.append(source.getCurrentChar());
                source.advance();
                return this.currentToken = new IncToken(currentLine, lexemaStart, lexema.toString());
            }

            return currentToken =  new PlusToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '-'){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            if(source.getCurrentChar() == '-'){
                lexema.append(source.getCurrentChar());
                source.advance();
                return this.currentToken = new DecToken(currentLine, lexemaStart, lexema.toString());
            }

            return currentToken = new MinusToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '/'){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            return currentToken = new DivToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '*'){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            return currentToken = new TimesToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '%'){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            return currentToken = new ModToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '^'){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            return currentToken = new PowToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '='){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            if(source.getCurrentChar() == '='){
                lexema.append(source.getCurrentChar());
                source.advance();
                return this.currentToken = new EqToken(currentLine, lexemaStart, lexema.toString());
            }

            return currentToken = new AtribToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '('){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            return currentToken = new LparenToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == ')'){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            return currentToken = new RparenToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == ','){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            return currentToken = new CommaToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == ';'){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            return currentToken = new SemicolonToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '{'){

            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append('{');
            source.advance();

            return this.currentToken = new LkeyToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '}'){

            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append('}');
            source.advance();

            return this.currentToken = new RkeyToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '#'){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            do {
                lexema.append(source.getCurrentChar());
                source.advance();
            }while(source.getCurrentChar() != '\n');

            return currentToken = new CommentToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '\''){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();


            lexema.append(source.getCurrentChar());
            source.advance();
            if(source.getCurrentChar() == '\\'){
                lexema.append(source.getCurrentChar());
                source.advance();
                lexema.append(source.getCurrentChar());
                source.advance();
            }else{
                lexema.append(source.getCurrentChar());
                source.advance();
            }
            lexema.append(source.getCurrentChar());
            source.advance();

            return this.currentToken = new CharToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '>'){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            if(source.getCurrentChar() == '='){
                lexema.append(source.getCurrentChar());
                source.advance();
                return this.currentToken = new GeqToken(currentLine, lexemaStart, lexema.toString());
            }

            return this.currentToken = new GreatToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '<'){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            if(source.getCurrentChar() == '='){
                lexema.append(source.getCurrentChar());
                source.advance();
                return this.currentToken = new LeqToken(currentLine, lexemaStart, lexema.toString());
            }

            return this.currentToken = new LessToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '\"'){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            do{
                lexema.append(source.getCurrentChar());
                source.advance();
            }while(source.getCurrentChar() != '\"');
            source.advance();
            lexema.append('"');

            return this.currentToken = new StringToken(currentLine, lexemaStart, lexema.toString());
        }else if(source.getCurrentChar() == '&'){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            if(source.getCurrentChar() == '&'){
                lexema.append('&');
                source.advance();

                return this.currentToken = new AndToken(currentLine, lexemaStart, lexema.toString());
            }
            //retorna token do operador and bit-a-bit
        }else if(source.getCurrentChar() == '|'){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            if(source.getCurrentChar() == '|'){
                lexema.append('|');
                source.advance();

                return this.currentToken = new OrToken(currentLine, lexemaStart, lexema.toString());
            }
            //retorna token do operador or bit-a-bit
        }else if(Character.isWhitespace(source.getCurrentChar())){
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();

            lexema.append(source.getCurrentChar());
            source.advance();

            return currentToken = new WhiteToken(currentLine, lexemaStart, lexema.toString());
        }else{
            StringBuilder lexema = new StringBuilder();

            long currentLine = source.getCurrentLine();
            long lexemaStart = source.getCurrentColumn();
            do{
                lexema.append(source.getFutureChar());
                source.advanceFuture();

            }while(source.getFutureChar() != Source.EOF &&
                    !Token.isValidTokenIdentifier(source.getFutureChar()));

            switch (lexema.toString()){
                case "if":
                    source.adjustFuture();
                    return this.currentToken = new IfToken(currentLine, lexemaStart, lexema.toString());
                case "else":
                    source.adjustFuture();
                    return this.currentToken = new ElseToken(currentLine, lexemaStart, lexema.toString());
                case "while":
                    source.adjustFuture();
                    return this.currentToken = new WhileToken(currentLine, lexemaStart, lexema.toString());
                case "for":
                    source.adjustFuture();
                    return this.currentToken = new ForToken(currentLine, lexemaStart, lexema.toString());
                case "break":
                    source.adjustFuture();
                    return this.currentToken = new BreakToken(currentLine, lexemaStart, lexema.toString());
                case "return":
                    source.adjustFuture();
                    return this.currentToken = new ReturnToken(currentLine, lexemaStart, lexema.toString());
                case "true":
                    source.adjustFuture();
                    return this.currentToken = new TrueToken(currentLine, lexemaStart, lexema.toString());
                case "false":
                    source.adjustFuture();
                    return this.currentToken = new FalseToken(currentLine, lexemaStart, lexema.toString());
                case "this":
                    source.adjustFuture();
                    return this.currentToken = new ThisToken(currentLine, lexemaStart, lexema.toString());
                case "public":
                    source.adjustFuture();
                    return this.currentToken = new PublicToken(currentLine, lexemaStart, lexema.toString());
                case "private":
                    source.adjustFuture();
                    return this.currentToken = new PrivateToken(currentLine, lexemaStart, lexema.toString());
                case "struct":
                    source.adjustFuture();
                    return this.currentToken = new StructToken(currentLine, lexemaStart, lexema.toString());
                case "static":
                    source.adjustFuture();
                    return this.currentToken = new StaticToken(currentLine, lexemaStart, lexema.toString());
                case "int":
                    source.adjustFuture();
                    return this.currentToken = new IntToken(currentLine, lexemaStart, lexema.toString());
                case "double":
                    source.adjustFuture();
                    return this.currentToken = new DoubleToken(currentLine, lexemaStart, lexema.toString());
                case "float":
                    source.adjustFuture();
                    return this.currentToken = new FloatToken(currentLine, lexemaStart, lexema.toString());
                case "char":
                    source.adjustFuture();
                    return this.currentToken = new CharToken(currentLine, lexemaStart, lexema.toString());
                case "bool":
                    source.adjustFuture();
                    return this.currentToken = new BoolToken(currentLine, lexemaStart, lexema.toString());
                case "const":
                    source.adjustFuture();
                    return this.currentToken = new ConstToken(currentLine, lexemaStart, lexema.toString());
                case "void":
                    source.adjustFuture();
                    return this.currentToken = new VoidToken(currentLine, lexemaStart, lexema.toString());
            }
            source.resetFuture();
        }

        StringBuilder lexema = new StringBuilder();

        long currentLine = source.getCurrentLine();
        long lexemaStart = source.getCurrentColumn();
        do{
            lexema.append(source.getCurrentChar());
            source.advance();
        }while(!Token.isValidTokenIdentifier(source.getCurrentChar()) && source.getCurrentChar() != Source.EOF);

        return currentToken = new ErrorToken(currentLine, lexemaStart, lexema.toString());
    }

    /**
     * Obtém o último token reconhecido.
     *
     * @return O último token reconhecido.
     */
    public Token getCurrentToken() {
        return currentToken;
    }
}
