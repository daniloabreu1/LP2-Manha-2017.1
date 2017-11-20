/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.junit;

import aula11.codigo.Gerente;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Danilo Abreu
 */
public class TesteGerente {
       
    @Before
    public void setUp() {
    }
    
    @Test
    public void SalarioBonificacao(){
        Gerente g = new Gerente();
        g.setSalario(5000);
        g.setBonificacao(1500);
        assertEquals(6500, g.getSalario(),0.0);
    }
}
