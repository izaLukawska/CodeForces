package CodeForces;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CodeForces_112ATest {

	@Test
	void shouldThrowIllegalArgumentException(){
		//given
		String first = "aaaa";
		String second = "aaa";

		//then
		assertThatThrownBy(() -> CodeForces_112A.stringComparison(first, second))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("Strings must be equal");
	}

	@Test
	void shouldReturnNegativeOne(){
		//given
		String first = "abs";
		String second = "Abz";
		int expectedResult = -1;

		//when
		int actualResult = CodeForces_112A.stringComparison(first, second);

		//then
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void shouldReturnPositiveOne(){
		//given
		String first = "abcc";
		String second = "AbCd";
		int expectedResult = -1;

		//when
		int actualResult = CodeForces_112A.stringComparison(first, second);

		//then
		assertEquals(expectedResult, actualResult);

	}

	@Test
	void shouldReturnZero(){
		//given
		String first = "aaaa";
		String second = "aaaA";
		int expectedResult = 0;

		//when
		int actualResult = CodeForces_112A.stringComparison(first, second);

		//then
		assertEquals(expectedResult, actualResult);
	}
}