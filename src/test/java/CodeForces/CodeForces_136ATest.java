package CodeForces;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CodeForces_136A_Test {

	@Test
	void shouldThrowNullPointerExceptionWithMessage(){
		//given
		int friendsCount = 4;
		String gaveGiftToFriendNumber = null;

		//when
		assertThrows(NullPointerException.class, () ->
				CodeForces_136A.receivedGiftFrom(friendsCount, gaveGiftToFriendNumber));
	}

	@Test
	void shouldThrowIllegalArgumentExceptionWithMessage(){
		//given
		int friendsCount = 0;
		String gaveGiftToFriendNumber = "2 3 4 1";

		//when
		assertThatThrownBy(() -> CodeForces_136A.receivedGiftFrom(friendsCount, gaveGiftToFriendNumber))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("Number must be in the range 1 to 100");
	}

	@Test
	void shouldReturnNumberWhoReceivedGift(){
		//given
		int friendsCount = 4;
		String gaveGiftToFriendNumber = "2 3 4 1";
		List<Integer> expectedList = List.of(4, 1, 2, 3);

		//when
		List<Integer> actualList = CodeForces_136A.receivedGiftFrom(friendsCount,gaveGiftToFriendNumber);

		//then
		assertEquals(expectedList, actualList);
	}
}