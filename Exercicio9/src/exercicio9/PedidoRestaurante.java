/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

/**
 *
 * @author hahnm
 */
public class PedidoRestaurante {
     private String nomeCliente;
    private String prato;
    private String bebida;
    private double valorTotal;

    public PedidoRestaurante(String nomeCliente, String prato, String bebida, double valorTotal) {
        this.nomeCliente = nomeCliente;
        this.prato = prato;
        this.bebida = bebida;
        this.valorTotal = valorTotal;
    }

    public String getNomeCliente() { return nomeCliente; }
    public String getPrato() { return prato; }
    public String getBebida() { return bebida; }
    public double getValorTotal() { return valorTotal; }

    public void setBebida(String bebida) {
        this.bebida = bebida;
 }
}
