/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.junit;

import aula11.codigo.Comum;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Danilo Abreu
 */
public class TesteComum {
     Comum c;
    @Before
    public void setUp() {
        c = new Comum();
    }
  
    @Test
    public void VerificarSalario(){    
        c.setSalario(1000);
        c.setAbono(100);
        assertEquals(1100, c.getSalario(),0.0);
        c.setAbono(200);
        assertTrue(c.getSalario()==1200);
    }
    
    @Test
    public void VerificaNome(){
        c.setNome("Carlos");
        assertEquals("Carlos", c.getNome());
    }
}
