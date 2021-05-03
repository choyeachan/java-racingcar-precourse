import java.util.ArrayList;
import java.util.List;

public class Cars {

	private List<Car> cars;

	Cars(String[] carNames){
		cars = new ArrayList<>();
		for(String carName:carNames){
			cars.add(new Car(carName));
		}
	}

	public int size(){
		return cars.size();
	}

	public List<Car> pop(){
		return cars;
	}

}
