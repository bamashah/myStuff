package neel;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {

	@Test
	public void testAdd() {
		int a = 1;
		int b = 5;
		Math math = new Math();
		int expected = 6;
		int actual = math.add(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void testSubstract() {
		int a = 7;
		int b = 4;
		Math math = new Math();
		int expected = 3;
		int actual = math.substract(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void testMultiply() {
		int a = 3;
		int b = 3;
		Math math = new Math();
		int expected = 9;
		int actual = math.multiply(a, b);
		assertEquals(expected, actual);
	}
}
