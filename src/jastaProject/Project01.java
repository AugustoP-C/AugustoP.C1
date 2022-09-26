package jastaProject;

import java.util.Arrays;

import java.util.Scanner;

public class Project01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|---------AVISO----------|");
        System.out.println("|--Escreva-em-minusculo--|");
        System.out.println("|-----Sem-abreviasões----|");
        System.out.println("|---------AVISO----------|");
        System.out.println("|-----Qual-seu-nome-?----|");
        String nome = sc.nextLine();
        String[] nomes = nome.split(" ");
        nomes[1].length();
        if (nomes[0].length() != 2 && !nomes[0].equals("sá")) {

        }
    }
}
