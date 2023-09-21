package javaapplication1;

import java.util.Scanner;

public class TestandoInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String textNotas = input.nextLine();
        
        String[] notas = textNotas.split("\\, ");
        
        double somaDasNotas = 0;
        
        for (String nota : notas) {
            somaDasNotas += Double.valueOf(nota);
        }
        
        System.out.println(somaDasNotas / notas.length);
    }
}
