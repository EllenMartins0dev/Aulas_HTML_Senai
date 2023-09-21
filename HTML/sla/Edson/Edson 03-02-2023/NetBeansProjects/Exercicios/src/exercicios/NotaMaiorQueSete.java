package exercicios;

import java.util.Scanner;

public class NotaMaiorQueSete {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota = input.nextDouble();

        if (nota > 7) {
            System.out.println(String.format("A nota %f e maior que 7", nota));
        } else {
            System.out.println(String.format("A nota %f e menor que 7", nota));
        }
    }
}
