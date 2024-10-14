package CodeForces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeForces_200BTest {

	@Test
	void shouldReturnCorrectVolume(){
		//given
		int numberOfDrinks = 3;
		String volume = "50 50 100";
		float expectedVolume = 66.666666666667f;

		//when
		float actualVolume = CodeForces_200B.orangeJuicePercent(numberOfDrinks, volume);

		//then
		assertEquals(expectedVolume, actualVolume);
	}
}