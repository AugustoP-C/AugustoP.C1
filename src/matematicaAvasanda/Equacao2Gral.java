package matematicaAvasanda;

import java.awt.*;
import java.util.Scanner;

public class Equacao2Gral {
    public double x1(float a, float b, float c) {
        if (a == 0) {
            System.out.println("Não existe equação do segundo gral se X² e igual a zero");
            System.exit(1);
        }
        double Del = (b * b) - 4 * a * c;
        if (Del < 0) {
            System.out.println("O valor de Delta e negativo logo não a raiz real.O valor de Delta e " + Del);
            System.exit(1);
        }
        double DelR = Math.sqrt(Del);
        return ((-b) + DelR) / (2 * a);
    }
    public double x2(float a,float b,float c) {
        if (a == 0) {
            System.out.println("Não existe equação do segundo gral se X² e igual a zero");
            System.exit(1);
        }
        double Del = (b * b) - 4 * a * c;
        if (Del < 0) {
            System.out.println("O valor de Delta e negativo logo não a raiz real.O valor de Delta e " + Del);
            System.exit(1);
        }
        double DelR = Math.sqrt(Del);
        return ((-b) - DelR) / (2 * a);
    }

    public double Delta(float a, float b, float c) {
        double Del = (b * b) - 4 * a * c;
        if (a == 0) {
            System.out.println("Não existe equação do segundo gral se X² e igual a zero");
            System.exit(1);
        }
        if (Del < 0) {
            System.out.println("O valor de Delta e negativo logo não a raiz real.O valor de Delta e " + Del);
            System.exit(1);
        }
        return Del;
    }
    public void Baskara(float a, float b, float c) {
        if (a == 0) {
            System.out.println("Não existe equação do segundo gral se X² e igual a zero");
            System.exit(1);
        }
        double Del = (b * b) - 4 * a * c;
        double DelR = Math.sqrt(Del);
        double x1 = ((-b) + DelR) / (2 * a);
        double x2 = ((-b) - DelR) / (2 * a);
        if (Del < 0) {
            System.out.println("O valor de Delta e negativo logo não a raiz real.O valor de Delta e " + Del);
            System.exit(1);
        } else if (Del == 0) {
            System.out.println("O valor de Delta e zero logo temos duas raizes iguais " + x1);
            System.exit(1);
        }
        System.out.println("O resultado de X1 e " + x1);
        System.out.println("O resultado de X2 e " + x2);
        System.out.println("O valor de Delta e " + Del + " e da raiz de Delta e " + DelR);
    }
}