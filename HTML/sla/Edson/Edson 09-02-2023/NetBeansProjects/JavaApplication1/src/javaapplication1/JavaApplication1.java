/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static double calcularAnguloInterno(int lados) {
        return ((lados - 2) * 180) / lados;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos lados seu poligono tem? ");
        int lados = input.nextInt();

        System.out.println(String.format("Os angulos internos de um poligono com %s lados sera: %f", lados, calcularAnguloInterno(lados)));

    }

}
