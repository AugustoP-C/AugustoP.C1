package cauculadoraiddade;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CauculadoraIdade {

    public static void main(String[] args) {
        Scanner total = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");
        Date date = new Date();
        int years = date.getYear();
        int days = date.getDay();
        int month = date.getMonth();
        int currentYear = years + 1900;
        System.out.println(format.format(date));
        System.out.println("Qual o ano que vc nasceu ?");
        short a = total.nextShort();
        System.out.println("Qual o mes que vocé nasceu ?");
        short m = total.nextShort();
        System.out.println("Qual o dia que vocé nasceu ?");
        short d = total.nextShort();
        float b = currentYear - a;
        if (b >= currentYear){
            System.out.println("vc e maior de idade");
        }
        if (month <= m){
            float x = b - 1;
            System.out.format("Você tem %.0f anos \n" ,x);
            System.exit(1);
        }
        if (days <= d){
            float z = b - 1;
            System.out.format("Você tem %.0f anos \n" ,z);
            System.exit(1);
        }
        System.out.format("Você tem %.0f anos \n" ,b);
        System.exit(1);
    }
}
