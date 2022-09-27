/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author EMPRESA JUNIOR
 */
public class Venda {
    private int idVenda;
    private int idProduto;
    private int idCliente;
    private double precounprod;
    private double quantidade;
    private double precototalvenda;
    private String tipopag;
    private double desc;
    
    
    public Venda(){
        
    }

    public Venda(int idVenda, int idProduto, int idCliente, double precounprod, double quantidade, double precototalvenda, String tipopag, double desc) {
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.idCliente = idCliente;
        this.precounprod = precounprod;
        this.quantidade = quantidade;
        this.precototalvenda = precototalvenda;
        this.tipopag = tipopag;
        this.desc = desc;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getPrecounprod() {
        return precounprod;
    }

    public void setPrecounprod(double precounprod) {
        this.precounprod = precounprod;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecototalvenda() {
        return precototalvenda;
    }

    public void setPrecototalvenda(double precototalvenda) {
        this.precototalvenda = precototalvenda;
    }

    public String getTipopag() {
        return tipopag;
    }

    public void setTipopag(String tipopag) {
        this.tipopag = tipopag;
    }

    public double getDesc() {
        return desc;
    }

    public void setDesc(double desc) {
        this.desc = desc;
    }

    
    
}
