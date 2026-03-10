/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author hahnm
 */
public class ProdutoTecnologia {

    private String nomeProduto;
    private String marca;
    private double preco;
    private int quantidadeEstoque;

    public ProdutoTecnologia(String nomeProduto, String marca, double preco, int quantidadeEstoque) {
        this.nomeProduto = nomeProduto;
        this.marca = marca;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Estoque: " + quantidadeEstoque);
        System.out.println();
      }
    }
