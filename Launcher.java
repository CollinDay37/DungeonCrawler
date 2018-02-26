package project1;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launcher{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Hero h = new Hero();
		
		Dungeon dungeon1 = new Dungeon();
		dungeon1.createDungeon();
		
		boolean running = true;
		int counter = 0;
		System.out.println("Welcome to the Dungeon Crawler!");
		System.out.println("Goal: Make it to the end of the room and kill anything in your path!");
		
		while(running) {
			System.out.println("Type 1 to move left. \nType 2 to move right.");	
			int userInput = scan.nextInt();
			if(userInput == 1) {
				dungeon1.heroMove(userInput);
			}
			dungeon1.dungeonToString(dungeon1);
			
			counter++;
			if(counter == 2) {
				running = false;
			}
			}//Keeps running program until Hero dies or reaches end of dungeon
		
		
		//isInstanctOf(); --> Returns true or false 
		
	}//end of main

}//end of Launcher class
