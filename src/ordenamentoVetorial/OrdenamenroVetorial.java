package ordenamentoVetorial;

import java.util.Arrays;

import java.util.Scanner;

public class OrdenamenroVetorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|-------{}------------------{}----------|");
        System.out.println("|--------Organizador-De-Vetores---------|");
        System.out.println("|----------Digite-dez-numeros-----------|");
        System.out.println("|-------{}-------------------{}---------|");
        float[] vetor = new float[10];
        for (int c = 0; c < 10; c++){
            System.out.printf("Digite o %d° numero %n" ,c + 1);
            float a = sc.nextFloat();
            sc.nextLine();
            vetor[c] = a;
        }
        System.out.println("|----{}--Quer-trocar-algum-valor-{}-----|");
        System.out.println("|----{}-----Sim-[s]--Não-[n]-----{}-----|");
        String x = sc.nextLine();
        if ("s".equals(x)) {
            System.out.println("|--Qual-o-lugar-que-você-quer-trocar-?--|");
            int t = sc.nextInt();
            int T = t - 1;
            System.out.println("|------Qua-o-valor-novo-do-lugar-" + t + "------|");
            float t2 = sc.nextFloat();
            vetor[T] = t2;
        }
        System.out.println("|--{}-----Seu-vetor-ficou-asim------{}--|");
        Arrays.sort(vetor);
        for (float d: vetor) {
            System.out.printf("%.0f \n" ,d);
        }
    }
}
