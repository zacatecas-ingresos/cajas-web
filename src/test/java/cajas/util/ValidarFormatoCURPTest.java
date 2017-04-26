/*
 * ValidarFormatoCURPTest.java
 * Creado el 26/Apr/2017 1:04:27 PM
 * 
 */
package cajas.util;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
 */
public class ValidarFormatoCURPTest {
    
    public ValidarFormatoCURPTest() {
    }

    /**
     * Test of validarCurp method, of class ValidarFormatoCURP.
     */
    @Test
    public void testValidarCurp() {
        String curp = "MARK921015HZSTRX00";
        boolean valido = ValidarFormatoCURP.validarCurp(curp);
        assertTrue(valido);
    }
    
}
