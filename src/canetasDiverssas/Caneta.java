package canetasDiverssas;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("O modelo e " + this.modelo);
        System.out.println("A ponta e " + this.ponta);
        System.out.println("Esta com " + this.carga + "% de carga");
    }
    void  rabiscar() {
        if (tampada == true) {
            System.out.println("ERRO");
        }
        else {
            System.out.println("Rabisco");
        }
    }
    void tampar() {
        tampada = true;
    }
    void destampar() {
        tampada = false;
    }
}
