package exercicios;

public class MediaQuatroNotas {
    public static void main(String[] args) {
        double[] notas = { 10, 9, 8, 7 };
        
        double somaDasNotas = 0;
        
        for (int i = 0; i < notas.length; i++) {
            somaDasNotas += notas[i];
        }
        
        double media = somaDasNotas / notas.length;
        
        System.out.println(String.format("O usuario \"%s\" teve a media: %f",System.getProperty("user.name"), media));
    }
}
