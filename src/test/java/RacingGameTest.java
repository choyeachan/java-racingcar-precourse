import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RacingGameTest {

	@Test
	public void couldSeporateStringToArrayUsingSeperator(){

		RacingGame racingGame = new RacingGame();
		String carsString = "1,2,3,4,5";
		String seperator = ",";
		racingGame.readyForRacing(carsString,seperator);
		String[] cars = racingGame.cars;
		assertEquals(cars.length, 5);
	}


	@Test
	public void couldSaveTryCount(){

		RacingGame racingGame = new RacingGame();
		int tryCount = 10;
		racingGame.tryCount(tryCount);
		assertEquals(racingGame.tryCount, 10);
	}

	@Test
	public void couldInputStringThatLengthIsMaximumFive(){

		RacingGame racingGame = new RacingGame();
		String fiveLengthValue = "12345";
		String underFiveLengthValue = "123";
		String overFiveLengthValue = "123456";
		assertTrue(racingGame.lengthCheckUnderFiveLength(fiveLengthValue));
		assertTrue(racingGame.lengthCheckUnderFiveLength(underFiveLengthValue));
		assertFalse(racingGame.lengthCheckUnderFiveLength(overFiveLengthValue));
	}

}
