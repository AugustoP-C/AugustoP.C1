package nambersNambers;

import java.util.Scanner;

public class NambersNambers {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        float c = 0;
        float tp = 0;
        float ti = 0;
        float ac = 0;
        System.out.println("Você que contar quantos numeros");
        float v = x.nextFloat();
        do {
            System.out.println("Digite um numero");
            float a = x.nextFloat();
            if (a % 2 == 0) {
            tp++;
            }
            if (a % 2 != 0) {
            ti++;
            }
            if (a < 100) {
            ac++;
            }
            float m = a;
            float M = m + a;
            c++;
        }while (c == v);
    }
}
