/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import Classes.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author EMPRESA JUNIOR
 */
public class ConexaoDAO{
    
    //NOME DO USUÁRIO DO BANCO
    private static final String USERNAME = "root";
    //SENHA DO BANCO
    private static final String PASSWORD = "";
    //CAMINHO DO BANCO DE DADOS - PORTA
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3307/sistemaerp";
    
    
    //CONEXAO COM BANCO
    
    public static Connection createConnectionToMySQL(Cliente cliente) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection(DATABASE_URL , USERNAME , PASSWORD);
        
        return connection;
    }
    
    public static void main(String[] args) throws Exception{
        //Recuperar conexao com o banco
        Cliente cliente = new Cliente();
        Connection con = createConnectionToMySQL(cliente);
        
        //testar se a conexao é nula
        if(con != null){
            System.out.println("Conexão obtida com sucesso");
            con.close();
        }
    }
   
    
}
