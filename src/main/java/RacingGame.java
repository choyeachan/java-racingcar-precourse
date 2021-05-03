public class RacingGame{

	public String[] cars;
	public int tryCount=0;

	public void readyForRacing(String carsString,String seperator){
		cars = carsString.split(seperator);
	}

	public void tryCount(int tryCount){
		this.tryCount = tryCount;
	}

	public boolean lengthCheckUnderFiveLength(String stringValue){
		return stringValue == null? false : stringValue.length() < 6;
	}


}
