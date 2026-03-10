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
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProdutoTecnologia p1 = new ProdutoTecnologia("Notebook", "Dell", 3500, 10);
        ProdutoTecnologia p2 = new ProdutoTecnologia("Mouse", "Logitech", 120, 50);

        p1.exibirProduto();
        p2.exibirProduto();
    }
    
}
