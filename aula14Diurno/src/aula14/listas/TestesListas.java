package aula14.listas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo Abreu
 */
public class TestesListas {
    public static void main(String[] args) {
        List <String> lista = new ArrayList<>();
        lista.add("Joao");
        lista.add("Ana");
        lista.add("Fátima");
        lista.add("Bruna");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        
        
        
        
    }
}
