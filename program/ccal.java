import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.FileInputStream;
import java.io.InputStream;

//this program is taken from CA4003 lecture on draw example, with minor changes so it works with the ccal language.

public class ccal
{
    public static void main (String[] args) throws Exception
    {
        String inputFile = null;
        
        if(args.length > 0)
            inputFile = args[0];
        
            InputStream input_stream = System.in;
            if(inputFile != null)
                input_stream = new FileInputStream(inputFile);
            
            ccalLexer lexer = new ccalLexer (CharStreams.fromStream (input_stream));
            CommonTokenStream tokens = new CommonTokenStream (lexer);
            ccalParser parser = new ccalParser (tokens);
            ParseTree tree = parser.program();

            System.out.println(tree);
    }
}
