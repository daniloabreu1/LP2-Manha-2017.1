/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aul07diurno;

/**
 *
 * @author Danilo Abreu
 */
public class Gerente extends Funcionario {

    private int senha;

    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao()+1000;
    }

    public boolean autenticarSenha(int senha) {
        return this.getSenha() == senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}
