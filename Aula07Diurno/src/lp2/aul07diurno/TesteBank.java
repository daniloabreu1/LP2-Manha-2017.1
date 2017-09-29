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
public class TesteBank {

    public static void main(String args[]) {
        Gerente g1 = new Gerente("jose");
        Funcionario f1 = g1;
        ControleBonificacao c = new ControleBonificacao();
        g1.setCpf("111222333445");
        g1.setSenha(1234);
       
        f1.setSalario(2000);
        System.out.println("Bonificacao: "+f1.getBonificacao());
        c.registrarBonificacao(g1);
        Funcionario f2 = new Funcionario("Maria");
        f2.setSalario(1000);
        System.out.println("Bonificacao: "+f2.getBonificacao());
        c.registrarBonificacao(f2);
        System.out.println("Total de Bonificacao:"+c.getTotalBonificacao());
        System.out.println("");
    }

}
