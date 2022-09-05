package descubraONumero;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DescubraONumero {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("de um(1) a dez (10) qual o numero que eu to penssando");
        float N = x.nextFloat();
        double n = (5 + Math.random() * (10 - 5));
        double n2 = Math.floor(n);
        if (N == n2) {
            System.out.println("Caraca você e bom mermo em adivinhaçao");
        }
        else {
            System.out.println("putz bixo tu errou feio");
            System.out.println(n2);
        }
    }
}
