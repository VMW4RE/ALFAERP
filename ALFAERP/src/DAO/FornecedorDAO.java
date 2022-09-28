/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Fornecedor;
import Conexao.ConexaoDAO;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author EMPRESA JUNIOR
 */
public class FornecedorDAO {
    
    
    public void cadastroFornecedor(Fornecedor fornecedor) throws SQLException, Exception{
        String sql = "INSERT INTO fornecedor(NomeFornecedor, CNPJ, Rua, Bairro, Numero, CEP, Cidade, Estado, Telefone, Telefone2, Email ) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                      
        Connection conn = null;
        
        PreparedStatement pstm = null;
        
        try {
            conn = ConexaoDAO.createConnectionToMySQLFor(fornecedor);
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, fornecedor.getNomesocforn());
            pstm.setString(2, fornecedor.getCnpfforn());
            pstm.setString(3, fornecedor.getRuaforn());
            pstm.setString(4, fornecedor.getBairroforn());
            pstm.setString(5, fornecedor.getNcasaforn());
            pstm.setString(6, fornecedor.getCepforn());
            pstm.setString(7, fornecedor.getCidadeforn());
            pstm.setString(8, fornecedor.getEstadoforn());
            pstm.setString(9, fornecedor.getForntel1());
            pstm.setString(10, fornecedor.getForntel2());
            pstm.setString(11, fornecedor.getFornemail());
            
            pstm.execute();
            System.out.println("Fornecedor inserido com sucesso");
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
    
    
    public List<Fornecedor> getFornecedores(){
        
        String sql = "SELECT * FROM cliente";
        
        List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
             
        Connection conn = null;
        PreparedStatement pstm = null;
        //Classe que vai recuperar os dados do banco. ***SELECT***
        ResultSet rset = null;
        
        try{
            conn = ConexaoDAO.createConnectionToMySQL();
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            
            rset = pstm.executeQuery();
            
            while (rset.next()){
                    
                    Fornecedor fornecedor = new Fornecedor(); 
                    //Recuperar
                    fornecedor.setCodigoforn(rset.getInt("idFornecedor"));
                    fornecedor.setNomesocforn(rset.getString("Nome"));
                    fornecedor.setCnpfforn(rset.getString("CPF"));
                    fornecedor.setRuaforn(rset.getString("Rua"));
                    fornecedor.setCidadeforn(rset.getString("Bairro"));
                    fornecedor.setEstadoforn(rset.getString("Numero"));
                    fornecedor.setCepforn(rset.getString("CEP"));
                    fornecedor.setBairroforn(rset.getString("Cidade"));
                    fornecedor.setNcasaforn(rset.getString("Estado"));
                    fornecedor.setForntel1(rset.getString("Telefone"));
                    fornecedor.setForntel2(rset.getString("Telefone2"));
                    fornecedor.setFornemail(rset.getString("Email"));
                    
                    
                            
                    fornecedores.add(fornecedor);
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
            
        }catch (Exception e){
            e.printStackTrace();
        }
}
        return fornecedores;
}
}

    
