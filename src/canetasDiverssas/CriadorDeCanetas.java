package canetasDiverssas;

import java.util.Scanner;

public class CriadorDeCanetas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas caneta você quer fazer?");
        int quantc = sc.nextInt();
        String[] model = new String[quantc];
        String[] corr = new String[quantc];
        float[] pont = new float[quantc];
        int[] carg = new int[quantc];
        for (int c = 0; c < quantc; c++) {
            System.out.printf("Qual o modelo da %d° caneta \n" ,c + 1);
            String M = sc.nextLine();
            model[c] = M;
            System.out.printf("Qual a cor da %d° caneta \n" ,c + 1);
            String C = sc.nextLine();
            corr[c] = C;
            System.out.printf("Qual o tipo de ponta da %d° cameta \n" ,c + 1);
            float P = sc.nextFloat();
            pont[c] = P;
            System.out.printf("Quanto de carga a caneta %D° tem" ,c + 1);

        }
    }
}
