/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package controle;

import conexao.Conexao;
import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Logar extends javax.swing.JInternalFrame {

    Conexao con;

    public Logar() {
        initComponents();
        con = new Conexao();
        con.conecta();
        con.executaSQL("select * from marlon order by IdProf");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFundo = new javax.swing.JPanel();
        panelImg = new javax.swing.JPanel();
        lbl_Img = new javax.swing.JLabel();
        btn_Sair = new javax.swing.JButton();
        lbl_Usuario = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        lbl_Senha = new javax.swing.JLabel();
        btn_Logar = new javax.swing.JButton();
        txt_Senha = new javax.swing.JPasswordField();
        lbl_Title = new javax.swing.JLabel();
        btn_Voltar = new javax.swing.JButton();

        ((BasicInternalFrameUI)this.getUI()).getNorthPane().setPreferredSize( new Dimension(0,0) );

        setBorder(new EmptyBorder(new Insets(0,0,0,0)));
        setPreferredSize(new java.awt.Dimension(640, 480));

        panelFundo.setBackground(new java.awt.Color(51, 51, 51));
        panelFundo.setForeground(new java.awt.Color(60, 63, 65));

        panelImg.setBackground(new java.awt.Color(0, 255, 204));

        lbl_Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginImg.png"))); // NOI18N

        btn_Sair.setText("X");
        btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImgLayout = new javax.swing.GroupLayout(panelImg);
        panelImg.setLayout(panelImgLayout);
        panelImgLayout.setHorizontalGroup(
            panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Sair))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImgLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(lbl_Img)
                .addGap(56, 56, 56))
        );
        panelImgLayout.setVerticalGroup(
            panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImgLayout.createSequentialGroup()
                .addComponent(btn_Sair)
                .addGap(139, 139, 139)
                .addComponent(lbl_Img)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_Usuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Usuario.setText("Usuário:");

        lbl_Senha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_Senha.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Senha.setText("Senha:");

        btn_Logar.setText("Logar");
        btn_Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogarActionPerformed(evt);
            }
        });

        txt_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SenhaActionPerformed(evt);
            }
        });

        lbl_Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Title.setText("Visualizar Respostas:");

        btn_Voltar.setText("Voltar ao Menu");
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFundoLayout = new javax.swing.GroupLayout(panelFundo);
        panelFundo.setLayout(panelFundoLayout);
        panelFundoLayout.setHorizontalGroup(
            panelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFundoLayout.createSequentialGroup()
                .addGroup(panelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFundoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Title)
                        .addGap(84, 84, 84))
                    .addGroup(panelFundoLayout.createSequentialGroup()
                        .addGroup(panelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFundoLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(panelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_Usuario)
                                    .addComponent(lbl_Senha)
                                    .addComponent(txt_Usuario)
                                    .addComponent(txt_Senha, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                            .addGroup(panelFundoLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btn_Logar)
                                .addGap(56, 56, 56)
                                .addComponent(btn_Voltar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(panelImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelFundoLayout.setVerticalGroup(
            panelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFundoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_Title)
                .addGap(59, 59, 59)
                .addComponent(lbl_Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lbl_Senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Logar)
                    .addComponent(btn_Voltar))
                .addGap(110, 110, 110))
            .addComponent(panelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_SairActionPerformed

    private void btn_LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogarActionPerformed
        // TODO add your handling code here:
        try {
            String pesquisa = "select * from marlon where usuario like'" + txt_Usuario.getText() + "'&&senha like'" + txt_Senha.getText() + "'";
            con.executaSQL(pesquisa);
            if (con.resultset.first()) {
                ConsultarCadastro consult = new ConsultarCadastro();
                getParent().add(consult);
                consult.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "\n Credenciais incorretas!!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (SQLException errosql) {
            JOptionPane.showMessageDialog(null, "\n Os dados digitados não foram localizados!! :\n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_LogarActionPerformed


    private void txt_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SenhaActionPerformed

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_VoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Logar;
    private javax.swing.JButton btn_Sair;
    private javax.swing.JButton btn_Voltar;
    public javax.swing.JLabel lbl_Img;
    private javax.swing.JLabel lbl_Senha;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl_Usuario;
    private javax.swing.JPanel panelFundo;
    private javax.swing.JPanel panelImg;
    private javax.swing.JPasswordField txt_Senha;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
