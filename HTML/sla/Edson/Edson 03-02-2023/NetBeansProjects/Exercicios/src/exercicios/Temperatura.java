package exercicios;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double temperatura = input.nextDouble();
        
        if (temperatura > 27) {
            System.out.println(String.format("A temperatura %f e maior que 27", temperatura));
        } else {
            System.out.println(String.format("A temperatura %f e menor que 27", temperatura));
        }
    }
}
