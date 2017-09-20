package neel;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {

	@Test
	public void test() {
		int a = 1;
		int b = 5;
		Math math = new Math();
		int expected = 6;
		int actual = math.add(a, b);
		assertEquals(expected, actual);
	}

}
