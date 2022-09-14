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
    private Long codigocli;
    private String nomecli;
    private String cnpfcli;
    private String ruacli;
    private String cidadecli;
    private String estadocli;
    private String cepcli;
    private String bairrocli;
    private String ncasacli;
    private String telcli1;
    private String telcli2;
    private String emailcli;

    public Cliente(Long codigocli, String nomecli, String cnpfcli, String ruacli, String cidadecli, String estadocli, String cepcli, String bairrocli, String ncasacli, String telcli1, String telcli2, String emailcli) {
        this.codigocli = codigocli;
        this.nomecli = nomecli;
        this.cnpfcli = cnpfcli;
        this.ruacli = ruacli;
        this.cidadecli = cidadecli;
        this.estadocli = estadocli;
        this.cepcli = cepcli;
        this.bairrocli = bairrocli;
        this.ncasacli = ncasacli;
        this.telcli1 = telcli1;
        this.telcli2 = telcli2;
        this.emailcli = emailcli;
    }

    public Long getCodigocli() {
        return codigocli;
    }

    public void setCodigocli(Long codigocli) {
        this.codigocli = codigocli;
    }

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
    }

    public String getCnpfcli() {
        return cnpfcli;
    }

    public void setCnpfcli(String cnpfcli) {
        this.cnpfcli = cnpfcli;
    }

    public String getRuacli() {
        return ruacli;
    }

    public void setRuacli(String ruacli) {
        this.ruacli = ruacli;
    }

    public String getCidadecli() {
        return cidadecli;
    }

    public void setCidadecli(String cidadecli) {
        this.cidadecli = cidadecli;
    }

    public String getEstadocli() {
        return estadocli;
    }

    public void setEstadocli(String estadocli) {
        this.estadocli = estadocli;
    }

    public String getCepcli() {
        return cepcli;
    }

    public void setCepcli(String cepcli) {
        this.cepcli = cepcli;
    }

    public String getBairrocli() {
        return bairrocli;
    }

    public void setBairrocli(String bairrocli) {
        this.bairrocli = bairrocli;
    }

    public String getNcasacli() {
        return ncasacli;
    }

    public void setNcasacli(String ncasacli) {
        this.ncasacli = ncasacli;
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