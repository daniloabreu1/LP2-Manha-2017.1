/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula05;

/**
 *
 * @author Danilo Abreu
 */
public class TesteConta {

    public static void main(String args[]) {
        Cliente c1 = new Cliente("José da Silva");
        
        
        c1.cpf = "111.111.111-11";

        Conta conta1 = new Conta(c1);
        Conta conta2 = new Conta();
        Conta conta3 = new Conta(c1,234);
        
        conta1.numero = 123;
        conta1.limite = 250;
        conta1.saldo = 100;


        System.out.println("Numero da conta: " + conta1.numero);
        System.out.println("Cliente: " + conta1.correntista.nome);
        System.out.println("CPF: " + conta1.correntista.cpf);
        System.out.println("Limite: " + conta1.limite);
        System.out.println("Saldo: " + conta1.saldo);

        conta1.depositarValor(100);
        System.out.println("Novo Saldo: " + conta1.saldo);

        conta1.correntista.mudarNome("Jose da Silva Souza");
        System.out.println("Cliente: " + conta1.correntista.nome);
        System.out.println("Saldo + Limite: "+conta1.consultarSaldo());
    }

}
