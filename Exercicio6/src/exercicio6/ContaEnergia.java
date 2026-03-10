/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

/**
 *
 * @author hahnm
 */
public class ContaEnergia {
      private String nomeCliente;
    private int numeroInstalacao;
    private double consumoKwh;
    private double valorConta;

    public ContaEnergia(String nomeCliente, int numeroInstalacao, double consumoKwh, double valorConta) {
        this.nomeCliente = nomeCliente;
        this.numeroInstalacao = numeroInstalacao;
        this.consumoKwh = consumoKwh;
        this.valorConta = valorConta;
    }

    public String getNomeCliente() { return nomeCliente; }
    public int getNumeroInstalacao() { return numeroInstalacao; }
    public double getConsumoKwh() { return consumoKwh; }
    public double getValorConta() { return valorConta; }

    public void setConsumoKwh(double consumoKwh) {
        this.consumoKwh = consumoKwh;
    }
}
