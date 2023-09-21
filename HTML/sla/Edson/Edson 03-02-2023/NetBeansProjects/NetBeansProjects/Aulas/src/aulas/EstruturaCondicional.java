package aulas;

import java.util.Scanner;

public class EstruturaCondicional {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double idade = input.nextDouble();

        if (idade > 18) {
            System.out.println("Voce pode entrar");
        } else {
            System.out.println("Voce nao pode entrar :(");
        }
    }
}
