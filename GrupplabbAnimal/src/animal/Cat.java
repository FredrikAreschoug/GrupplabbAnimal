package animal;

public class Cat {
	
	int energy;
	String sound;
	
	Cat(){
		sound = "mjau";
		energy = 10;
	}
	
	public void eat(){
		System.out.println(sound);
		energy += 5;
	}
	
	public void sound(){
		energy -= 1;
	}
	
	public int getEnergy(){
		return energy;
	}
	
	public void setEnergy(int energy){
		this.energy = energy;
	}
	
	
	
}
