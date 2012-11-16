package animal;

import java.util.Scanner;

public class Menu {

	Scanner scan = new Scanner(System.in);
	Cat cat = new Cat();
	
	public Menu(){
		System.out.println("Pick an animal");
		
		String choise = scan.nextLine();
		
		switch(choise){

		case "cat":
			cat.drawPic();
			break;
		}
	}
}
