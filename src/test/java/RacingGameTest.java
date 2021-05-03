import static org.junit.jupiter.api.Assertions.assertEquals;

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


}
