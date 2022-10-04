package desafios;

import desafios.Caneta;

import java.util.concurrent.Callable;

public class CriadorDeCanetas {
    public static void main(String[] args) {
        Caneta c = new Caneta("BIC", "Azul", 0.5f);
        Caneta c2 = new Caneta("BIC", "Preta", 0.5f);
        Caneta c3 = new Caneta("BIC", "Verde", 1f);
        Caneta c4 = new Caneta("BIC", "Vermelha", 1f);

        c.destampar();
        c2.destampar();

        c.status();
        System.out.println("");
        c2.status();
        System.out.println("");
        c3.status();
        System.out.println("");
        c4.status();
        System.out.println("");

        c.escrever();
        c2.rabiscar();
    }
}
