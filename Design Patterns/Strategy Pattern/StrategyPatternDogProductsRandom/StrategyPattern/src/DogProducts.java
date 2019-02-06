import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DogProducts {
	
	// We are creating a list of dogs
	private List<Dog> dogList;

	public DogProducts(){
		dogList  = new ArrayList<Dog>();
		addDogsToListWithRandomAlgorithms();
	}
	
	public Random getNewGenerator(){
		Random seed = new Random();
		return new Random(seed.nextInt());
	}
	
	private void addDogsToListWithRandomAlgorithms(){
	
		Dog chihuahuaDog = new ChihuahuaDog();
		chihuahuaDog.setBarking(getRandomBark());
		chihuahuaDog.setJumping(getRandomJump());
		dogList.add(chihuahuaDog);
		
		Dog ceramicDog = new CeramicDog();
		ceramicDog.setBarking(getRandomBark());
		ceramicDog.setJumping(getRandomJump());
		dogList.add(ceramicDog);
		
		Dog toyDog = new ToyDog();
		toyDog.setBarking(getRandomBark());
		toyDog.setJumping(getRandomJump());
		dogList.add(toyDog);
				
	}
	
	private InterfaceBarking getRandomBark(){
		
		// Getting a new generator increases the chances of getting a true random number
		int randomBark = getNewGenerator().nextInt(2);
		
		switch(randomBark){
			case 0:
				return new BarkLoud();
			case 1:
				return new BarkSoft();
		}
		return new DoNotBark();
	}
	
	private InterfaceJumping getRandomJump(){
		
		// Getting a new generator increases the chances of getting a true random number
		int randomJump = getNewGenerator().nextInt(2);
		switch(randomJump){
			case 0:
				return new JumpHigh();
			case 1:
				return new JumpLow();
		}
		return new DoNotJump();
	}
	
	private void show(){
 		
		// For each dog in the list, show them and ask them to bark and jump.
		for (Dog dog : dogList) {
			dog.show();
			dog.bark();
			dog.jump();
			System.out.println();
		}	
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		DogProducts dogProducts = new DogProducts();
		dogProducts.show();

	}

}
