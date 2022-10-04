package desafios;

import java.awt.*;

public class SuaTela {
    public static void main(String[] args) {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.print("Sua tela mede ");
        System.out.println(size.toString());
    }

}
