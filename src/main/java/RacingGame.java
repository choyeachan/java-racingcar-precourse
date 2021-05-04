import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RacingGame{

	public Cars cars;
	public int tryCount=0;

	private Random r;
	private Scanner scan;

	RacingGame(){
		r = new Random();
		scan = new Scanner(System.in);
	}

	public void run(){
		System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
		String carNames = scan.next();
		readyForRacing(carNames, ",");
		System.out.println("시도할 회수는 몇회인가요?");
		String tryCount = scan.next();
		tryCount(Integer.parseInt(tryCount));
		race();
		outputResult(cars);
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
		int winnerPosition = 0;
		for(Car car: cars.pop()){
			winnerPosition = getWinnersPosition(winnerPosition, car);
		}
		return getWinners(winnerPosition, cars)+"가 최종 우승했습니다.";
	}

	public int getWinnersPosition(int winnerPosition, Car car){
		if(car.position > winnerPosition)  
			return car.position;

		return winnerPosition;
	}

	public String getWinner(String winners, int winnerPosition, Car car){
		if(car.position == winnerPosition)
				return winners + car.name + ",";
		return winners;
	}

	public String getWinners(int winnerPosition, Cars cars){
		String winners = ""; 
		for(Car car: cars.pop()){
			winners = getWinner(winners, winnerPosition, car);
		}
		return winners.substring(0, winners.length()-1);
	}

}
