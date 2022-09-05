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
    private String codigoforn;
    private String nomesocforn;
    private String cnpfforn;
    private String endeforn;
    private String forntel1;
    private String forntel2;
    private String fornemail;

    public Fornecedor(String codigoforn, String nomesocforn, String cnpfforn, String endeforn, String forntel1, String forntel2, String fornemail) {
        this.codigoforn = codigoforn;
        this.nomesocforn = nomesocforn;
        this.cnpfforn = cnpfforn;
        this.endeforn = endeforn;
        this.forntel1 = forntel1;
        this.forntel2 = forntel2;
        this.fornemail = fornemail;
    }

    public String getCodigoforn() {
        return codigoforn;
    }

    public void setCodigoforn(String codigoforn) {
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

    public String getEndeforn() {
        return endeforn;
    }

    public void setEndeforn(String endeforn) {
        this.endeforn = endeforn;
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
