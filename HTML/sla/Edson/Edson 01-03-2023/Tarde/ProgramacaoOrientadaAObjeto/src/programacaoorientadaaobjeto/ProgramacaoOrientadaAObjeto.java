/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacaoorientadaaobjeto;

/**
 *
 * @author Aluno
 */
public class ProgramacaoOrientadaAObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente client = new Cliente();
        client.setCodigo(123);
        client.setNome("Edson Giovane Petrini Junior");
        client.setEmail("edsonpetrinijr@gmail.com");
        client.setIdade(16);
        
        Produto product = new Produto();
        product.setCodigo(123456789);
        product.setNome("Garrafinha de água");
        product.setValor(8);
        
        Endereco address = new Endereco();
        address.setCep("13423492");
        
        System.out.println(product);
    }
}
