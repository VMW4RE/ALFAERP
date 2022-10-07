/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Produto;
import Conexao.ConexaoDAO;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author EMPRESA JUNIOR
 */
public class ProdutoDAO {
     public void cadastroProduto(Produto produto) throws SQLException, Exception{
        String sql = "INSERT INTO produto(Nome, Descricao, PrecoUntCompra, PrecoUntVenda, NomeFornecedor, DtFabricacao, DtValidade) VALUES (?,?,?,?,?,?,?)";
                      
        Connection conn = null;
        
        PreparedStatement pstm = null;
        
        try {
            conn = ConexaoDAO.createConnectionToMySQLProd(produto);
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, produto.getNomepro());
            pstm.setString(2, produto.getDescripro());
            pstm.setDouble(3, produto.getPreuncomppro());
            pstm.setDouble(4, produto.getPreunvendpro());
            pstm.setString(5, produto.getFornpro());
            pstm.setDate(6, (Date) produto.getDtfbpro());
            pstm.setDate(7, (Date) produto.getDtvapro());
            
            
            pstm.execute();
            System.out.println("Produto inserido com sucesso");
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
     
      public List<Produto> getProduto(){
        
        String sql = "SELECT * FROM produto";
        
        List<Produto> produtos = new ArrayList<Produto>();
             
        Connection conn = null;
        PreparedStatement pstm = null;
        //Classe que vai recuperar os dados do banco. ***SELECT***
        ResultSet rset = null;
        
        try{
            conn = ConexaoDAO.createConnectionToMySQL();
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            
            rset = pstm.executeQuery();
            
            while (rset.next()){
                    
                    Produto produto = new Produto(); 
                    //Recuperar
                    produto.setCodigopro(rset.getInt("idProduto"));
                    produto.setNomepro(rset.getString("Nome"));
                    produto.setDescripro(rset.getString("Descricao"));
                    produto.setPreuncomppro(rset.getDouble("PrecoUntCompra"));
                    produto.setPreunvendpro(rset.getDouble("PrecoUntVenda"));
                    produto.setFornpro(rset.getString("NomeFornecedor"));
                    produto.setDtfbpro(rset.getDate("DtFabricacao"));
                    produto.setDtvapro(rset.getDate("DtValidade"));
                    
                    
                    
                            
                    produtos.add(produto);
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
        return produtos;
}
}
