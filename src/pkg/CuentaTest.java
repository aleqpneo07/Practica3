package pkg;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CuentaTest {

    @Test
    public void testIngresar() {
        Cuenta c = new Cuenta("ES123", "Juan Pérez");
        c.ingresar(100.0);
        assertEquals(100.0, c.getSaldo(), 0.001);
    }

    @Test
    public void testRetirar() {
        Cuenta c = new Cuenta("ES123", "Juan Pérez");
        c.ingresar(200.0);
        c.retirar(50.0);
        assertEquals(150.0, c.getSaldo(), 0.001);
    }
}

