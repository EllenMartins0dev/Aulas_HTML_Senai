package calculos;

public class Tempo {
    public static void main(String[] args) {
        double horas = 13;
        double minutos = 26;
        
        double horasEmSegundos = horas * 60 * 60;
        double minutosEmSegundos = minutos * 60;
        
        double segundos = horasEmSegundos + minutosEmSegundos;
        
        System.out.println(String.format("%.0f:%.0f horas correspondem, em segundos: %.0f segundos", horas, minutos, segundos));
    }
}
