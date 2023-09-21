package aulas;

import javax.swing.JOptionPane;

public class InterfacesEmJava {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Olá, mundo", "Meu programa", JOptionPane.INFORMATION_MESSAGE);

        String[] options = {"Sim", "Não"};
        System.out.println(JOptionPane.showOptionDialog(null, "Atençao", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]));

        JOptionPane.showInputDialog(null, "Digite os 16 digitos do seu cartao", "Seu cartao pode estar em perigo", JOptionPane.INFORMATION_MESSAGE);
    }
}
