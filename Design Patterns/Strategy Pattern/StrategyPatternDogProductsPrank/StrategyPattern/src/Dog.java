
public abstract class Dog {
	// ASCII image done by JG
	private final String strDogImageASCII = "            |\\\n" 
											+"   \\`-. _.._| \\\n"
											+"    |_,'  __`. \\\n"
											+"    (.\\ _/.| _  |\n"
											+"   ,'      __ \\ |\n"
											+" ,'     __/||\\  |\n"
											+"(O8O  ,/|||||/  |\n"
											+"   `-'_----    /\n"
											+"      /`-._.-'/\n"
											+"      `-.__.-'   \n";
		
	protected InterfaceBarking interfaceBarking;
	protected InterfaceJumping interfaceJumping;
	
	public Dog(){		
		System.out.println("I am a dog\n" + strDogImageASCII);
	}
	
	public abstract void show();
	
	public void bark(){
		interfaceBarking.bark();
	}
	
	public void jump(){
		interfaceJumping.jump();
	}
	
	public void setBarking(InterfaceBarking newInterfaceBarking){
		this.interfaceBarking = newInterfaceBarking; 
	}
	
	public void setJumping(InterfaceJumping newInterfaceJumping){
		this.interfaceJumping = newInterfaceJumping; 
	}
	
}

