/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.lab02;

/**
 *
 * @author Danilo Abreu
 */
public class TesteLib {
    public static void imprimeEmprestimo(Emprestimo e) {
        for (int i = 0; i < e.getQuantidadeAcervo(); i++) {
            System.out.println("Titulo: " + e.getAcervos()[i].getTitulo());

        }
    }
    public static void main(String args[]){
        
    }
}
