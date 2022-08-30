package ateQueNumber;

import java.security.Signature;
import java.util.Scanner;

public class AteQueNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Ate qual numero você quer que eu conte ?");
        float N = n.nextFloat();
        float x = 0;
        do {
            System.out.println(x);
            x = x + 1;
        }while (x < N);
    }
}
