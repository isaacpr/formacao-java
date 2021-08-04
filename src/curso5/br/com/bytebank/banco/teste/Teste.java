package curso5.br.com.bytebank.banco.teste;

import curso5.br.com.bytebank.banco.modelo.Cliente;
import curso5.br.com.bytebank.banco.modelo.ContaCorrente;
import curso5.br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
    public static void main(String[] args) {
        Object cc = new ContaCorrente(22, 33);
        Object cp = new ContaPoupanca(33, 22);
        Object cliente = new Cliente();

        System.out.println(cc.toString());
        System.out.println(cp);

        println(cc);
    }

    static void println() {
    }

    static void println(int a) {
    }

    static void println(boolean valor) {
    }

    static void println(Object referencia) {
    }
}
