import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class RacingGameTest {

	@Test
	public void couldSeporateStringToArrayUsingSeperator(){

		RacingGame racingGame = new RacingGame();
		String carsString = "1,2,3,4,5";
		String seperator = ",";
		racingGame.readyForRacing(carsString,seperator);
		Cars cars = racingGame.cars;
		assertEquals(cars.size(), 5);
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

	@Test
	public void couldGenerateRandomNumber(){
		RacingGame racingGame = new RacingGame();
		List<Integer> range = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		assertTrue(range.contains(racingGame.generateNumber()));
		assertTrue(range.contains(racingGame.generateNumber()));
		assertTrue(range.contains(racingGame.generateNumber()));
		assertTrue(range.contains(racingGame.generateNumber()));
	}

	@Test
	public void couldCheckForwardOrStop(){
		RacingGame racingGame = new RacingGame();
		int forward = 4;
		int stop = 1;
		
		assertEquals(0, racingGame.forwardOrStop(stop));
		assertEquals(1, racingGame.forwardOrStop(forward));
	}


}
