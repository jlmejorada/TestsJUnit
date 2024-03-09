package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Tablas;

class TablasTest {

	@ParameterizedTest
	@MethodSource("sumatorio")
	void testSumatorio(int[][] matriz, boolean esperado) {
		boolean res = Tablas.esMagica(matriz);
		assertEquals(esperado, res);
	}

	private static Stream<Arguments> sumatorio() {
		int[][] matrizMagica = { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } };
		int[][] matrizNoMagica = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		return Stream.of(
				Arguments.of(matrizMagica, true),
				Arguments.of(matrizNoMagica, false)
				);
	}
	
	
	

}
