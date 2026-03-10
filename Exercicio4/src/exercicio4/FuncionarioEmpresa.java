/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author hahnm
 */
public class FuncionarioEmpresa {
     private String nome;
    private String cargo;
    private double salario;
    private String departamento;

    public FuncionarioEmpresa(String nome, String cargo, double salario, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() { return nome; }
    public String getCargo() { return cargo; }

}
