package fatorial12;

import java.util.Scanner;

public class Fatorial12 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Fala um numero de 1 a 12 pra e faser o fatorial");
        float n = f.nextFloat();
        if (n == 1) {
            float f0 = 1;
            System.out.println("O fatirial de 1 e " +f0);
            System.exit(1);
        }
        if (n == 2) {
            float f1 = 2;
            System.out.println("O fatorial de 2 e " +f1);
            System.exit(1);
        }
        if (n == 3) {
            float f2 = 3 * 2;
            System.out.println("o fatorial de 3 e " +f2);
            System.exit(1);
        }
        if (n == 4) {
            float f3 = 4 * 3 * 2;
            System.out.println("O fatorial de 4 e " + f3);
            System.exit(1);
        }
        if (n == 5) {
            float f4 = 5 * 4 * 3 * 2;
            System.out.println("O fatoruial de 5 e " +f4);
            System.exit(1);
        }
        if (n == 6) {
            float f5 = 6 * 5 * 4 * 3 * 2;
            System.out.println("O fatorial de 6 e " +f5);
            System.exit(1);
        }
        if (n == 7) {
            float f6 = 7 * 6 * 5 * 4 * 3 * 2;
            System.out.println("O fatorial de 7 e " +f6);
            System.exit(1);
        }
        if (n == 8) {
            float f7 = 8 * 7 * 6 * 5 * 4 * 3 * 2;
            System.out.println("O fatorial de 8 e " +f7);
            System.exit(1);
        }
        if (n == 9) {
            float f8 = 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2;
            System.out.println("O fatorial de 9 e " +f8);
            System.exit(1);
        }
        if (n == 10) {
            float f9 = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2;
            System.out.println("O fatorial de 10 e " +f9);
            System.exit(1);
        }
        if (n == 11) {
            float f1a = 11 * 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2;
            System.out.println("O fatorial de 11 e " +f1a);
        }
        if (n == 12) {
            float f1b = 12 * 11 * 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2;
            System.out.println("O fatorial de 12 e " +f1b);
        }
    }
}
