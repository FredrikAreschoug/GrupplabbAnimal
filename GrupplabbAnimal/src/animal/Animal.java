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
		Scanner scan = new Scanner(System.in);
		System.out.println("Pick an animal");

		String choise = scan.nextLine();
//		String choise2 = scan.nextLine();

		switch(choise){
		case "cat":
			cat.printStats();
			break;
		case "bunny":
			break;
		case "wolf":
			break;
		case "owl":
			break;
		default:
			break;
		}
	}
}
