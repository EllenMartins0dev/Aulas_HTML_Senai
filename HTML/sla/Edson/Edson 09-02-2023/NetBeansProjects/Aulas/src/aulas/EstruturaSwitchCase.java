package aulas;

public class EstruturaSwitchCase {
    public static void main(String[] args) {
        int temperatura = 32;
        
        switch (temperatura) {
            case 32:
                System.out.println("Esta muito quente");
                break;
            case 19:
                System.out.println("Esta quente");
                break;
            case 15:
                System.out.println("Esta agradavel");
                break;
            case 10:
                System.out.println("Esta pouco frio");
                break;
            case 7:
                System.out.println("Esta muito frio");
                break;
            default:
                System.out.println("Temperatura nao informada");
                throw new AssertionError();
        }
    }
}
