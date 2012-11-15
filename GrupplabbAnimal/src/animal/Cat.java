package animal;

//git
public class Cat {
	
	int energy;
	String sound;
	final String PIC = " _\n \\`*-.\n  )  _`-.\n .  : `. .\n : _   '  \n ; *` _.   `*-._\n `-.-'          `-.\n   ;       `       `.\n   :.       .        \\\n   . \\  .   :   .-'   .\n   '  `+.;  ;  '      :\n   :  '  |    ;       ;-.\n   ; '   : :`-:     _.`* ;\n.*' /  .*' ; .*`- +'  `*'\n`*-*   `*-*  `*-*'\n";
	
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
	
	public void drawPic(){
		System.out.println();
	}
	
	
}
