/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author hahnm
 */
public class Computador {
     private String marca;
    private String processador;
    private int memoriaRAM;
    private double preco;

    public Computador(String marca, String processador, int memoriaRAM, double preco) {
        this.marca = marca;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.preco = preco;
    }

    public String getMarca() { return marca; }
    public String getProcessador() { return processador; }
    public int getMemoriaRAM() { return memoriaRAM; }
    public double getPreco() { return preco; }

    public void setPreco(double preco) { this.preco = preco; }
}
