package curso5.br.com.alura.bytebank;

import curso5.br.com.bytebank.banco.modelo.Conta;
import curso5.br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {
    public static void main(String[] args) {
        Conta c = new ContaCorrente(123, 321);

        c.deposita(200.3);

        System.out.println(c.getSaldo());
    }
}
