package calculos;

public class ConversorImc {
    public static void main(String[] args) {
        double peso = 67.9;
        double altura = 1.8;
        
        double IMC = peso / (altura * altura);
        
        System.out.println(IMC);
    }
}
