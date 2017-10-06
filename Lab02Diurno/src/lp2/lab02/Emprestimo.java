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
public class Emprestimo {
    private Acervo acervos[]= new Acervo[3];
    private int quantidadeAcervo=0;

    public Acervo[] getAcervos() {
        return acervos;
    }

    public void setAcervos(Acervo livro) {
        this.acervos[this.quantidadeAcervo] = livro;
        this.quantidadeAcervo++;
    }

    public int getQuantidadeAcervo() {
        return quantidadeAcervo;
    }
}
