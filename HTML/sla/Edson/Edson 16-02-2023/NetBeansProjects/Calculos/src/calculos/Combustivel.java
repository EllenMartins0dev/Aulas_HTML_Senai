package calculos;

public class Combustivel {
    public static void main(String[] args) {
        double precoDoCombustivel = 5.09;
        double quilometrosPercorridos = 150;
        double quilometrosPorLitro = 12;

        double preco = (quilometrosPercorridos / quilometrosPorLitro) * precoDoCombustivel;

        System.out.println(String.format("Com o preco do combustivel sendo R$%.2f, percorrendo %.0fkm e fazendo %.0fkm/litro, o preco total sera: R$%.2f", precoDoCombustivel, quilometrosPercorridos, quilometrosPorLitro, preco));;
    }
}
