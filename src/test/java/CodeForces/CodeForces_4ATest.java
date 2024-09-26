package CodeForces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeForces_4ATest {

	@Test
	void shouldReturnYesAsAnswer(){
		//given
		int weight = 4;
		String expectedResult = "YES";

		//when
		String actualResult = CodeForces_4A.canDivideInTwoParts(weight);

		//then
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void shouldReturnNoAsAnswer(){
		//given
		int weight = 3;
		String expectedResult = "NO";

		//when
		String actualResult = CodeForces_4A.canDivideInTwoParts(weight);

		//then
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void shouldThrowIllegalArgumentException(){
		//given
		int weight = 0;
		String expectedMessage = "Weight must be in the range 1 to 100.";

		//when
		Exception exception = assertThrows(IllegalArgumentException.class,
				() -> CodeForces_4A.canDivideInTwoParts(weight));

		//then
		assertEquals(expectedMessage, exception.getMessage());
	}
}