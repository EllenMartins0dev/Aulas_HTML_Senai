package exercicios;

import javax.swing.JOptionPane;

public class NotaMaiorQue7 {

    public static void main(String[] args) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua nota?", "Nota", JOptionPane.INFORMATION_MESSAGE));

        if (nota >= 7) {
            JOptionPane.showMessageDialog(null, "Sua nota é maior ou igual que 7", "Notas", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Sua nota é menor que 7", "Notas", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
