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

}
