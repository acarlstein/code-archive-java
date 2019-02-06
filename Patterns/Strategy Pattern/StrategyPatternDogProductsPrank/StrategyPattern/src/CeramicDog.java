
public class CeramicDog extends Dog {

	public CeramicDog(){
		System.out.println("I am a ceramic dog!\n");
		interfaceBarking = new DoNotBark();
		interfaceJumping = new DoNotJump();	
	}
	
	@Override
	public void show() {
		System.out.println("Showing ceramic dog!");
	}

}
