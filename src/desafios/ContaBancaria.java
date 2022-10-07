package desafios;

import java.awt.*;
import java.util.Scanner;

public class ContaBancaria {
    private int numConta;
    private String tipo;
    private String dono;
     private float saldo;
     public void maisSaldo() {
         Scanner sc = new Scanner(System.in);
         System.out.println("qual o valor a depositar");
         float dep = sc.nextFloat();
         this.saldo += dep;
     }
     public void menosSaldo() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Antes de retira digite o numero de conta");
         int co = sc.nextInt();
         if (co == this.numConta) {
             System.out.println("qual o valor a ser retirado");
             float dep = sc.nextFloat();
             this.saldo -= dep;
         }
         else {
             System.out.println("descupe mas vc errou o numero");
         }
     }
     public void status() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Antes de exibir os estatus digite o numero de sua conta");
         int co = sc.nextInt();
         if (co == this.numConta) {
             System.out.println("o numero dessa conta e " + this.numConta);
             System.out.println("o tipo da conta e " + this.tipo);
             System.out.println("o dono da conta e " + this.dono);
             System.out.println("o saldo da conta e de " + this.saldo);
         }
         else {
             System.out.println("descupe mas vc errou o numero");
         }
     }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
}
