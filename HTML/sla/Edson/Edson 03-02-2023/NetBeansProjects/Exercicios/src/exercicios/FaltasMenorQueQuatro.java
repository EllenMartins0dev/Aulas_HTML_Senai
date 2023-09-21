package exercicios;

import java.util.Scanner;

public class FaltasMenorQueQuatro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int faltas = input.nextInt();

        if (faltas < 4) {
            System.out.println(String.format("Voce faltou menos que 4 vezes", faltas));
        } else {
            System.out.println(String.format("Voce faltou mais que 4 vezes", faltas));
        }
    }
}
