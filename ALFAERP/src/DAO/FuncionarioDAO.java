/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Funcionario;
import Conexao.ConexaoDAO;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author EMPRESA JUNIOR
 */
public class FuncionarioDAO {
    
    
        public void cadastroFuncionario(Funcionario funcionario) throws SQLException, Exception{
        String sql = "INSERT INTO funcionario(Nome, CPF, RG, DtAdmissao, Rua, Bairro, Numero, CEP, Cidade, Estado, Cargo, Telefone, Telefone2, DtDemissao) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                      
        Connection conn = null;
        
        PreparedStatement pstm = null;
        
        try {
            conn = ConexaoDAO.createConnectionToMySQLFunc(funcionario);
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, funcionario.getNomefunc());
            pstm.setString(2, funcionario.getRgfunc());
            pstm.setString(3, funcionario.getCpffunc());
            pstm.setDate(4, (Date) funcionario.getAdmissaofunc());
            pstm.setString(5, funcionario.getRuafunc());
            pstm.setString(6, funcionario.getBairrofunc());
            pstm.setString(7, funcionario.getNcasafunc());
            pstm.setString(8, funcionario.getCidadefunc());
            pstm.setString(9, funcionario.getEstadofunc());
            pstm.setString(10, funcionario.getCargofunc());
            pstm.setString(11, funcionario.getTelefonefunc());
            pstm.setString(12, funcionario.getTelefonefunc2());
            pstm.setDate(13, (Date) funcionario.getDtdemfunc());
            pstm.setString(14, funcionario.getLoginfunc());
            pstm.setString(15, funcionario.getSenhafunc());
            
            pstm.execute();
            System.out.println("Funcionario inserido com sucesso");
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
        
        public List<Funcionario> getFuncionario(){
        
        String sql = "SELECT * FROM venda";
        
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
             
        Connection conn = null;
        PreparedStatement pstm = null;
        //Classe que vai recuperar os dados do banco. ***SELECT***
        ResultSet rset = null;
        
        try{
            conn = ConexaoDAO.createConnectionToMySQL();
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            
            rset = pstm.executeQuery();
            
            while (rset.next()){
                    
                    Funcionario funcionario = new Funcionario(); 
                    //Recuperar
                    funcionario.setCodigofunc(rset.getInt("idFuncionario"));
                    funcionario.setNomefunc(rset.getString("Nome"));
                    funcionario.setCpffunc(rset.getString("CPF"));
                    funcionario.setRgfunc(rset.getString("RG"));
                    funcionario.setAdmissaofunc(rset.getDate("DtAdmissao"));
                    funcionario.setCargofunc(rset.getString("Cargo"));
                    funcionario.setTelefonefunc(rset.getString("Telefone"));
                    funcionario.setTelefonefunc2(rset.getString("Telefone2"));
                    funcionario.setRuafunc(rset.getString("Rua"));
                    funcionario.setCidadefunc(rset.getString("Cidade"));
                    funcionario.setEstadofunc(rset.getString("Estado"));
                    funcionario.setBairrofunc(rset.getString("Bairro"));
                    funcionario.setNcasafunc(rset.getString("Numero"));
                    funcionario.setLoginfunc(rset.getString("Login"));
                    funcionario.setSenhafunc(rset.getString("Senha"));
                    funcionario.setDtdemfunc(rset.getDate("DtDemissao"));
                    
                    
                    
                            
                    funcionarios.add(funcionario);
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
        return funcionarios;
}
}
