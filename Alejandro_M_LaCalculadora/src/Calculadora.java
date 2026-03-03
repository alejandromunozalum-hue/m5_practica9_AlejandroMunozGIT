import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CalculadoraTestDivisio.class, CalculadoraTestMultiplicacio.class, CalculadoraTestResta.class,
		CalculadoraTestSuma.class })
public class Calculadora {

}
