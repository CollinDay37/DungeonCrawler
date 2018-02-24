package project1;

public class Monster extends Beings {
	
	private char monster = 'M';
	private int health = 10;
	private int attack = 2;
	
	
	public Object spawnMonster() {
		return monster;
	}
	
	public int getHealth() {
		return health;
	}
	public int monsterAttack() {
		return  - 2;
	}
	public int monsterAttacked() {
		return this.health - 5;
	}
	
}
