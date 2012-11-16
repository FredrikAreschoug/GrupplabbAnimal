package animal;

public class Stats {
	
	int health;
	int energy;
	int attackPower;
	int speed;
	
	public Stats(){
		
	}
	
	public void printStats(){
		System.out.println("health: " + health + "\n" + 
							"energy: " + energy + "\n" +
							"attack power: " + attackPower + "\n" +
							"speed: " + speed + "\n");
	}
}
