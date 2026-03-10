/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author hahnm
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Filme filme = new Filme("Matrix", "Wachowski", 130, "14");

        filme.setClassificacao("16");

        System.out.println(filme.getTitulo());
        System.out.println(filme.getDiretor());
        System.out.println(filme.getDuracao());
        System.out.println(filme.getClassificacao());
    }
    
}
