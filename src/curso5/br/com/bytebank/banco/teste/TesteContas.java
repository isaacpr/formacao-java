package curso5.br.com.bytebank.banco.teste;

import curso5.br.com.bytebank.banco.modelo.ContaCorrente;
import curso5.br.com.bytebank.banco.modelo.ContaPoupanca;
import curso5.br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente outra = null;

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }
}
