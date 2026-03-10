/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

/**
 *
 * @author hahnm
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         PedidoRestaurante pedido = new PedidoRestaurante("João", "Pizza", "Refrigerante", 50);

        pedido.setBebida("Suco");

        System.out.println(pedido.getNomeCliente());
        System.out.println(pedido.getPrato());
        System.out.println(pedido.getBebida());
        System.out.println(pedido.getValorTotal());
    }
    
}
