package desafios;

import java.util.Scanner;

public class Caneta {
    public Caneta(String modelo, String cor, float ponta) {
        this.setPonta(ponta);
        this.setModelo(modelo);
        this.carga = 100;
    this.setCor("Azul");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public float ponta;
    public String modelo;
    public String cor;
    private int carga;
   private boolean tampada;
    public void status() {
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
    public void escrever() {
        Scanner sc = new Scanner(System.in);

        if (this.tampada == true) {
            System.out.println("A caneta ta tampada");
        }
        else {
            System.out.println("Pode escrever");
            String texto = sc.nextLine();
            if (texto.equals("augustolindoperfeito")) {
                System.out.println("parabens vc achou um esteregg");
                System.out.println("^~^~^~^~^~^~^~^~^~^~^~^~^~^~^");
            }
            else {
                System.out.println(texto);
            }
        }
    }
    public void  rabiscar() {
        if (this.tampada == true) {
            System.out.println("A caneta ta tampada");
        }
        else {
            System.out.println("Rabiscando");
            System.out.println("//--__//__--|||||////_______--------");
        }
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
}
