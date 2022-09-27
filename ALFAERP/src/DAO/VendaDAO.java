/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Venda;
import Conexao.ConexaoDAO;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
/**
 *
 * @author EMPRESA JUNIOR
 */
public class VendaDAO {
    public void cadastroVenda(Venda venda) throws SQLException, Exception{
        String sql = "INSERT INTO venda(Quantidade, Preco, Tipopag, Desc) VALUES (?,?,?,?)";
                      
        Connection conn = null;
        
        PreparedStatement pstm = null;
        
        try {
            conn = ConexaoDAO.createConnectionToMySQLVend(venda);
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setDouble(1, venda.getQuantidade());
            pstm.setDouble(2, venda.getPrecototalvenda());
            pstm.setString(3, venda.getTipopag());
            pstm.setDouble(4, venda.getDesc());           
            
            pstm.execute();
            System.out.println("Venda Realizada com Sucesso");
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
