package horaDoSistema ;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:SS");
        System.out.print("A hora do sistema e ");
        System.out.println(format.format(relogio));
    }
}
