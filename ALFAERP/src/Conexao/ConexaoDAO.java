/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import Classes.Cliente;
import Classes.Fornecedor;
import Classes.Funcionario;
import Classes.Produto;
import Classes.Venda;
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
    
    public static Connection createConnectionToMySQL() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection(DATABASE_URL , USERNAME , PASSWORD);
        
        return connection;
    }
    public static Connection createConnectionToMySQLFor(Fornecedor fornecedor) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection(DATABASE_URL , USERNAME , PASSWORD);
        
        return connection;
    }
    public static Connection createConnectionToMySQLFunc(Funcionario funcionario) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection(DATABASE_URL , USERNAME , PASSWORD);
        
        return connection;
    }
     public static Connection createConnectionToMySQLProd(Produto produto) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection(DATABASE_URL , USERNAME , PASSWORD);
        
        return connection;
    }
      public static Connection createConnectionToMySQLVend(Venda venda) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection(DATABASE_URL , USERNAME , PASSWORD);
        
        return connection;
    }
    
    public static void main(String[] args) throws Exception{
        //Recuperar conexao com o banco
        Cliente cliente = new Cliente();
        Connection con = createConnectionToMySQL();
        Fornecedor fornecedor = new Fornecedor();
        Connection conf = createConnectionToMySQLFor(fornecedor);
        Funcionario funcionario = new Funcionario();
        Connection confunc = createConnectionToMySQLFunc(funcionario);
        Produto produto = new Produto();
        Connection pro = createConnectionToMySQLProd(produto);
        Venda venda = new Venda();
        Connection ven = createConnectionToMySQLVend(venda);
        
        //testar se a conexao é nula
        if(con != null){
            System.out.println("Conexão obtida com sucesso");
            con.close();
        }
        if(conf != null){
            System.out.println("Conexão obtida com sucesso");
            conf.close();
        }
        if(confunc != null){
            System.out.println("Conexão obtida com sucesso");
            confunc.close();
        }
        if(pro != null){
            System.out.println("Conexão obtida com sucesso");
            pro.close();
        }
        if(ven != null){
            System.out.println("Conexão obtida com sucesso");
            ven.close();
        }
    }
   
    
}
