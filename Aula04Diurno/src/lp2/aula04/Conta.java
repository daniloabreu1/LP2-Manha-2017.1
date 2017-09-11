/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula04;

/**
 *
 * @author Danilo Abreu
 */
public class Conta {
    double limite=600, saldo;
    int numero; 
    Cliente correntista;
    
    void depositarValor(double valor){
        saldo +=valor;
    }
    
    double consultarSaldo(){
        return this.saldo+this.limite;
    }
    
    double saldoSimples(){
        return this.saldo;
    }
    
    boolean verificarSaldo(double valor){
        boolean t= false;
        
        return t;
    }
    
    void tranferirValor(Cliente destino, double valor){
        if(verificarSaldo(valor)){
            
        }else{
            System.out.println("Transferencia nao realizada");
        }
    }
}
