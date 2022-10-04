package abaMatematica;

import newFatorial12.Fatorial;

import java.util.Scanner;

public class NewFatorial12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        newFatorial12.Fatorial f = new Fatorial();
        System.out.println("digite um numero");
        float nu = sc.nextFloat();
        f.setValor(nu);
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
    }
}
