package tessauro;
import java.io.*;

import tessauro.lexer.*;
import tessauro.node.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			String arquivo = "source_samples/T02/Grupo 13/teste_01.trex";

			Lexer lexer =
					new Lexer(
							new PushbackReader(  
									new FileReader(arquivo), 1024)); 
			Token token;
			while(!((token = lexer.next()) instanceof EOF)) {
				System.out.print(token.getClass());
				System.out.println(" ( "+token.toString()+")");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}