package CodeForces;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CodeForces_59ATest {

	@Test
	void shouldThrowNullPointerException(){
		//given
		String word = null;

		//then
		assertThatThrownBy(() -> CodeForces_59A.correctedWord(word))
				.isInstanceOf(NullPointerException.class)
						.hasMessage("Word can't be null.");

	}
	@Test
	void shouldReturnWordInUpperCase() {
		//given
		String word = "ViP";
		String expectedResult = "VIP";

		//when
		String actualResult = CodeForces_59A.correctedWord(word);

		//then
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void shouldReturnWordInLowerCase() {
		//given
		String word = "viP";
		String expectedResult = "vip";

		//when
		String actualResult = CodeForces_59A.correctedWord(word);

		//then
		assertEquals(expectedResult, actualResult);
	}
}