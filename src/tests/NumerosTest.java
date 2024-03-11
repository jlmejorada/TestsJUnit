package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Numeros;

class NumerosTest {

	@ParameterizedTest
	@MethodSource("primo")
	void testPrimo(int numero, boolean esperado) {
		Numeros prueba = new Numeros(numero);
		boolean res = prueba.esPrimo();
		assertEquals(esperado, res);
	}

	private static Stream<Arguments> primo() {
		return Stream.of(
				Arguments.of(1,false),
				Arguments.of(3,true), 
				Arguments.of(5,true), 
				Arguments.of(4,false)
				
				);
	}
	
	
	@ParameterizedTest
	@MethodSource("capicua")
	void testCapicua(int numero, boolean esperado) {
		Numeros prueba = new Numeros(numero);
		boolean res = prueba.esCapicua();
		assertEquals(esperado, res);
	}

	private static Stream<Arguments> capicua() {
		return Stream.of(
				Arguments.of(-7,false),
				Arguments.of(10,false), 
				Arguments.of(121,true)
				
				);
	}	

}
