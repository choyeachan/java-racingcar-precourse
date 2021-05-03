public class RacingGame{

	public String[] cars;

	public void readyForRacing(String carsString,String seperator){
		cars = carsString.split(seperator);
	}

}
