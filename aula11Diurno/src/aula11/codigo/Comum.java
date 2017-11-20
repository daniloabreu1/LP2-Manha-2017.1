/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11.codigo;

/**
 *
 * @author Danilo Abreu
 */
public class Comum extends Funcionario{

     private static double abono;

    public static double getAbono() {
        return abono;
    }

    public static void setAbono(double abono) {
        Comum.abono = abono;
    }
     
    @Override
    public double getSalario() {
        return Comum.getAbono()+super.getSalario();
    }
    
}
