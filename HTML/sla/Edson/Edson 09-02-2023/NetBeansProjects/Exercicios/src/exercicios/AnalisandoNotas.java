package exercicios;

public class AnalisandoNotas {
    public static void main(String[] args) {
        int nota = 10;
        
        switch (nota) {
            case 10:
                System.out.println("Excelente");
                break;
            case 8:
                System.out.println("Parabens");
                break;
            case 5:
                System.out.println("Atencao");
                break;
            case 3:
                System.out.println("Reforcar os estudos");
            default:
                System.out.println("Nota nao identificada");
                throw new AssertionError();
        }
    }
}
