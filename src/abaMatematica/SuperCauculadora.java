package abaMatematica;

import java.util.Scanner;

public class SuperCauculadora {
    public static void main(String[] args) {
        Scanner total = new Scanner(System.in);
        System.out.println("(---------------------------------)");
        System.out.println("(--------DIGITE-UM-NUMERO---------)");
        System.out.println("(---------------------------------)");
        float a = total.nextFloat();
        float r = (a % 2);
        System.out.println("--RESTO-DA-DIVISÃO-POR-2-" +r);
        double el = Math.pow(a,4);
        System.out.println("--ELEVADO-AO-CUBO-" +el);
        double ra = Math.sqrt(a);
        System.out.println("--RAIZ-QUADRADA-" +ra);
        double rc = Math.cbrt(a);
        System.out.println("--RAIZ-CUBICA-" +rc);
        float vb = Math.abs(a);
        System.out.println("--VALOR-ABSOLUTO-" +vb);
        System.out.println("(--------------F-I-M--------------)");
    }
}
