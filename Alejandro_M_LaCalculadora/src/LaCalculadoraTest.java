import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

class LaCalculadoraTest {

	@Test
	public void testSuma() {
		int res = LaCalculadora.suma(20,20);
		assertEquals(30,res);
		fail("Not yet implemented");
	}

	@Test
	public void testResta() {
		int res = LaCalculadora.resta(10,9);
		assertEquals(0,res);
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplicacio() {
		int res = LaCalculadora.multiplicacio(5,6);
		assertEquals(30,res);
		fail("Not yet implemented");
	}

	@Test
	public void testDivisio() {
		int res = LaCalculadora.divisio(90,3);
		assertEquals(30,res);
		fail("Not yet implemented");
	}

}
	

