package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.FuncionesRecursivas;

class FuncionesRecursivasTest {

	@ParameterizedTest
	@MethodSource("sumatorio")
	void testSumatorio(int num, int esperado) {
		int res = FuncionesRecursivas.sumatorio(num);
		assertEquals(esperado, res);
	}

	private static Stream<Arguments> sumatorio() {
		return Stream.of(
				Arguments.of(5, 15),
				Arguments.of(3, 6),
				Arguments.of(1, 1)
				);
	}
	
	
	@ParameterizedTest
	@MethodSource("potencia")
	void testPotencia(double num, int potencia, int esperado) {
		double res = FuncionesRecursivas.potencia(num,potencia);
		assertEquals(esperado, res);
	}

	private static Stream<Arguments> potencia() {
		return Stream.of(
				Arguments.of(2, 2, 4),
				Arguments.of(5, 2, 25),
				Arguments.of(2, 5, 32)
				);
	}
	
	
	@ParameterizedTest
	@MethodSource("fibonacci")
	void testFibonacci(int num, int esperado) {
		int res = FuncionesRecursivas.fibonacci(num);
		assertEquals(esperado, res);
	}

	private static Stream<Arguments> fibonacci() {
		return Stream.of(
				Arguments.of(6, 8),
				Arguments.of(20, 6765),
				Arguments.of(10, 55)
				);
	}

}
