package project1;

import java.util.Arrays;

public class Dungeon {
	
		public Object[] dungeon1 = new Object[9];
		
		Hero h = new Hero();
		Monster m = new Monster();
		private int hLocation = 0;
		private int hLoc = 1;
		private int mLocation = 8;
		
		public void createDungeon() {
			dungeon1[0] = h;
			dungeon1[8] = m;
		}//End of createDungeon
		
		public void dungeonToString(Dungeon d) {
			System.out.print("###########\n#");
				for(Object x:dungeon1){
					if(x == null) 
						System.out.print("_");
					else if(x == h) 
						System.out.print("H");
					else
						System.out.print("M");
				}//End of for each
				System.out.println("#\n###########");
	}//End of dungeonToString

		public void heroMove(int userInput) {
			if(userInput == 1) {
				if(hLocation++ != mLocation) {
					dungeon1[hLocation] = dungeon1[hLoc];
					
				}
				
				
				dungeon1[hLocation] = dungeon1[hLocation++];
				
			}
			
			//if(dungeon1[hLocaction] == null){
				//dungeon1[++hLocaction] = null;
			//}
			
		}
		
}//End of Dungeon class

/*
//dungeontoString(Dungeon d) method assersor method needed 
//d.getDungeon()[];
*/