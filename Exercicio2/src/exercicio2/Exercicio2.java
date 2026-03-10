/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author hahnm
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LivroBiblioteca livro = new LivroBiblioteca("Java Básico", "João Silva", 250, 2018);

        livro.setAnoPublicacao(2022);

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Páginas: " + livro.getNumeroPaginas());
        System.out.println("Ano: " + livro.getAnoPublicacao());
    }
    
}
