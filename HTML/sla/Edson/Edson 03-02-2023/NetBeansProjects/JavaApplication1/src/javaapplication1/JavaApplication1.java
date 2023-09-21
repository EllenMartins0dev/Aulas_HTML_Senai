/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota1 = 8.5;
        double nota2 = 9.2;
        
        int idade = 16;
        
        float nota3 = 4.6f;
        
        boolean veioDeOnibus = false;
        boolean veioDeCarro = !veioDeOnibus;
        
        boolean aCieciaFoiLongeDeMais = true;
        
        long numero = 94909543;
        
        
        System.out.println(veioDeCarro);
        
        double media = (nota1 + nota2) / 2;

        String[] nome = {"Paulo", "Caio", "Edson"};
                
        int aleatorio = new Random().nextInt(nome.length);
        
        System.out.println(String.format("O aluno %s esta com a media %f", nome[aleatorio], media));
        // TODO code application logic here
    }
    
}
