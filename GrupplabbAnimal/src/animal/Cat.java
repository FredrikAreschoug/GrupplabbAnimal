package animal;

//git
public class Cat extends Stats{
	
	private String sound;
	
	public Cat(){
		health = 10;
		energy = 10;
		attackPower = 10;
		speed = 10;
		sound = "mjau";
		
	}
	
	public void eat(){

	}
	
	public void sound(){

	}
	
//	public int getEnergy(){
//
//	}
	
	public void setEnergy(int energy){

	}
	
	public void drawPic(){
		final String PIC = " _\n \\`*-.\n  )  _`-.\n .  : `. .\n : _   '  \n ; *` _.   `*-._\n `-.-'          `-.\n   ;       `       `.\n   :.       .        \\\n   . \\  .   :   .-'   .\n   '  `+.;  ;  '      :\n   :  '  |    ;       ;-.\n   ; '   : :`-:     _.`* ;\n.*' /  .*' ; .*`- +'  `*'\n`*-*   `*-*  `*-*'\n";
		System.out.println(PIC);
	}
	
	
}
