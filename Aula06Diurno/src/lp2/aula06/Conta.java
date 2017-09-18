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
public class Conta {

    private double limite = 600, saldo;
    private int numero;
    private Cliente correntista;
    private static int quantidade=0;

    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int quantidade) {
        Conta.quantidade = quantidade;
    }
            
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    private void descontarTarifa() {
        this.saldo -= 0.10;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }

    Conta(){
        setQuantidade(getQuantidade()+1);
    }
    
    public void depositarValor(double valor) {
        setSaldo(getSaldo() + valor);
        descontarTarifa();
    }

    public double consultarSaldo() {
        return this.getSaldo() + this.getLimite();
    }

    private boolean verificarSaldo(double valor) {
        boolean t = false;

        return t;
    }

    public void tranferirValor(Cliente destino, double valor) {
        if (verificarSaldo(valor)) {
            descontarTarifa();
        } else {
            System.out.println("Transferencia nao realizada");
        }
    }

}
