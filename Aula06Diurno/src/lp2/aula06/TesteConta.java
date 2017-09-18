/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula06;

/**
 *
 * @author Danilo Abreu
 */
public class TesteConta {

    public static void main(String args[]) {
        System.out.println(Conta.getQuantidade());
        Conta c1 = new Conta();
        Cliente cliente = new Cliente();
        c1.setCorrentista(cliente);
        c1.setSaldo(100);
        c1.getCorrentista().setNome("Danilo");
        System.out.println(c1.getSaldo());
        System.out.println(c1.getCorrentista().getNome());
        System.out.println(Conta.getQuantidade());
    }

}
