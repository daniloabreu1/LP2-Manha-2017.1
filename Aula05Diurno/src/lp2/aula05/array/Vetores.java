/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula05.array;

import java.util.Arrays;

/**
 *
 * @author Danilo Abreu
 */
public class Vetores {
    public static void main(String args[])   {
        int[] vet= {46,6,780,82,9};
        String nomes[]={"joao","maria"};
        Arrays.sort(vet);
        
        int vet2[]=new int[3];
        
        Arrays.fill(vet2, 10);
        for(int i:vet2){
            System.out.println(i);
        }
        
        for(int i:vet){
            System.out.println(i);
        }
        for(String i:nomes){
            System.out.println(i);
        }
        
      
        
    }
}
