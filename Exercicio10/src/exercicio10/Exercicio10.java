/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

/**
 *
 * @author hahnm
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Smartphone s1 = new Smartphone("Galaxy S23", "Samsung", 128, 4000);
        Smartphone s2 = new Smartphone("iPhone 14", "Apple", 128, 6000);

        s2.setArmazenamento(256);

        System.out.println(s1.getModelo() + " " + s1.getArmazenamento());
        System.out.println(s2.getModelo() + " " + s2.getArmazenamento());
    }
    
}
