package ateAugumaCosia;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SurpresaMaisUmContadorDeNumero {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Ate que numero você quer que eu conte");
        double fim= x.nextFloat();
        System.out.println("De quantos em quantos numeros você quer que eu conte");
        double pulo = x.nextFloat();
        System.out.println("Você quer que eu comesse de qual numero");
        double inici = x.nextFloat();
        for (double c = inici; c <= fim; c = c + pulo) {
            System.out.printf("%.1f \n" ,c);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Deu erro");
            }
        }
    }
}
