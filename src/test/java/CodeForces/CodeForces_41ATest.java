package CodeForces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeForces_41ATest {

	@Test
	void shouldReturnYesAsAnswer(){
		//given
		String firstWord = "abcd";
		String secondWord = "dcba";
		String expectedResult = "YES";

		//when
		String actualResult = CodeForces_41A.correctTranslation(firstWord, secondWord);

		//then
		assertEquals(expectedResult, actualResult);

	}
	@Test
	void shouldReturnNoAsAnswer(){
		//given
		String firstWord = "abcd";
		String secondWord = "abcd";
		String expectedResult = "NO";

		//when
		String actualResult = CodeForces_41A.correctTranslation(firstWord, secondWord);

		//then
		assertEquals(expectedResult, actualResult);

	}

	@Test
	void shouldThrowIllegalArgumentException(){
		//given
		String expectedMessage = "Words length need to be less than 100";
		String firstWord = "abcd";
		String secondWord = "";

		//when
		Exception exception = assertThrows(IllegalArgumentException.class, () -> CodeForces_41A.correctTranslation(firstWord, secondWord));
		String actualMessage = exception.getMessage();

		//then
		assertEquals(expectedMessage, actualMessage);
	}
}