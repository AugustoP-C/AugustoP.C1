package desafios;

import java.util.Scanner;

public class ContaBancaria {
    // atribuidores
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //metodos especiasi
    public ContaBancaria(float sal,boolean con) {
        this.saldo = sal;
        this.status = false;
    }
    //metodos comum
    public void abrirConta(String tip,boolean stat) {
        setTipo(tip);
        setStatus(stat);
        if (tip == "cc") {
            this.saldo = 50;
        }
        if (tip =="cp") {
            this.saldo = 150;
        }
    }
    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Essa conta ainda tem dinhairo");
        }
        if (this.saldo < 0) {
            System.out.println("Você ainda ta devendo");
        }
        setStatus(false);
    }
    public void depositar(float dep) {
        if (this.status == true) {
            setSaldo(getSaldo() + dep);
        }
        else {
            System.out.println("Não pode depositar con a conta fachada");
        }
    }
    public void sacar(float sac) {
        if (this.status == true) {
            if (this.saldo > sac) {
                this.saldo -= sac;
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Não pode sacar pois a conta esta sem dinheiro");
        }
    }
    public void pagarMensal() {
        float mens = 0;
        if (this.tipo.equals("cc")) {
            mens = 12;
        }
        if (this.tipo.equals("cp")) {
            mens = 20;
        }
        if (this.status == true) {
            if (this.saldo > mens) {
                this.saldo -= mens;
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Ipossivel pagar com a conta fachada");
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean stat) {
        this.status = stat;
    }

    //metodos geters e seters
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float sal) {
        this.saldo = sal;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String don) {
        this.dono = don;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tip) {
        this.tipo = tip;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numC) {
        this.numConta = numC;
    }
}
