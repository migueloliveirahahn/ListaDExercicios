/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

/**
 *
 * @author hahnm
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          CarroAluguel carro = new CarroAluguel("Civic", "Honda", 2022, 180);

        carro.setValorDiaria(200);

        System.out.println(carro.getModelo());
        System.out.println(carro.getMarca());
        System.out.println(carro.getAno());
        System.out.println(carro.getValorDiaria());
    }
    
}
