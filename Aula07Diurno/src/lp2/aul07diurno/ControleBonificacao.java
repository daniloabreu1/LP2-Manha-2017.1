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
public class ControleBonificacao {
    private double totalBonificacao=0;

    public double getTotalBonificacao() {
        return totalBonificacao;
    }

    public void registrarBonificacao(Funcionario f) {
        this.totalBonificacao += f.getBonificacao();
    }
   

}
