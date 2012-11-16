package animal;

import java.util.Scanner;

// från github.com
public class Animal {

	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		Cat cat = new Cat();
		cat.drawPic();
		
		menu();
	}
	
	public static void menu(){
		System.out.println("Pick an animal");
		
		
	}
	
}
