/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author EMPRESA JUNIOR
 */
public class Fornecedor {
    private Long codigoforn;
    private String nomesocforn;
    private String cnpfforn;
    private String ruaforn;
    private String cidadeforn;
    private String estadoforn;
    private String cepforn;
    private String bairroforn;
    private String ncasaforn;
    private String forntel1;
    private String forntel2;
    private String fornemail;
    
    
    public Fornecedor(){
        
    }

    public Fornecedor(Long codigoforn, String nomesocforn, String cnpfforn, String ruaforn, String cidadeforn, String estadoforn, String cepforn, String bairroforn, String ncasaforn, String forntel1, String forntel2, String fornemail) {
        this.codigoforn = codigoforn;
        this.nomesocforn = nomesocforn;
        this.cnpfforn = cnpfforn;
        this.ruaforn = ruaforn;
        this.cidadeforn = cidadeforn;
        this.estadoforn = estadoforn;
        this.cepforn = cepforn;
        this.bairroforn = bairroforn;
        this.ncasaforn = ncasaforn;
        this.forntel1 = forntel1;
        this.forntel2 = forntel2;
        this.fornemail = fornemail;
    }

    public Long getCodigoforn() {
        return codigoforn;
    }

    public void setCodigoforn(Long codigoforn) {
        this.codigoforn = codigoforn;
    }

    public String getNomesocforn() {
        return nomesocforn;
    }

    public void setNomesocforn(String nomesocforn) {
        this.nomesocforn = nomesocforn;
    }

    public String getCnpfforn() {
        return cnpfforn;
    }

    public void setCnpfforn(String cnpfforn) {
        this.cnpfforn = cnpfforn;
    }

    public String getRuaforn() {
        return ruaforn;
    }

    public void setRuaforn(String ruaforn) {
        this.ruaforn = ruaforn;
    }

    public String getCidadeforn() {
        return cidadeforn;
    }

    public void setCidadeforn(String cidadeforn) {
        this.cidadeforn = cidadeforn;
    }

    public String getEstadoforn() {
        return estadoforn;
    }

    public void setEstadoforn(String estadoforn) {
        this.estadoforn = estadoforn;
    }

    public String getCepforn() {
        return cepforn;
    }

    public void setCepforn(String cepforn) {
        this.cepforn = cepforn;
    }

    public String getBairroforn() {
        return bairroforn;
    }

    public void setBairroforn(String bairroforn) {
        this.bairroforn = bairroforn;
    }

    public String getNcasaforn() {
        return ncasaforn;
    }

    public void setNcasaforn(String ncasaforn) {
        this.ncasaforn = ncasaforn;
    }

    public String getForntel1() {
        return forntel1;
    }

    public void setForntel1(String forntel1) {
        this.forntel1 = forntel1;
    }

    public String getForntel2() {
        return forntel2;
    }

    public void setForntel2(String forntel2) {
        this.forntel2 = forntel2;
    }

    public String getFornemail() {
        return fornemail;
    }

    public void setFornemail(String fornemail) {
        this.fornemail = fornemail;
    }

    
    
}