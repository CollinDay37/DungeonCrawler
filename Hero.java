package project1;

public class Hero extends Beings {

	public int health = 10;
	public int attack = 5;
	
	public int getHealth() {
		return health;
	}
	public int adjustHealth(Monster m) {
		return this.health = this.health - m.attack;
	}
	public boolean isDeadH() {
		if(this.health <= 0)
			return false;
		else 
			return true;
	}


}
