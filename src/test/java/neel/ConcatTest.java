package neel;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void testConcat2() {
		String a = "Hello";
		String b = "World";
		Concat concat = new Concat();
		String expected = "HelloWorld";
		String actual = concat.concat2(a, b);
		assertEquals(expected, actual);
	}

}
