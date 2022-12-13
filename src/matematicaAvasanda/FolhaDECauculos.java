package matematicaAvasanda;

public class FolhaDECauculos {
    public static void main(String[] args) {
        Equacao2Gral bas = new Equacao2Gral();
        Funcao2Gral fun = new Funcao2Gral();

        bas.Baskara(4f, 4f, 0f);
        System.out.println(fun.PontosCartesiano(4f, 4f, 0f));
        System.out.println("");
        fun.Indicasoes(4f, 4f, 0f);
    }
}
