package abaMatematica;

import java.util.Scanner;

public class CauculadoraSimples {
    public static void main(String[] args) {
        Scanner cauculo = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("AVISO CAUCULADORA APENAS");
        System.out.println(" PARA CAUCULOS SIMPLES ");
        System.out.println("------------------------");
        System.out.println("---Qual o tipo de cauculo que você quer fazer ?---");
        System.out.println("1[adição] 2[subitração] 3[multiplicação] 4[divisão]");
        float a = cauculo.nextFloat();
        if (a == 1){
            System.out.println("--Digite os dois numeros pra a soma--");
            System.out.println("----------primeiro-numero------------");
            float so = cauculo.nextFloat();
            System.out.println("-----------sugundo-numero------------");
            float so2 = cauculo.nextFloat();
            float soma = (so + so2);
            System.out.format("O rusultado da soma e %.1f \n" ,soma);
            System.exit(1);
        }
        if (a == 2){
            System.out.println("--Digite os dois numeros pra a subtração--");
            System.out.println("-------------primeiro-numero--------------");
            float su = cauculo.nextFloat();
            System.out.println("--------------sugundo-numero--------------");
            float su2 = cauculo.nextFloat();
            float sub = (su - su2);
            System.out.format("O rusultado da subitração e %.1f \n" ,sub);
            System.exit(1);
        }
        if (a == 3){
            System.out.println("--Digite os dois numeros pra a multiplicação--");
            System.out.println("---------------primeiro-numero----------------");
            float mu = cauculo.nextFloat();
            System.out.println("----------------sugundo-numero----------------");
            float mu2 = cauculo.nextFloat();
            float mult = (mu * mu2);
            System.out.format("O rusultado da multiplição e %.1f \n" ,mult);
            System.exit(1);
        }
        if (a == 4){
            System.out.println("--Digite os dois numeros pra a divisão--");
            System.out.println("------------primeiro-numero-------------");
            float di = cauculo.nextFloat();
            System.out.println("-------------sugundo-numero-------------");
            float di2 = cauculo.nextFloat();
            if (di == 0 && di2 == 0) {
                System.out.println("---ERRO---");
                System.exit(1);
            }
            float divi = (di / di2);
            System.out.format("O rusultado da divisão e %.1f \n" ,divi);
            float rest = (di % di2);
            System.out.format("E o resto e %.1f \n" ,rest);
            System.exit(1);
        }
    }
}
