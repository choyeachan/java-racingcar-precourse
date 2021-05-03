public class GameRunner {

	public static void main (String[] args){
		RacingGame game = new RacingGame();
		game.readyForRacing("1번,2번,3번", ",");
		game.tryCount(5);
		game.race();
	}

}
