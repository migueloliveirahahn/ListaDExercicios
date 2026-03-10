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
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaEnergia conta = new ContaEnergia("Pedro", 12345, 200, 180);

        conta.setConsumoKwh(250);

        System.out.println(conta.getNomeCliente());
        System.out.println(conta.getNumeroInstalacao());
        System.out.println(conta.getConsumoKwh());
        System.out.println(conta.getValorConta());
    }
    
}
