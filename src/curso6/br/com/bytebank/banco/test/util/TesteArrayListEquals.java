package curso6.br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import curso6.br.com.bytebank.banco.modelo.Conta;
import curso6.br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 22);
        boolean existe = lista.contains(cc3);

        System.out.println("Já existe? " + existe);

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
