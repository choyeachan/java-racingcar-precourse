public class Car {
	public String name="";
	public int position=0;

	Car(String name){
		this.name = name;
	}


	public void move(int i){
		if(i == 0){
			forward();
			return;
		}
		stop();
	}


	private void forward(){
		position++;
	}

	private void stop(){
	}

	
}

