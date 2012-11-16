package animal;

public class Wolf extends Stats{
	
	int energy;
	
	public Wolf(){
		health = 1;
		energy = 666;
		attackPower = 10;
		speed = 10;
//		System.out.println("I like bunnies...yum yum");
	}
	public String sound(){
		String fx = "AAAoooooou";
		return fx;
	}
	public int eat(){
		energy += 5; 
		return energy;
	}
	public String poop(){
		String fx2 = "HHNnnnnnngh!";
		return fx2;
	}
	
}
