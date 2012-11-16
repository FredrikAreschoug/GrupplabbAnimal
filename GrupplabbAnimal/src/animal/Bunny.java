package animal;

public class Bunny extends Stats{
	
	public Bunny() {
		health = 10;
		energy = 10;
		attackPower = 10;
		speed = 10;
	}
	
	public String sound() {
		energy--;
		return "Pip, pip, gnag!";
	}
	
	public int eat() {
		energy += 5;
		return energy;
	}
	
	public void bunnyJump() {
		System.out.println("Hopp! Tjooo!");
		energy -= 2;
	}
}
