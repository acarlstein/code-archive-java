import java.util.ArrayList;
import java.util.List;

public class DogProducts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// We are creating a list of dogs
		List<Dog> dogList = new ArrayList<Dog>();
		
		// Adding dogs to the list
		dogList.add(new ChihuahuaDog());
		dogList.add(new CeramicDog());
		dogList.add(new ToyDog());
		
		// For each dog in the list, show them and ask them to bark and jump.
		for (Dog dog : dogList) {
			dog.show();
			dog.bark();
			dog.jump();
			System.out.println();
		}
	}

}
