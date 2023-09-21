package exercicios;

import javax.swing.JOptionPane;

public class FaltasMenorQue4 {

    public static void main(String[] args) {
        int faltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas faltas você possui", "Faltas", JOptionPane.INFORMATION_MESSAGE));

        if (faltas < 4) {
            JOptionPane.showMessageDialog(null, "Suas faltas são menores que 4", "Termômetro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Suas faltas são menores que 4", "Termômetro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
