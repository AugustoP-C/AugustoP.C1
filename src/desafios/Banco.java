package desafios;

public class Banco {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();

        c1.setDono("jubileu");
        c1.maisSaldo();
        c1.setTipo("Poupanssa");
        c1.setNumConta(377);

        c2.setDono("claudete");
        c2.maisSaldo();
        c2.setTipo("Corrente");
        c2.setNumConta(139);
    }
}
