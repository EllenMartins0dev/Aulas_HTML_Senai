package exercicios;

public class DescontosNoSalario {
    public static void main(String[] args) {
        double salario = 2235.9;
        
        double descontoDoINSS = salario * 0.08;
        double descontoDoFGTS = salario * 0.09;
        
        double salarioLiquido = salario - (descontoDoINSS + descontoDoFGTS);
        
        System.out.println(salarioLiquido);
    }
}
