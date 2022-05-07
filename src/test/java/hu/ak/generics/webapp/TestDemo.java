package hu.ak.generics.webapp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestDemo {

	@Test
	public void testSuccess() {
		assertTrue(3 == 3);
	}
	
	@Test
	public void testFailure() {
		assertTrue(2 == 2);
	}
	
}
