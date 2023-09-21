/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Formularios;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Calculadora extends javax.swing.JInternalFrame {

    /**
     * Creates new form Notas
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelNumero1 = new javax.swing.JLabel();
        jTextFieldNumero1 = new javax.swing.JTextField();
        jLabelNumero2 = new javax.swing.JLabel();
        jTextFieldNumero2 = new javax.swing.JTextField();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonSubtrair = new javax.swing.JButton();
        jButtonMultiplicacao = new javax.swing.JButton();
        jButtonDivisao = new javax.swing.JButton();
        jButtonCalcular = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitle.setText("Calculadora");
        jPanel1.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabelNumero1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNumero1.setText("Número 1:");
        jPanel1.add(jLabelNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jTextFieldNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumero1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 330, 30));

        jLabelNumero2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNumero2.setText("Número 2:");
        jPanel1.add(jLabelNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        jTextFieldNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumero2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 330, 30));

        jButtonAdicionar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonAdicionar.setText("+");
        jButtonAdicionar.setAlignmentY(0.0F);
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 50, 40));

        jButtonSubtrair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonSubtrair.setText("-");
        jButtonSubtrair.setAlignmentY(0.0F);
        jButtonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtrairActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSubtrair, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 50, 40));

        jButtonMultiplicacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonMultiplicacao.setText("*");
        jButtonMultiplicacao.setAlignmentY(0.0F);
        jButtonMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacaoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMultiplicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 50, 40));

        jButtonDivisao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonDivisao.setText("/");
        jButtonDivisao.setAlignmentY(0.0F);
        jButtonDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisaoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 50, 40));

        jButtonCalcular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCalcular.setText("=");
        jButtonCalcular.setAlignmentY(0.0F);
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumero1ActionPerformed

    private double calculadora(String operacao, double numero1, double numero2) {
        switch (operacao) {
            case "adicionar":
                return numero1 + numero2;
            case "subtrair":
                return numero1 - numero2;
            case "multiplicação":
                return numero1 * numero2;
            case "divisão":
                return numero1 / numero2;
            default:
                throw new AssertionError();
        }
    }

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        double numero1 = Double.parseDouble(jTextFieldNumero1.getText());
        double numero2 = Double.parseDouble(jTextFieldNumero2.getText());

        double soma = calculadora("adicionar", numero1, numero2);

        System.out.println(soma);
        
        JOptionPane.showMessageDialog(rootPane, String.format("A soma de %.2f e %.2f é: %.2f", numero1, numero2, soma));
    }//GEN-LAST:event_jButtonAdicionarActionPerformed


    private void jButtonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtrairActionPerformed
        double numero1 = Double.parseDouble(jTextFieldNumero1.getText());
        double numero2 = Double.parseDouble(jTextFieldNumero2.getText());

        double subtracao = calculadora("subtrair", numero1, numero2);

        JOptionPane.showMessageDialog(rootPane, String.format("A subtração de %.2f e %.2f é: %.2f", numero1, numero2, subtracao));
    }//GEN-LAST:event_jButtonSubtrairActionPerformed

    private void jButtonMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacaoActionPerformed
        double numero1 = Double.parseDouble(jTextFieldNumero1.getText());
        double numero2 = Double.parseDouble(jTextFieldNumero2.getText());

        double multiplicacao = calculadora("multiplicação", numero1, numero2);

        JOptionPane.showMessageDialog(rootPane, String.format("A multiplição de %.2f por %.2f é: %.2f", numero1, numero2, multiplicacao));
    }//GEN-LAST:event_jButtonMultiplicacaoActionPerformed

    private void jButtonDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisaoActionPerformed
        double numero1 = Double.parseDouble(jTextFieldNumero1.getText());
        double numero2 = Double.parseDouble(jTextFieldNumero2.getText());

        double multiplicacao = calculadora("divisão", numero1, numero2);

        JOptionPane.showMessageDialog(rootPane, String.format("A divisão de %.2f por %.2f é: %.2f", numero1, numero2, multiplicacao));
    }//GEN-LAST:event_jButtonDivisaoActionPerformed

    private void jTextFieldNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumero2ActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        // TODO add your handling code here:
        double nota1 = Double.parseDouble(jTextFieldNumero1.getText());
        double nota2 = Double.parseDouble(jTextFieldNumero2.getText());

        double media = (nota1 + nota2) / 2;

        JOptionPane.showMessageDialog(rootPane, String.format("A média entre %.2f e %.2f é: %.2f", nota1, nota2, media));
    }//GEN-LAST:event_jButtonCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonDivisao;
    private javax.swing.JButton jButtonMultiplicacao;
    private javax.swing.JButton jButtonSubtrair;
    private javax.swing.JLabel jLabelNumero1;
    private javax.swing.JLabel jLabelNumero2;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNumero1;
    private javax.swing.JTextField jTextFieldNumero2;
    // End of variables declaration//GEN-END:variables
}
