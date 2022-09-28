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
        
        String sql = "SELECT * FROM cliente";
        
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
                    funcionario.setRgfunc(rset.getString("CPF"));
                    funcionario.setCpffunc(rset.getString("Rua"));
                    funcionario.setAdmissaofunc(rset.getDate("Bairro"));
                    funcionario.setCargofunc(rset.getString("Numero"));
                    funcionario.setTelefonefunc(rset.getString("CEP"));
                    funcionario.setTelefonefunc2(rset.getString("Cidade"));
                    funcionario.setRuafunc(rset.getString("Estado"));
                    funcionario.setCidadefunc(rset.getString("Telefone"));
                    funcionario.setEstadofunc(rset.getString("Telefone2"));
                    funcionario.setBairrofunc(rset.getString("Email"));
                    funcionario.setNcasafunc(rset.getString("Email"));
                    funcionario.setLoginfunc(rset.getString("Email"));
                    funcionario.setSenhafunc(rset.getString("Email"));
                    funcionario.setDtdemfunc(rset.getDate("Email"));
                    
                    
                    
                            
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
