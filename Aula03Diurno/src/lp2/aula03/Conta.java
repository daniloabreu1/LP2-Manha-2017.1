/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula03;

/**
 *
 * @author Danilo Abreu
 */
public class Conta {
    double limite=600, saldo;
    int numero; 
    public static void main(String args[]){
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        //conta1.limite=500;
        conta1.saldo=250;
        conta1.numero=123;
        
        System.out.println(conta1.saldo);
        System.out.println(conta1.limite);
        System.out.println(conta1.numero);
        
        System.out.println(conta2.saldo);
        System.out.println(conta2.limite);
        System.out.println(conta2.numero);
    }
}
