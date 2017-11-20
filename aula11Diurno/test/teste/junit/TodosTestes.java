/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.junit;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Danilo Abreu
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({teste.junit.TesteGerente.class, teste.junit.TesteComum.class})
public class TodosTestes {

    @Before
    public void setUp() throws Exception {
    }
    
}
