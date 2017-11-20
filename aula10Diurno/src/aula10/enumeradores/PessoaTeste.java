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
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(TipoPessoa.PESSOA_JURIDICA, "Maria ");
        System.out.println(p);
    }
}
