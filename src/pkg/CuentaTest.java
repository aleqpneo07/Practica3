package pkg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void test0014_CuentasConLimiteDeDescubierto()throws Exception {
	    Cuenta c1 = new Cuenta("12345", "Cliente1", 50.0);
	    Cuenta c2 = new Cuenta("67890", "Cliente2", 0.0);

	    // 1
	    c1.retirar(200.0);
	    assertEquals(-150.0, c1.getSaldo(), 0.001);

	    // 2
	    c2.retirar(350.0);
	    assertEquals(-350.0, c2.getSaldo(), 0.001);

	    // 3
	    c1.ingresar(100.0);
	    assertEquals(-50.0, c1.getSaldo(), 0.001);

	    // 4 (rechazado)
	    assertThrows(FondosInsuficientesException.class, () -> c2.retirar(200.0));
	    assertEquals(-350.0, c2.getSaldo(), 0.001);

	    // 5
	    c2.retirar(150.0);
	    assertEquals(-500.0, c2.getSaldo(), 0.001);

	    // 6
	    c1.retirar(200.0);
	    assertEquals(-250.0, c1.getSaldo(), 0.001);

	    // 7
	    c2.ingresar(50.0);
	    assertEquals(-450.0, c2.getSaldo(), 0.001);

	    // 8 (rechazado)
	    assertThrows(FondosInsuficientesException.class, () -> c2.retirar(100.0));
	    assertEquals(-450.0, c2.getSaldo(), 0.001);
	}

}

