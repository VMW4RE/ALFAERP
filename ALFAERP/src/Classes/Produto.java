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
    private String codigopro;
    private String nomepro;
    private double preuncomppro;
    private double preunvendpro;
    private String fornpro;
    private Date   dtfbpro;
    private Date   dtvapro;

    public Produto(String codigopro, String nomepro, double preuncomppro, double preunvendpro, String fornpro, Date dtfbpro, Date dtvapro) {
        this.codigopro = codigopro;
        this.nomepro = nomepro;
        this.preuncomppro = preuncomppro;
        this.preunvendpro = preunvendpro;
        this.fornpro = fornpro;
        this.dtfbpro = dtfbpro;
        this.dtvapro = dtvapro;
        
    }

    public String getCodigopro() {
        return codigopro;
    }

    public void setCodigopro(String codigopro) {
        this.codigopro = codigopro;
    }

    public String getNomepro() {
        return nomepro;
    }

    public void setNomepro(String nomepro) {
        this.nomepro = nomepro;
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
