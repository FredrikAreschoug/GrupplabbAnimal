package animal;

//git
public class Cat {
	
	private int energy;
	private String sound;
	
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
		final String PIC = " _\n \\`*-.\n  )  _`-.\n .  : `. .\n : _   '  \n ; *` _.   `*-._\n `-.-'          `-.\n   ;       `       `.\n   :.       .        \\\n   . \\  .   :   .-'   .\n   '  `+.;  ;  '      :\n   :  '  |    ;       ;-.\n   ; '   : :`-:     _.`* ;\n.*' /  .*' ; .*`- +'  `*'\n`*-*   `*-*  `*-*'\n";
		System.out.println(PIC);
	}
	
	
}
