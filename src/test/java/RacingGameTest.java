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

	@Test
	public void couldCarOutputPosition(){
		RacingGame racingGame = new RacingGame();
		String car1_name = "car1";
		String car1_outputPosition = "--";
		String car1_output = car1_name+":"+car1_outputPosition;
		Car car1 = new Car(car1_name);
		car1.move(1);
		car1.move(1);

		String car2_name = "car2";
		String car2_outputPosition = "---";
		String car2_output = car1_name+":"+car2_outputPosition;
		Car car2 = new Car(car2_name);
		car2.move(1);
		car2.move(1);
		car2.move(1);

		assertEquals(car1_output, racingGame.outputCarStatus(car1));
		assertEquals(car2_output, racingGame.outputCarStatus(car2));
	}


}
