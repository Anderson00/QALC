package br.ufc.comp.qalc.frontend;

import br.ufc.comp.qalc.ResourcesManager;

import java.io.*;

/**
 * Representa a fonte de caracteres de entrada, de onde o Analisador Léxico
 * {@link Scanner} deve ler.
 * <p>
 * O construtor desta classe garante que os objetos sejam inicializados
 * em um estado de pronto-processamento. Isso quer dizer que {@link #getCurrentChar()}
 * retorna dados válidos desde a primeira chamada.
 */
public class Source {

    /**
     * Representação interna do caractere "fim-de-arquivo"
     */
    public static final char EOF = (char) 0;

    /**
     * Leitor dos dados de entrada
     */
    private BufferedReader reader;
    private BufferedReader futureReader;
    private File readFrom;

    /**
     * Mantém informação sobre a linha que está sendo lida.
     */
    private long currentLine;
    private long futureLine;
    /**
     * Mantém informação de qual posição, dentro da linha atual, o último caractere lido ocupa.
     */
    private long currentColumn;
    private long futureColumn;
    /**
     * Mantém informação de qual posição, globalmente, o último caractere lido ocupa.
     */
    private long currentPosition;
    private long futurePosition;

    /**
     * Mantém o último caractere lido
     */
    private char currentChar;
    private char futureChar;

    private long totalBytes;

    /**
     * Constrói uma fonte de caracteres.
     * <p>
     * Inicialmente, nenhum caractere é lido.
     *
     * @param readFrom o fluxo de dados de entrada.
     * @throws IOException Caso a inicialização ou a leitura do fluxo falhe.
     */
    public Source(File readFrom) throws IOException {
        this.currentLine = 1;
        this.currentColumn = 0;
        this.currentPosition = 0;
        this.futureColumn = 0;
        this.futureLine = 1;
        this.futurePosition = 0;
        this.readFrom = readFrom;

        this.reader = new BufferedReader(new InputStreamReader(new FileInputStream(readFrom)));
        this.futureReader = new BufferedReader(new InputStreamReader(new FileInputStream(readFrom)));

        ResourcesManager.manage(this.reader);
        advance();
    }

    /**
     * Avança a leitura, extraindo o próximo caractere da entrada.
     *
     * @return Caractere lido ou {@link #EOF} caso a entrada tenha acabado.
     * @throws IOException Caso a leitura falhe.
     */
    public char advance() throws IOException {
        final int nextChar = reader.read();
        futureReader.read();

        if (nextChar > 0) {
            this.currentChar = (char) nextChar;
            this.futureChar = (char)  nextChar;
            totalBytes++;

            ++this.currentPosition;
            ++this.futurePosition;

            if (nextChar == '\n') {
                ++this.currentLine;
                ++this.futureLine;
                this.currentColumn = 0;
                this.futureColumn = 0;
            } else {
                ++this.currentColumn;
                ++this.futureColumn;
            }
        } else {
            this.currentChar = EOF;
            this.futureChar = EOF;
        }

        return this.currentChar;
    }

    public char advanceFuture() throws IOException{
        final int nextChar = futureReader.read();

        if (nextChar > 0) {
            this.futureChar = (char) nextChar;

            ++this.futurePosition;

            if (nextChar == '\n') {
                ++this.futureLine;
                this.futureColumn = 0;
            } else {
                ++this.futureColumn;
            }
        } else {
            this.futureChar = EOF;
        }

        return this.futureChar;
    }

    public void adjustFuture() throws IOException{
        this.currentChar = this.futureChar;
        this.currentColumn = this.futureColumn;
        this.currentLine = this.futureLine;

        this.reader.skip(this.futurePosition - this.currentPosition);

        this.currentPosition = this.futurePosition;
    }

    public void resetFuture() throws IOException{
        this.futureReader.close();
        this.futureReader = new BufferedReader(new InputStreamReader(new FileInputStream(readFrom)));
        this.futureReader.skip(totalBytes);

        this.futureChar = this.currentChar;
        this.futureLine = this.currentLine;
        this.futureColumn = this.currentColumn;
        this.futurePosition = this.currentPosition;
    }

    /**
     * Obtém o último caractere lido.
     *
     * @return O último caractere lido.
     */
    public char getCurrentChar() {
        return this.currentChar;
    }

    /**
     * Obtém o número de linha do último caractere lido.
     *
     * @return Linha do último caractere lido.
     */
    public long getCurrentLine() {
        return this.currentLine;
    }

    /**
     * Obtém a posição relativa à linha do último caractere lido.
     *
     * @return Posição relativa à linha do último caractere lido.
     */
    public long getCurrentColumn() {
        return currentColumn;
    }

    /**
     * Obtém a posição relativa à entrada do último caractere lido.
     *
     * @return Posição relativa à entrada do último caractere lido.
     */
    public long getCurrentPosition() {
        return currentPosition;
    }

    public char getFutureChar() {
        return this.futureChar;
    }
    public long getFutureLine() {
        return this.futureLine;
    }
    public long getFutureColumn() {
        return this.futureColumn;
    }

    /**
     * Encerra a leitura e fecha a entrada.
     *
     * @throws IOException caso ocorra um erro ao fechar a entrada.
     */
    public void close() throws IOException {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                throw ex;
            }
        }
    }
}
