package calc;

//hihiug
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CaculatorTest {
	private static CalculatorMain calc;
	@BeforeClass
	public static void setup(){
		calc = new CalculatorMain();
	}
	@Test
	public void testAdd() {
		assertEquals(5, calc.add(3,2));
	}
	@Test
	public void testSub() {
		assertEquals(1, calc.sub(3,2));
	}
	@Test
	public void testMul() {
		assertEquals(6, calc.mul(3,2));
	}
	@Test
	public void testDiv() {
		assertEquals(1, calc.div(2,2));
	}
	@Test
	public void testDivByZero() {
		assertEquals(0, calc.div(3,0));
	}
	@Test
	public void testPresedence() {
		assertEquals(30, calc.add(calc.mul(5, 5), calc.div(10, 2)));
	}
	@Test
	public void testRem() {
		assertEquals(1, calc.rem(4,3));
	}
	@Test
	public void testdoub() {
		assertEquals(4, calc.doub(2));
	}
	@Test
	public void testhalf() {
		assertEquals(4, calc.half(8));
	}
	@Test
	public void testtrip() {
		assertEquals(6, calc.trip(2));
	}
}
