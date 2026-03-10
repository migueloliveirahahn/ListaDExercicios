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
public class AlunoCurso {
      private String nome;
    private String curso;
    private int semestre;
    private String matricula;

    public AlunoCurso(String nome, String curso, int semestre, String matricula) {
        this.nome = nome;
        this.curso = curso;
        this.semestre = semestre;
        this.matricula = matricula;
    }
     public String getNome() { return nome; }
    public String getCurso() { return curso; }
}
