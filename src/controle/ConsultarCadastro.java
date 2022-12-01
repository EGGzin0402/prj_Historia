/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package controle;
import conexao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.sql.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author jajps
 */
public class ConsultarCadastro extends javax.swing.JInternalFrame {

    Conexao con;
    
    public ConsultarCadastro() {
        initComponents();
        con = new Conexao();
        con.conecta();
        con.executaSQL("select * from registro order by IdReg");       
        preencherTabela();
        posicionarRegistro();
        Tabela.setAutoCreateRowSorter(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Serie = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        txt_Nome = new javax.swing.JTextField();
        txt_DataNasc = new javax.swing.JTextField();
        txt_LocalNasc = new javax.swing.JTextField();
        txt_Curso = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        txt_Serie.setEnabled(false);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "DataNasc", "LocalNasc", "Curso", "Série"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        txt_Nome.setEnabled(false);

        txt_DataNasc.setEnabled(false);

        txt_LocalNasc.setEnabled(false);

        txt_Curso.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_DataNasc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                .addComponent(txt_LocalNasc, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Serie, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                            .addComponent(txt_Curso))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(txt_LocalNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void preencherTabela(){
        
        DefaultTableModel modelo = (DefaultTableModel) Tabela.getModel();
        modelo.setNumRows(0);
        
        try {
            
            con.resultset.beforeFirst();
            while(con.resultset.next()){
                
                modelo.addRow(new Object[]{
                    con.resultset.getString("Nome"),
                    con.resultset.getString("DataNasc"),
                    con.resultset.getString("LocalNasc"),
                    con.resultset.getString("Curso"),
                    con.resultset.getString("Série")
                });
                
            }
        
            
            
        }catch(SQLException erro){
    
            JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n "+erro,"Mensagem doPrograma",JOptionPane.INFORMATION_MESSAGE);
    
        }
    }

        public void posicionarRegistro(){
        
        try {
            
            con.resultset.first();
            mostrar_Dados();
            
            
        }
        catch (SQLException erro){
            
            JOptionPane.showMessageDialog(null,"Não foi possível posicionar no primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
        
        public void mostrar_Dados(){
        
        try{
            
            txt_Nome.setText(con.resultset.getString("Nome"));
            txt_DataNasc.setText(con.resultset.getString("DataNasc"));
            txt_LocalNasc.setText(con.resultset.getString("LocalNasc"));
            txt_Curso.setText(con.resultset.getString("Curso"));
            txt_Serie.setText(con.resultset.getString("Série"));
            
        }
        catch (SQLException erro){
            
            JOptionPane.showMessageDialog(null,"Não localizou dados: "+erro,"Mensagemdo Programa",JOptionPane.INFORMATION_MESSAGE);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_Curso;
    private javax.swing.JTextField txt_DataNasc;
    private javax.swing.JTextField txt_LocalNasc;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Serie;
    // End of variables declaration//GEN-END:variables
}
