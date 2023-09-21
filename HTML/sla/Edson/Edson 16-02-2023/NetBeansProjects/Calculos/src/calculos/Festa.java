package calculos;

public class Festa {
    public static void main(String[] args) {
        int convidados = 50;
        
        int totalDeSalgadinhos = 500;
        int totalDeRefrigerantes = 50;
        int totalDeDoces = 400;
        int totalDeMesas = 50;
        
        double precoUnitarioDoSalgadinho = 39.98 / 100;
        double precoUnitarioDoRefrigerante = 8.98;
        double precoUnitarioDoDoce = 69.67 / 100;
        double precoUnitarioDaMesa = 15.99;
        
        double precoTotalDaFesta = (totalDeSalgadinhos * precoUnitarioDoSalgadinho)
                + (totalDeRefrigerantes * precoUnitarioDoRefrigerante)
                + (totalDeDoces * precoUnitarioDoDoce)
                + (totalDeMesas * precoUnitarioDaMesa);
        
        double precoPorConvidado = precoTotalDaFesta / convidados;
        
        System.out.println(precoPorConvidado);
    }
}
