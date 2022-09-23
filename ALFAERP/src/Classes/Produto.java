/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.util.Date;
/**
 *
 * @author EMPRESA JUNIOR
 */
public class Produto {
    private Long codigopro;
    private String nomepro;
    private String descripro;
    private double preuncomppro;
    private double preunvendpro;
    private String fornpro;
    private Date   dtfbpro;
    private Date   dtvapro;
    
    
    public Produto(){
        
    }

    public Produto(Long codigopro, String nomepro, String descripro, double preuncomppro, double preunvendpro, String fornpro, Date dtfbpro, Date dtvapro) {
        this.codigopro = codigopro;
        this.nomepro = nomepro;
        this.descripro = descripro;
        this.preuncomppro = preuncomppro;
        this.preunvendpro = preunvendpro;
        this.fornpro = fornpro;
        this.dtfbpro = dtfbpro;
        this.dtvapro = dtvapro;
    }

    public Long getCodigopro() {
        return codigopro;
    }

    public void setCodigopro(Long codigopro) {
        this.codigopro = codigopro;
    }

    public String getNomepro() {
        return nomepro;
    }

    public void setNomepro(String nomepro) {
        this.nomepro = nomepro;
    }

    public String getDescripro() {
        return descripro;
    }

    public void setDescripro(String descripro) {
        this.descripro = descripro;
    }

    public double getPreuncomppro() {
        return preuncomppro;
    }

    public void setPreuncomppro(double preuncomppro) {
        this.preuncomppro = preuncomppro;
    }

    public double getPreunvendpro() {
        return preunvendpro;
    }

    public void setPreunvendpro(double preunvendpro) {
        this.preunvendpro = preunvendpro;
    }

    public String getFornpro() {
        return fornpro;
    }

    public void setFornpro(String fornpro) {
        this.fornpro = fornpro;
    }

    public Date getDtfbpro() {
        return dtfbpro;
    }

    public void setDtfbpro(Date dtfbpro) {
        this.dtfbpro = dtfbpro;
    }

    public Date getDtvapro() {
        return dtvapro;
    }

    public void setDtvapro(Date dtvapro) {
        this.dtvapro = dtvapro;
    }

    

    
    
    
    
}
