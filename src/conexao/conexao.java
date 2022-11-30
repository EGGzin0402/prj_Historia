/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author EGGzin
 */
public class Conexao {
    
    final private String driver = "com.mysql.cj.jdbc.Driver"; //Definição do drtiver de conexão do MySql
    final private String url = "jdbc:mysql://db4free.net/bd_historia"; //referência ao banco de dados do restaurante
    final private String usuario = "joaopedro"; //Usuário do MySQL
    final private String senha = "%@0xJZ06XfX3"; //Senha do MySQL
    private Connection conexao; // variável do tipo conexão, armazena conexão aberta
    public Statement statement; // variável do tipo statment, usada para execução dos comandos SQL no Java
    public ResultSet resultset; // variável do tipo resultado, armazena o resultado da execução de um comando SQL
    
    public boolean conecta(){
        
        boolean result = true;
        try{
            
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,usuario,senha);            
            
        }catch (ClassNotFoundException Driver){
            
            JOptionPane.showMessageDialog(null, "Driver não localizado"+Driver, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            result = false;
            
        }catch (SQLException Fonte){
            
            JOptionPane.showMessageDialog(null, "Fonte de dados não localizada"+Fonte, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            result = false;
            
        }
        
        return result;
        
    }
    
    public void desconecta(){
        
        try{
            
            conexao.close();
            JOptionPane.showMessageDialog(null,"Conexão com o banco fechada", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException fecha){
               
        }
        
    }
    
    public void executaSQL(String sql){
        
        try{
            
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
            
        }catch(SQLException excecao){
            
            JOptionPane.showMessageDialog(null, "Erro no comando SQL! \n Erro: "+excecao,"Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
    
}
