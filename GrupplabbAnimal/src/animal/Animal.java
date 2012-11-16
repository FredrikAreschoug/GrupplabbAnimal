package animal;

import java.util.Scanner;

// från github.com
public class Animal {

	static Cat cat = new Cat();
	static Bunny bunny = new Bunny();
	static Wolf wolf = new Wolf();
	static Owl owl = new Owl();

	public static void main(String[] args){
		menu();
	}


	public static void menu(){
		boolean bajs = false;
		Scanner scan = new Scanner(System.in);

//		String choise2 = scan.nextLine();

		while(!bajs){
			System.out.println("Pick an animal, type done to exit: ");
			String choise = scan.nextLine();
			switch(choise){
			case "cat":
				cat.printStats();
				break;
			case "bunny":
				bunny.printStats();
				break;
			case "wolf":
				wolf.printStats();
				break;
			case "owl":
				owl.printStats();
				break;
			case "done":
				bajs = true;	
				break;
			default:
				System.out.println("not a fighting animal...");
				break;
			}
			
		}
	}
}
