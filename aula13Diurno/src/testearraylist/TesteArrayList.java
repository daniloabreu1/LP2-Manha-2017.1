/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testearraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danilo Abreu
 */
public class TesteArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List lista = new ArrayList();
        lista.add("danilo abreu");
        lista.add("danilo abreu");
        List lista2 = new ArrayList();
        lista2.add("danilo abreu");
        lista.add(3);
        lista.removeAll(lista2);
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        
        
    }
    
}
