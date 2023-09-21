package aulas;

public class OperadorE {

    public static void main(String[] args) {
        double nota1 = 7.9;
        double nota2 = 4.8;

        double media = (nota1 + nota2) / 2;

        int faltas = 1;

        if (media > 5.5 && faltas < 3) {
            System.out.println("Voce esta aprovado");
        } else {
            System.out.println("Voce esta reprovado");
        }
    }
}
