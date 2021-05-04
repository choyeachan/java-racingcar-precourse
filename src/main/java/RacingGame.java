import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame{

	public Cars cars;
	public int tryCount=0;

	private Random r;

	RacingGame(){
		r = new Random();
	}

	public void readyForRacing(String carsString,String seperator){
		String[] carNames = carsString.split(seperator);
		cars = getCarsBySplitedCarNames(carNames) ;
	}

	public Cars getCarsBySplitedCarNames(String[] carNames){
		return new Cars(carNames);	
	}

	public void tryCount(int tryCount){
		this.tryCount = tryCount;
	}

	public boolean lengthCheckUnderFiveLength(String stringValue){
		return stringValue == null? false : stringValue.length() < 6;
	}

	public int generateNumber(){
		return r.nextInt(10);
	}

	public int forwardOrStop(int number){
		return number > 3?1:0;
	}

	public void race(){
		while(tryCount-- > 0){
			System.out.println("실행 결과");
			raceOne();
			System.out.println();
		}
		System.out.println(outputResult(cars));
	}

	public void raceOne(){
		for(Car car : cars.pop()){
			car.move(forwardOrStop(generateNumber()));
			System.out.println(outputCarStatus(car));
		}
	}

	public String outputCarStatus(Car car){
		return car.name + ":" +car.outputPosition();
	}

	public String outputResult(Cars cars){
		String winners = ""; 
		int winnerPosition = 0;
		for(Car car: cars.pop()){
			winnerPosition = getWinnersPosition(winnerPosition, car);
		}

		for(Car car: cars.pop()){
			if(car.position == winnerPosition)
				winners += car.name + ",";
		}
		return winners.substring(0, winners.length()-1);
	}

	public int getWinnersPosition(int winnerPosition, Car car){
		if(car.position > winnerPosition)  
			return car.position;

		return winnerPosition;
	}

}
