package equacaoDoSegundoGral;

import java.util.Scanner;

public class EquacaoDoSugundoGral {
    public static void main(String[] args) {
        Scanner total = new Scanner(System.in);
        System.out.println("Qual o valos de A ?");
        float a = total.nextFloat();
        if (a == 0){
            System.out.println("Não existe equação do segundo gral se X² e igual a zero");
            System.exit(1);
        }
        System.out.println("Qual o valor de B ?");
        float b = total.nextFloat();
        System.out.println("Qual o valor de C ?");
        float c = total.nextFloat();
        double Del = (b * b) - 4 * a *c;
        if (Del < 0){
            System.out.println("O valor de Delta e negativo logo não a raiz real.O valor de Delta e " +Del);
            System.exit(1);
        }
        double DelR = Math.sqrt(Del);
        double x1 = ((-b) + DelR) / (2 * a);
        double x2 = ((-b) - DelR) / (2 * a);
        if (Del == 0){
            System.out.println("O valor de Delta e 0 logo temos uma raiz apenas " +x1);
        }
        System.out.println("O valor de X1 e " +x1);
        System.out.println("O valor de X2 e " +x2);
    }
}
