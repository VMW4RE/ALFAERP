/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Cliente;
import Conexao.ConexaoDAO;
import java.sql.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EMPRESA JUNIOR
 */
public class ClienteDAO {
    //criação do CRUD
    
    public void cadastroCliente(Cliente cliente) throws SQLException, Exception{
        String sql = "INSERT INTO cliente(Nome, CPF, Rua, Bairro, Numero, CEP, Cidade, Estado, Telefone, Telefone2, Email ) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                      
        Connection conn = null;
        
        PreparedStatement pstm = null;
        
        try {
            conn = ConexaoDAO.createConnectionToMySQL(cliente);
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, cliente.getNomecli());
            pstm.setString(2, cliente.getCnpfcli());
            pstm.setString(3, cliente.getRuacli());
            pstm.setString(4, cliente.getBairrocli());
            pstm.setString(5, cliente.getNcasacli());
            pstm.setString(6, cliente.getCepcli());
            pstm.setString(7, cliente.getCidadecli());
            pstm.setString(8, cliente.getEstadocli());
            pstm.setString(9, cliente.getTelcli1());
            pstm.setString(10, cliente.getTelcli2());
            pstm.setString(11, cliente.getEmailcli());
            
            pstm.execute();
            System.out.println("Contado inserido com sucesso");
        } catch (Exception e){
            e.printStackTrace();
    
     }finally{
            //Fechar as conexões
            try{
                if(pstm != null){
                    pstm.close();
                }
                if(conn!= null){
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
            

    }
    
    public List<Cliente> getClientes{
    
        Cliente cliente = new Cliente();
        String sql = "SELECT * FROM cliente";
        
        List<Cliente> clientes = new ArrayList<Cliente>();
        
        Connection conn = null;
        PreparedStatement pstm = null;
        //Classe que vai recuperar os dados do banco. ***SELECT***
        ResultSet rset = null;
        
        try{
            conn = ConexaoDAO.createConnectionToMySQL(cliente);
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            
            rset = pstm.executeQuery();
            
            while (rset.next()){
                
                    
                    //Recuperar
                    cliente.setCodigocli(rset.getInt("idCliente"));
                    cliente.setNomecli(rset.getString("Nome"));
                    cliente.setCnpfcli(rset.getString("CPF"));
                    cliente.setRuacli(rset.getString("Rua"));
                    cliente.setBairrocli(rset.getString("Bairro"));
                    cliente.setNcasacli(rset.getString("Numero"));
                    cliente.setCepcli(rset.getString("CEP"));
                    cliente.setCidadecli(rset.getString("Cidade"));
                    cliente.setEstadocli(rset.getString("Estado"));
                    cliente.setTelcli1(rset.getString("Telefone"));
                    cliente.setTelcli2(rset.getString("Telefone2"));
                    cliente.setEmailcli(rset.getString("Email"));
                            
                    cliente.add(cliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
           try{ 
            if(rset!=null){
                rset.close();
            }
            if(pstm!=null){
                pstm.close();
            }
            if(conn != null){
                conn.close();
            }
            
        }catch
}
    
}
        
