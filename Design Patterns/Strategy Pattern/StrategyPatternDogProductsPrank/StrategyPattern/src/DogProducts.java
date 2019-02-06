import java.util.ArrayList;
import java.util.List;

public class DogProducts {
	
	// We are creating a list of dogs
	private List<Dog> dogList;
	
	public DogProducts(){
		dogList  = new ArrayList<Dog>();
		addDogsToList();
	}
	
	private void addDogsToList(){
		// Adding dogs to the list
		dogList.add(new ChihuahuaDog());
		dogList.add(new CeramicDog());
		dogList.add(new ToyDog());	
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
	
	private void doPrank(){
		// Empty List
		dogList.clear();
		
		// Now the Chihuahua dog will bark loud and jump high LOL
		Dog chihuahuaDog = new ChihuahuaDog();
		chihuahuaDog.setBarking(new BarkLoud());
		chihuahuaDog.setJumping(new JumpHigh());
		
		// The ceramic dog is possess. It can bark soft and jump low. LOL
		Dog ceramicDog = new CeramicDog();
		ceramicDog.setBarking(new BarkSoft());
		ceramicDog.setJumping(new JumpLow());
		
		// The toy dog cannot bark but it can jump high. How unexpected! LOL
		Dog toyDog = new ToyDog();
		toyDog.setBarking(new DoNotBark());
		toyDog.setJumping(new JumpHigh());		
		
		dogList.add(chihuahuaDog);
		dogList.add(ceramicDog);
		dogList.add(toyDog);	
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		DogProducts dogProducts = new DogProducts();
		
		boolean doPrank = true;
		if (doPrank){
			dogProducts.doPrank();
			dogProducts.show();
		}else{
			dogProducts.show();
		}

	}

}
