import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dhawal Soni on 4/19/2016.
 */
public class TreeGenerator {
    public static void main(String[] args) throws Exception{
        if(!args[0].contains(".djp")){
            throw new Exception("The format of file is invalid");
        }
        String fileName = args[0];
        ANTLRInputStream ais = new ANTLRFileStream(fileName);
        DJPLexer lexer = new DJPLexer(ais);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        DJPParser parser = new DJPParser(cts);
        parser.setErrorHandler(new BailErrorStrategy());
        try{
            ParseTree parseTree = parser.body();
            //Generate Tree
            //showTree(fileName);
            new MyCompiler(fileName).visit(parseTree);
        } catch(Exception e){
            e.printStackTrace();
        }

    }
    public static void showTree(String filename) throws IOException {
        final CharStream stream = new ANTLRFileStream(filename);
        final DJPLexer lexer = new DJPLexer(stream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final DJPParser parser = new DJPParser(tokens);
        final ParseTree tree = parser.body();
        final List<String> ruleNames = Arrays.asList(DJPParser.ruleNames);
        final TreeViewer view = new TreeViewer(ruleNames, tree);
        view.open();
    }
}
