/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11.codigo;

/**
 *
 * @author Danilo Abreu
 */
public class Funcionario {
    private double salario;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
