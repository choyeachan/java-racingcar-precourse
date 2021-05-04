public class Car {
	public String name="";
	public int position=0;

	Car(String name){
		this.name = name;
	}

	Car(String name,int position){
		this.name = name;
		this.position = position;
	}


	public String outputPosition(){
		String output = "";
		for(int i=0;i<position;i++){
			output += "-";
		}
		return output;
	}

	public void move(int i){
		if(i == 1){
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

