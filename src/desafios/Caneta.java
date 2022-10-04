package desafios;

import java.util.Scanner;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    private int carga = 100;
   private boolean tampada;
    void status() {
        String tp = "destampada";
        if (tampada == true) {
            tp = "tampada";
        }
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Esta tampada? " + tp);
        System.out.println("O modelo e " + this.modelo);
        System.out.println("A ponta e " + this.ponta);
        System.out.println("Esta com " + this.carga + "% de carga");
    }
    void escrever() {
        Scanner sc = new Scanner(System.in);
        if (this.tampada == true) {
            System.out.println("A caneta ta tampada");
        }
        else {
            System.out.println("Pode escrever");
            String texto = sc.nextLine();
            System.out.println(texto);
        }
    }
    void  rabiscar() {
        if (this.tampada == true) {
            System.out.println("A caneta ta tampada");
        }
        else {
            System.out.println("Rabiscando");
            System.out.println("//--__//__--|||||////_______--------");
        }
    }
    void tampar() {
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }
}
