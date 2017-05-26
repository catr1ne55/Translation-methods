import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by vladimir on 20.05.17.
 */
public class Compiler {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("No input file specified.");
            return;
        }
        try {
            InputStream inputStream = new FileInputStream(new File(args[0]));
            CharStream charStream = new ANTLRInputStream(inputStream);
            JavaLexer lexer = new JavaLexer(charStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            JavaParser parser = new JavaParser(tokenStream);
            JavaParser.CompilationUnitContext context = parser.compilationUnit();
            System.out.println(context.bytecode);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
