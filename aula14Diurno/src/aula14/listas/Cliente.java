package aula14.listas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Danilo Abreu
 */
public class Cliente implements Comparable<Cliente> {

    String nome;
    int mat;

    public Cliente(String nome, int mat) {
        this.nome = nome;
        this.mat = mat;
    }

    @Override
    public int compareTo(Cliente o) {
        if (this.mat > o.mat) {
            return 1;
        } else {
            if (this.mat < o.mat) {
                return -1;
            } else {
                return 0;
            }
            
        }

    }
}