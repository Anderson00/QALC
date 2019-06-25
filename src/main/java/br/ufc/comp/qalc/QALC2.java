package br.ufc.comp.qalc;

import br.ufc.comp.qalc.ast.QALCLexer;
import br.ufc.comp.qalc.ast.QALCParser;
import br.ufc.comp.qalc.ast.QALCTranslate;
import br.ufc.comp.qalc.frontend.ast.Parse;
import br.ufc.comp.qalc.symbols.Symbol;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

public class QALC2 {

    public static void main(String args[]){

        try {
            CharStream stream = CharStreams.fromFileName("test.qalc");
            QALCLexer lexer = new QALCLexer(stream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            QALCParser parser = new QALCParser(tokenStream);
            QALCParser.ParseContext ctx = parser.parse();

            Parse parse = new Parse();
            QALCTranslate translate = new QALCTranslate(parse);
            translate.visitParse(ctx);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
