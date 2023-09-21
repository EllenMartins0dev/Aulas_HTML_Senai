package exercicios;

import java.lang.Math;

public class SateliteGeoestacionario {
    public static void main(String[] args) {
        double G = 6.67 / 1e11;
        double M = 5.97e24;
        float T = 84600;
        
        double pi = 3.1415;
        
        double R = Math.cbrt((G * M * (T * T)) / (4 * (pi * pi) ) );
        
        System.out.println(R / 1000);
        
    }
}
