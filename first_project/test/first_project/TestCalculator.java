package first_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import prepare.Calculator;

class TestCalculator {

	Calculator calculator = new Calculator();

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("runing the before method");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("runing the after method");
	}

	
	@Test
	void testMultiply() {
		System.out.println("20, calculator.multiply(2,10)");
		assertEquals(20, calculator.multiply(2,10));
//		fail("Not yet implemented");
	}
	
	@Test
	void testAdd() {
		assertEquals(12, calculator.add(2,10));
		System.out.println("20, calculator.add(2,10)");
//		fail("Not yet implemented");
	}



}
