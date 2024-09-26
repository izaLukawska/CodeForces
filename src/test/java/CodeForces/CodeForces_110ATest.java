package CodeForces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CodeForces_110A_Test {

	@Test
	void shouldThrowIllegalArgumentExceptionWithMessage(){
		//given
		String expectedMessage = "Number must be in the range 1 to 10^18.";
		long number = 0;

		//when
		Exception exception = assertThrows(IllegalArgumentException.class, () -> CodeForces_110A.nearlyLuckNumber(number));
		String actualMessage = exception.getMessage();

		//then
		assertEquals(expectedMessage, actualMessage);
	}

	@Test
	void shouldReturnYesAsAnswer(){
		//given
		long number = 7747774L;
		String expectedAnswer = "YES";

		//when
		String actualAnswer = CodeForces_110A.nearlyLuckNumber(number);

		//then
		assertEquals(expectedAnswer, actualAnswer);
	}

	@Test
	void shouldReturnNoAsAnswer(){
		//given
		long number = 40047L;
		String expectedAnswer = "NO";

		//when
		String actualAnswer = CodeForces_110A.nearlyLuckNumber(number);

		//then
		assertEquals(expectedAnswer, actualAnswer);
	}
}