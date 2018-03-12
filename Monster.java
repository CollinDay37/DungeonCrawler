package project1;

public class Monster extends Beings {

	public int health = 10; //Monster's health
	public int attack = 2; //Monster's attack
	
	public int getHealth() {
		return health;
	}//Returns health of monster
	public int adjustHealth(Hero h) {
		return this.health = this.health - h.attack;
	}//Adjusts monsters health by the hero's attack

}//End of monster class
