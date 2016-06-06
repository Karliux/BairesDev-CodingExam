package bairesDev.exam.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FactorialCalculatorTest {
	
	@Test
	public void getFactorialFromZero() throws Exception {
		Double factorial = FactorialCalculator.calculate(0);

		assertEquals(Double.valueOf(1d), factorial);
	}

	@Test
	public void calculate() throws Exception {
		Double factorial = FactorialCalculator.calculate(15);

		assertEquals(Double.valueOf(1307674368000d), factorial);
	}
}
