package matematicaAvasanda;

public class Funcao2Gral {
    public double VerticeX(float a, float b, float c) {
        Equacao2Gral sigma = new Equacao2Gral();
        double Del = sigma.Delta(a,b,c);
        return -Del / (4 * a);
    }
    public double VerticeY(float a,float b, float c) {
        return -b / (2 * a);
    }
    public double[] PontosCartesiano(float a, float b, float c) {
        Equacao2Gral sigma = new Equacao2Gral();
        double x1 = sigma.x1(a, b, c);
        double x2 = sigma.x2(a, b, c);
        return new double[]{x2, x1};
    }
    public void Indicasoes(float a,  float b, float c) {
        Equacao2Gral sigma = new Equacao2Gral();
        double Del = sigma.Delta(a, b, c);
        if (a < 0) {
            if (Del < 0) {
                System.out.println("Temos um ponto de maxima");
                System.out.println("A parabula não encosta no eicho X");
                System.out.println("E temo sapenas o Vertice");
            } else if (Del > 0) {
                System.out.println("Temos um ponto de maxima");
                System.out.println("A parabula encosta e dois pontos no eicho X");
                System.out.println("E temos os doi valores de X e o Vertice");
            } else {
                System.out.println("Temos um ponto de maxima");
                System.out.println("A parabula encosta e um pontos no eicho X");
                System.out.println("E temos todos os pontos iguais");
            }
        } else if (a > 0){
            if (Del < 0) {
                System.out.println("Temos um ponto de mimima");
                System.out.println("A parabula não encosta no eicho X");
                System.out.println("E temo sapenas o Vertice");
            } else if (Del > 0) {
                System.out.println("Temos um ponto de mimima");
                System.out.println("A parabula encosta e dois pontos no eicho X");
                System.out.println("E temos os doi valores de X e o Vertice");
            } else {
                System.out.println("Temos um ponto de mimima");
                System.out.println("A parabula encosta e um pontos no eicho X");
                System.out.println("E temos todos os pontos iguais");
            }
        }
    }

}
