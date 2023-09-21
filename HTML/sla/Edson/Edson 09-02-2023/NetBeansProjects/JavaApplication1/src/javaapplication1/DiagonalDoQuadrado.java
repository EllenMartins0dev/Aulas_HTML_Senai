package javaapplication1;

import java.util.Scanner;

public class DiagonalDoQuadrado {

    public static double calcularDiagonalDoQuadrado(int tamanhoDoLadoDoQuadrado) {
        return tamanhoDoLadoDoQuadrado * Math.sqrt(2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tamanhoDoLadoDoQuadrado = input.nextInt();

        System.out.println(calcularDiagonalDoQuadrado(tamanhoDoLadoDoQuadrado));
    }
}
