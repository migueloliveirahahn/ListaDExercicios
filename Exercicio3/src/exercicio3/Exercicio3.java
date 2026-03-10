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
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Computador pc = new Computador("HP", "i7", 16, 4500);

        pc.setPreco(4200);

        System.out.println("Marca: " + pc.getMarca());
        System.out.println("Processador: " + pc.getProcessador());
        System.out.println("RAM: " + pc.getMemoriaRAM());
        System.out.println("Preço: " + pc.getPreco());
    }
    
    
}
