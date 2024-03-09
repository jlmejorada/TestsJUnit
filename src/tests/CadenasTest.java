package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Cadenas;

class CadenasTest {

	@ParameterizedTest
	@MethodSource("cuentaEspacios")
	void testCuentaEspacios(String frase, int esperado) {
		Cadenas prueba = new Cadenas(frase);
		int res = prueba.cuentaEspacios();
		assertEquals(esperado, res);
	}

	private static Stream<Arguments> cuentaEspacios() {
		return Stream.of(
				Arguments.of("hola",0),
				Arguments.of("hola, que tal",2)
				);
	}
	
	
	@ParameterizedTest
	@MethodSource("reves")
	void testReves(String palabra, String esperado) {
		Cadenas prueba = new Cadenas(palabra);
		String res = prueba.delReves();
		assertEquals(esperado, res);
	}

	private static Stream<Arguments> reves() {
		return Stream.of(
				Arguments.of("hola","aloh"),
				Arguments.of("Hola, que tal", "lat euq ,aloH")
				);
	}
	
	
	@ParameterizedTest
	@MethodSource("cuenta")
	void testCuenta(String frase, String palabra, int esperado) {
		Cadenas prueba = new Cadenas(frase);
		int res = prueba.contarPalabra(palabra);
		assertEquals(esperado, res);
	}

	private static Stream<Arguments> cuenta() {
		return Stream.of(
				Arguments.of("Buenas, que tal?","que",1),
				Arguments.of("No pero, y si si","si",2)
				);
	}

}
