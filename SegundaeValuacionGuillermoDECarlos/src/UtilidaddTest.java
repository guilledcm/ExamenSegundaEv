import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class UtilidaddTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	
	
	@TestUno
	public static void test() {
		int=0;
		esperado=0;
		assertEquals(esperado,resultado,0);
	}
	
	@TestDos
	public static void test() {
		int=2;
		esperado=4;
		assertEquals(esperado,resultado,0);
	}

	@TestTres
	public static void test() {
		int=3;
		esperado=9;
		assertEquals(esperado,resultado,0);
	}

	@TestCuatro
	public static void test() {
		int=4;
		esperado=28;
		assertEquals(esperado,resultado,0);
	}

	@TestCinco
	public static void test() {
		int=5;
		esperado=125;
		assertEquals(esperado,resultado,0);
	}

}
