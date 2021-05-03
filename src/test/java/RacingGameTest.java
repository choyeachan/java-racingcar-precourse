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

}
