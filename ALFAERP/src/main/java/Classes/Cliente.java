/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author EMPRESA JUNIOR
 */
public class Cliente {
    private String codigocli;
    private String nomecli;
    private String cpfcli;
    private String cnpfcli;
    private String endecli;
    private String telcli1;
    private String telcli2;
    private String emailcli;

    public Cliente(String codigocli, String nomecli, String cpfcli, String cnpfcli, String endecli, String telcli1, String telcli2, String emailcli) {
        this.codigocli = codigocli;
        this.nomecli = nomecli;
        this.cpfcli = cpfcli;
        this.cnpfcli = cnpfcli;
        this.endecli = endecli;
        this.telcli1 = telcli1;
        this.telcli2 = telcli2;
        this.emailcli = emailcli;
    }

    public String getCodigocli() {
        return codigocli;
    }

    public void setCodigocli(String codigocli) {
        this.codigocli = codigocli;
    }

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
    }

    public String getCpfcli() {
        return cpfcli;
    }

    public void setCpfcli(String cpfcli) {
        this.cpfcli = cpfcli;
    }

    public String getCnpfcli() {
        return cnpfcli;
    }

    public void setCnpfcli(String cnpfcli) {
        this.cnpfcli = cnpfcli;
    }

    public String getEndecli() {
        return endecli;
    }

    public void setEndecli(String endecli) {
        this.endecli = endecli;
    }

    public String getTelcli1() {
        return telcli1;
    }

    public void setTelcli1(String telcli1) {
        this.telcli1 = telcli1;
    }

    public String getTelcli2() {
        return telcli2;
    }

    public void setTelcli2(String telcli2) {
        this.telcli2 = telcli2;
    }

    public String getEmailcli() {
        return emailcli;
    }

    public void setEmailcli(String emailcli) {
        this.emailcli = emailcli;
    }
    
    
    
    
    
}
