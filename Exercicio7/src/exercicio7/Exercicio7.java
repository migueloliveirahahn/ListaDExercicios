/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

/**
 *
 * @author hahnm
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         AlunoCurso a1 = new AlunoCurso("Miguel", "Engenharia", 3, "202301");
        AlunoCurso a2 = new AlunoCurso("Thaise", "Direito", 2, "202302");

        System.out.println(a1.getNome() + " - " + a1.getCurso());
        System.out.println(a2.getNome() + " - " + a2.getCurso());
    }
    
}
