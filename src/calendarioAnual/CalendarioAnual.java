package calendarioAnual;

import java.util.Scanner;

public class CalendarioAnual {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Em qual anos nos estamos");
        float ano = x.nextFloat();
        if (ano % 4 == 0 && ano % 4 == 0 && ano % 4 == 0) {
            String[] mes2 = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
            float[] dia2 = {31, 29, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31};
            System.out.println("Veja a quantidades de dias que tem cada mes");
            for (float c = 0; c <= mes2.length; c++) {
                System.out.println("O mes de " + mes2[(int) c] + " tem " + dia2[(int) c] + " dias");
            }
        }
        else {
            String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
            float[] dia = {31, 28, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31};
            System.out.println("Veja a quantidades de dias que tem cada mes");
            for (float c = 0; c <= mes.length; c++) {
                System.out.println("O mes de " + mes[(int) c] + " tem " + dia[(int) c] + " dias");
            }
        }
    }
}
