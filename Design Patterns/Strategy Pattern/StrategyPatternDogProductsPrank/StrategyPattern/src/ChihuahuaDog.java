
public class ChihuahuaDog extends Dog {

	public ChihuahuaDog(){
		System.out.println("I am a chihuahua dog!\n");
		interfaceBarking = new BarkSoft();
		interfaceJumping = new JumpLow();	
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing chihuahua dog!");
	}

}
