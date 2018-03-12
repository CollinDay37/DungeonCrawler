package project1;

public class Hero extends Beings {

	public int health = 10;//Hero's health
	public int attack = 5;//Monster's health
	
	public int getHealth() {
		return health;
	}//Returns the hero's health
	public int adjustHealth(Monster m) {
		return this.health = this.health - m.attack;
	}//Adjusts the hero's health by the monsters attack
}//End of hero class
