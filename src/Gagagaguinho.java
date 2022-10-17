import java.io.File;

import java.util.Arrays;

import java.util.Scanner;

public class Gagagaguinho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|-----Qual-seu-nome-?----|");
        String nome = sc.nextLine();
        String nomeCapitalizado = capitaliza(nome);
        System.out.println(nomeCapitalizado);
    }

    private static String capitaliza(String nome) {
        nome = nome.toLowerCase();
        String[] nomes = nome.split(" ");
        int n = nomes.length;
        int n2 = nomes.length;
        String nomeret = "";
        for (int c = 0; c < n; c++){
                nomeret += " " + nomes[c] + " " + nomes[c] + " " + nomes[c] + " " + nomes[c];
        }
        return nomeret;
    }
}

