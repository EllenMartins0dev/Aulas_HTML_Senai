package javaapplication1;

import java.util.Scanner;

public class NumeroDeDiagonais {
    public static int calcularNumeroDeDiagonais(int lados) {
        return (lados * (lados - 3)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lados = input.nextInt();

        System.out.println(calcularNumeroDeDiagonais(lados));
    }
}
