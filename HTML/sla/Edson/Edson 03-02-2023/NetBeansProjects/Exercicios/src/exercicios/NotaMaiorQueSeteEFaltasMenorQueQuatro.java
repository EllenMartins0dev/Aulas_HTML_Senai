package exercicios;

import java.util.Scanner;

public class NotaMaiorQueSeteEFaltasMenorQueQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota = input.nextDouble();
        int faltas = input.nextInt();

        if (nota > 7 && faltas < 4) {
            System.out.println("Voce foi aprovado");
        } else {
            System.out.println("Voce foi reprovado");
        }
    }
}
