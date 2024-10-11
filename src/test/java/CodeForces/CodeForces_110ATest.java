package CodeForces;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeForces_110ATest {

	@Test
	void shouldThrowIllegalArgumentException(){
		//given
		long number = 0;

		//then
		assertThatThrownBy(() -> CodeForces_110A.nearlyLuckNumber(number))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("Number must be in the range 1 to 10^18.");
	}

	@Test
	void shouldReturnNegativeAnswer(){
		//given
		long number = 40047;
		String expectedResult = "NO";

		//when
		String actualResult = CodeForces_110A.nearlyLuckNumber(number);

		//then
		assertEquals(expectedResult, actualResult);

	}

	@Test
	void shouldReturnPositiveAnswer(){
		//given
		long number = 7747774;
		String expectedResult = "YES";

		//when
		String actualResult = CodeForces_110A.nearlyLuckNumber(number);

		//then
		assertEquals(expectedResult, actualResult);
	}
}
