/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.cliente;

import modelo.IBanco;

/**
 *
 * @author 202403476411
 */
public class Extrato extends javax.swing.JPanel {

    /**
     * Creates new form Depositar
     */
    IBanco banco;
    Principal framePai;
    public Extrato(Principal framePai, IBanco banco) {
        initComponents();
        this.banco = banco;
        this.framePai = framePai;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        VoltarDepo = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("EXTRATO");
        add(jLabel1);
        jLabel1.setBounds(130, 30, 160, 70);

        VoltarDepo.setText("Voltar");
        VoltarDepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarDepoActionPerformed(evt);
            }
        });
        add(VoltarDepo);
        VoltarDepo.setBounds(290, 230, 61, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarDepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarDepoActionPerformed
        this.framePai.trocarPainel(new Caixa(this.framePai, this.banco));
    }//GEN-LAST:event_VoltarDepoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VoltarDepo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
