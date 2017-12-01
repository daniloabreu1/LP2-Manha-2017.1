/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Danilo Abreu
 */
public class TesteCliente {
    public static void main(String[] args) {
        List<Cliente> lista = new ArrayList<>();
        lista.add(new Cliente("maria", 1209));
        lista.add(new Cliente("pedro", 1201));
        lista.add(new Cliente("afonso", 1211));
        lista.add(new Cliente("julia", 1208));
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).nome+" "+lista.get(i).mat);
        }
        Collections.sort(lista);
        System.out.println("");
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).nome+" "+lista.get(i).mat);
        }
        System.out.println( Collections.max(lista).nome);
        System.out.println(Collections.binarySearch(lista, new Cliente("afonso", 1211)));
    }
    
}
