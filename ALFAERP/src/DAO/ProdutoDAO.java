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
}
