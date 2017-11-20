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
public class Gerente extends Funcionario{
    private double bonificacao;

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    @Override
    public double getSalario(){
        return super.getSalario()+this.getBonificacao();
    }
}
