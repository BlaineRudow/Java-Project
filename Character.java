package priority;

public class Character {
	String name;
	String race;
	String charClass;
	
	Character(){
		name = "";
		race = "";
		charClass = "";
	}
	Character(String n){
		name = n;
	}
	Character(String n, String r){
		name = n;
		race = r;
	}
	Character(String n, String r, String c){
		name = n;
		race = r;
		charClass = c;
	}
	
}
