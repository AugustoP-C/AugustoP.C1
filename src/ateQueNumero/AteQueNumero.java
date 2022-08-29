package ateQueNumero;

import java.util.Scanner;

public class AteQueNumero {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Quantas cambalhotas você quer que eu de ?");
        int c = v.nextInt();
        int f = 1;
        while (f <= c){
            System.out.println("cambalhota " +f);
            f++;
        }
    }
}
