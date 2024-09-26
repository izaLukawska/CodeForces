package CodeForces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CodeForces_50ATest {

	@Test
	void shouldReturnMaximalDominoCountThatFitsInBoard(){
		//given
		int width = 3;
		int length = 3;
		int expectedCount = 4;

		//when
		int actualCount = CodeForces_50A.dominoCount(width, length);

		//then
		assertEquals(expectedCount, actualCount);
	}

	@Test
	void shouldThrowIllegalArgumentExceptionWithMessage(){
		//given
		int width = 0;
		int length = 17;
		String expectedMessage = "The range is: 1 <= width <= length <= 16";

		//when
		Exception exception = assertThrows(IllegalArgumentException.class, () -> CodeForces_50A.dominoCount(width, length));
		String actualMessage = exception.getMessage();

		//then
		assertEquals(expectedMessage, actualMessage);
	}
}
