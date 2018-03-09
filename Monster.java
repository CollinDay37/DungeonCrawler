package project1;

public class Monster extends Beings {

	public int health = 10;
	public int attack = 2;
	
	public int getHealth() {
		return health;
	}
	public int adjustHealth(Hero h) {
		return this.health = this.health - h.health;
	}
	public boolean isDeadM() {
		if(this.health <= 0)
			return false;
		else 
			return true;
	}

}
