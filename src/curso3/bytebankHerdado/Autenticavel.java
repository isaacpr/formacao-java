package curso3.bytebankHerdado;

public abstract interface Autenticavel {
    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
