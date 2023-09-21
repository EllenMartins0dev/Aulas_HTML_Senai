package exercicios;

public class CelsiusParaFahrenheit {
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }
    
    
    public static void main(String[] args) {
        double celsius = 25;
        
        double fahrenheit = celsiusParaFahrenheit(celsius);
        
        System.out.println(fahrenheit);
    }
}
