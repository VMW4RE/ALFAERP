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
}
