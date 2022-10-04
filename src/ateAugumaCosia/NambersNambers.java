package ateAugumaCosia;

import java.util.Scanner;

public class NambersNambers {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        float c = 1;
        float tp = 0;
        float ti = 0;
        float ac = 0;
        System.out.println("Você que contar quantos numeros");
        float v = x.nextFloat();
        while (c <= v) {
            System.out.println("digite um numero");
            float a = x.nextFloat();
            if (a % 2 == 0) {
                tp++;
            }
            if (a % 2 != 0) {
                ti++;
            }
            if (a > 100) {
                ac++;
            }
            c++;
        }
        System.out.println("Total de pares " + tp);
        System.out.println("Total de impares " + ti);
        System.out.println("Total acima de cem " + ac);
    }
}
