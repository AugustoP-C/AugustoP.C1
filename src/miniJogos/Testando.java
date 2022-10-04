package miniJogos;

import java.util.Scanner;

public class Testando {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String ac1 = ("erro");
        String ac2 = ("erro");
        String ac3 = ("erro");

        System.out.println("Mano eu tenho tres numeros pra tu adivinhar");
        System.out.println("Dai você digita tres numeros e eu falo se ta certo e te dou dicas");
        System.out.println("Primeiro uma pessoa digita tres numeros sem você ver");
        float a = x.nextFloat();
        float b = x.nextFloat();
        float c = x.nextFloat();
        x.nextLine();

        System.out.println("Ta agora digite tres dicas");
        String d1 = x.nextLine();
        String d2 = x.nextLine();
        String d3 = x.nextLine();

        System.out.println("Pronto agora vc pode adivinhar");
        System.out.println("Mas antes as tres dicas");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        float N1 = x.nextFloat();
        float N2 = x.nextFloat();
        float N3 = x.nextFloat();
        x.nextLine();

        if (N1 == a && N2 == b && N3 == c) {
            System.out.println("Caramba de primeira parabes ");
            System.exit(1);
        }
        if (N1 == a) {
            System.out.println("nossa vc acertou o primeiro");
            ac3 = ("acertou");
        }
        if (N2 == b) {
            System.out.println("nossa vc acertou o segundo");
            ac2 = ("acertou");
        }
        if (N3 == c) {
            System.out.println("nossa vc acertou o terceiro");
            ac3 = ("acertou");
        }

    }
}
