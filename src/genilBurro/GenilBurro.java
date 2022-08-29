package genilBurro;

import java.util.Scanner;

public class GenilBurro {
    public static void main(String[] args) {
        Scanner total = new Scanner(System.in);
        double n = 1 + Math.random() * (6 - 1);
        int v = (int) n;
        System.out.println("|De um a cinco qual numero que eu to penssado ?|");
        System.out.println("|                     //                       |");
        System.out.println("|                    ____                      |");
        System.out.println("|                   (0--0)                     |");
        System.out.println("|                 ____||____                   |");
        System.out.println("|                     ||                       |");
        System.out.println("|                  ___||___                    |");
        System.out.println("|                  ||    ||                    |");
        System.out.println("|                  ||    ||                    |");
        System.out.println("|                |__|    |__|                  |");
        int m = total.nextInt();
        if (m > 5) {
            System.out.println("HAHAHHAHAHAHAAHAHAH seu burro e so de 1 a 5");
            System.exit(1);
        }
        if (v == m) {
            System.out.println("Parabens vc acertou o numero que eu tava penssando " + m);
            System.exit(1);
        } else {
            System.out.println("HAHAHAHAHAHAHAHA você errou seu burro o numero que eu tava pesando era " + v);
            System.exit(1);
        }
    }
}
