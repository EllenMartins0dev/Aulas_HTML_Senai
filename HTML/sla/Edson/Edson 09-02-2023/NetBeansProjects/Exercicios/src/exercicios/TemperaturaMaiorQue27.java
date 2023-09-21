package exercicios;

import javax.swing.JOptionPane;

public class TemperaturaMaiorQue27 {

    public static void main(String[] args) {
        int temperatura = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a temperatura do dia?", "Termômetro", JOptionPane.WARNING_MESSAGE));

        if (temperatura > 27) {
            JOptionPane.showMessageDialog(null, "Está quente", "Termômetro", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Está frio", "Termômetro", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
