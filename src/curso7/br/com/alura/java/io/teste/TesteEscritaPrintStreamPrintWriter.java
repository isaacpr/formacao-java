package curso7.br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {
        PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println();
        ps.println();
        ps.println("asfasdfsafdas dfs sdf asf assdß");

        ps.close();

        System.out.println();
    }
}
