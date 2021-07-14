package curso1.condicionais;

public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("testando curso1.condicionais");

        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado;

        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        if (idade >= 18 || acompanhado) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("infelizmente voce nao pode entrar");
        }
    }
}