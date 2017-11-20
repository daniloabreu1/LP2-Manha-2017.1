/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.enumeradores;

/**
 *
 * @author Danilo Abreu
 */
public class Pessoa {
    
    private TipoPessoa tipo;
    private String nome;

    public Pessoa(TipoPessoa tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "tipo=" + tipo.getNome() + ", nome=" + nome +
                ", numero = "+ tipo.getNumero()+'}';
    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
