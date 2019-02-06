
public class ToyDog extends Dog {

	public ToyDog(){
		System.out.println("I am a toy dog!\n");
		interfaceBarking = new BarkLoud();
		interfaceJumping = new DoNotJump();	
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing toy dog!");
	}

}
