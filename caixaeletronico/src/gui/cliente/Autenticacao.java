/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui.cliente;

import javax.swing.JFrame;
import modelo.IBanco;

/**
 *
 * @author pedro.kislansky
 */
public class Autenticacao extends javax.swing.JPanel {

    /**
     * Creates new form Autenticacao
     */
    IBanco banco;
    Principal framePai;
    public Autenticacao(Principal framePai,IBanco banco) {
        initComponents();
        this.banco=banco;
        this.framePai=framePai;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        txtConta = new javax.swing.JTextField();
        pswSenha = new javax.swing.JPasswordField();
        btAutenticar = new javax.swing.JButton();
        lblMensagem = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Autenticação");
        add(jLabel1);
        jLabel1.setBounds(60, 10, 310, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel2.setText("Senha:");
        add(jLabel2);
        jLabel2.setBounds(30, 190, 80, 29);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel3.setText("Agência:");
        add(jLabel3);
        jLabel3.setBounds(30, 90, 110, 29);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel4.setText("Conta:");
        add(jLabel4);
        jLabel4.setBounds(30, 140, 80, 29);

        txtAgencia.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        add(txtAgencia);
        txtAgencia.setBounds(190, 90, 270, 35);

        txtConta.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        add(txtConta);
        txtConta.setBounds(190, 140, 270, 35);

        pswSenha.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        add(pswSenha);
        pswSenha.setBounds(190, 190, 270, 35);

        btAutenticar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btAutenticar.setText("Autenticar");
        btAutenticar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutenticarActionPerformed(evt);
            }
        });
        add(btAutenticar);
        btAutenticar.setBounds(310, 250, 150, 35);

        lblMensagem.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 0, 0));
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblMensagem);
        lblMensagem.setBounds(0, 300, 480, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void btAutenticarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutenticarActionPerformed
        int agencia = Integer.parseInt(txtAgencia.getText());
        int conta = Integer.parseInt(txtConta.getText());
        String senha = String.valueOf(pswSenha.getPassword());
        boolean resposta = banco.autenticarCliente(agencia, conta, senha);
        if(resposta){
            this.framePai.trocarPainel(new Caixa(this.banco));
        }else{
            lblMensagem.setText("Não foi possível autenticar");
        }
    }//GEN-LAST:event_btAutenticarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAutenticar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtConta;
    // End of variables declaration//GEN-END:variables
}