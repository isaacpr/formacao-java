package curso7.br.com.bytebank.banco.test;

import curso7.br.com.bytebank.banco.modelo.Cliente;
import curso7.br.com.bytebank.banco.modelo.ContaCorrente;
import curso7.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {
    public static void main(String[] args) {
        Object[] referencias = new Object[5];

        System.out.println(referencias.length);

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        ContaPoupanca ref = (ContaPoupanca) referencias[1];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
    }
}
