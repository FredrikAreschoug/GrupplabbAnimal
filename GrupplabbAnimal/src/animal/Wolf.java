package animal;

public class Wolf extends Animal{
	
	int energy;
	
	public Wolf(){
		energy = 14;
		System.out.println("I like bunnies...yum yum");
	}
	public String sound(){
		String fx = "AAAoooooou";
		return fx;
	}
	public int eat(){
		energy += 5; 
		return energy;
	}
	
	
}
