package project1;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launcher{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Dungeon dungeon1 = new Dungeon();
		dungeon1.createDungeon();

		
		
		boolean running = true;
		System.out.println("Welcome to Dungeon Crawler!");
		System.out.println("Goal: Make it to the end of the room and kill anything in your path.");
		dungeon1.dungeonToString(dungeon1);

		while(running) {
			System.out.println("\nType 1 to move left. \nType 2 to move right.");
			int userInput = scan.nextInt();
			dungeon1.moveBeings(userInput);



			dungeon1.dungeonToString(dungeon1);
			if(dungeon1.gameEnd() == 1)
				running = false;
			}//Keeps running program until Hero dies or reaches end of dungeon
		System.out.println("Hope you enjoyed Dungeon Crawler!");


		//isInstanctOf(); --> Returns true or false

	}//end of main

}//end of Launcher class
