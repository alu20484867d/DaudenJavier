package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejecutable_RPNTest {

	/*@Test
	void test() {
		fail("No implementado aun");
	}*/
	
	@Test
	void test_01() {
		System.out.println("4 5 * 7 2 / - 3 %");
	}

	@Test 
	void test_02() {
		System.out.println("4 6 * 7 2 / - 3 %");
	}
	
	@Test 
	void test_03() {
		System.out.println("4 5 * 7 5 / - 3 %");
	}
	
	@Test 
	void test_04() {
		System.out.println("4 5 * 7 2 / - 9 %");
	}
	

}
