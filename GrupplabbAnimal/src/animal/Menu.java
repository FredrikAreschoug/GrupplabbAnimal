package animal;

import java.util.Scanner;

public class Menu {

	Scanner scan = new Scanner(System.in);

	public Menu(){
		System.out.println("Pick an animal");

		String choise = scan.nextLine();

		switch(choise){
		case "cat":
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