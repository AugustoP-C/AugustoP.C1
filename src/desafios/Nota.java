package desafios;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o nome do aluno");
        String nome = teclado.nextLine();
        System.out.println("Qual a nota de Portuguse do aluno "+ nome);
        float notap = teclado.nextFloat();
        System.out.println("Qual a nota de Matematica "+ nome);
        float notam = teclado.nextFloat();
        float result = (notap + notam) / 2;
        System.out.format("A media de %s e %.1f \n", nome , result);
        if (result >= 5.5) {
            System.out.format("Parabens %s você passou de ano \n", nome);
        }
        else {
            System.out.format("Que pena %s mas imfelismente você não passou de ano \n", nome);
        }
        System.out.println();
    }
}
