package desafios;

import desafios.Caneta;

public class CriadorDeCanetas {
    public static void main(String[] args) {
        desafios.Caneta c1 = new desafios.Caneta();
        desafios.Caneta c2 = new desafios.Caneta();
        desafios.Caneta c3 = new desafios.Caneta();
        desafios.Caneta c4 = new Caneta();

        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.modelo = "bic esperogrfica";
        c1.destampar();

        c2.cor = "Preta";
        c2.ponta = 1f;
        c2.modelo = "bic esperogrfica";
        c2.destampar();

        c3.cor = "Verde";
        c3.ponta = 1f;
        c3.modelo = "bic esperogrfica";
        c3.tampar();

        c4.cor = "Vermelho";
        c4.ponta = 1f;
        c4.modelo = "bic esperogrfica";
        c4.tampar();

        c1.status();
        System.out.println("");
        c2.status();
        System.out.println("");
        c3.status();
        System.out.println("");
        c4.status();
        System.out.println("");

        c2.escrever();
        c1.rabiscar();
    }
}
