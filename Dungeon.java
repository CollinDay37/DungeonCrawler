package project1;

import java.util.Arrays;

public class Dungeon {
	
		public Object[] dungeon1 = new Object[10];
		
		Hero h = new Hero();
		Monster m = new Monster();
		
		private int hLocation = 0;
		private int hLocationRemover = hLocation;
		private int mLocation = 9;
		private int mLocationRemover = mLocation;
		
		public void createDungeon() {
			dungeon1[0] = h;
			dungeon1[9] = m;
		}//End of createDungeon
		
		public void dungeonToString(Dungeon d) {
			System.out.print("############\n#");
				for(Object x:dungeon1){
					if(x == null) 
						System.out.print("_");
					else if(x == h) 
						System.out.print("H");
					else
						System.out.print("M");
				}//End of for each
				System.out.println("#\n############");
	}//End of dungeonToString

		public void moveBeings(int input) {
			if(input == 1) {
				if(hLocation == 0) { //Checks to see if hero can move left
					System.out.println("Don't run away, continue on your journey!"); 
					mLocation--;
					dungeon1[mLocation] = m;
					dungeon1[mLocationRemover] = null;
					mLocationRemover--;
				}
				else {
					hLocation--;
					dungeon1[hLocation] = h;
					dungeon1[hLocationRemover] = null;
					hLocationRemover--;
					
					mLocation--;
					dungeon1[mLocation] = m;
					dungeon1[mLocationRemover] = null;
					mLocationRemover--;
				}//moves hero left
			}//if input is 1 (moving left)
		
			else if(input == 2) {
				if((hLocation+1) == mLocation) {
					System.out.println(h.getHealth());
					
					
					
				}//Checking for when both the hero and monster are right next to eachother and have to fight
				
				else {//If beings are not going to touch, move normally			
					hLocation++;
					dungeon1[hLocation] = h;
					dungeon1[hLocationRemover] = null;
					hLocationRemover++;
		
					mLocation--;
					dungeon1[mLocation] = m;
					dungeon1[mLocationRemover] = null;
					mLocationRemover--;
			
					System.out.println("\n hLocation is " + hLocation + " mLocation is " + mLocation);
				}
			}
			//}//end of If check			
		}//end of moveBeings method
		
		
}//End of Dungeon class

/*
//dungeontoString(Dungeon d) method assersor method needed 
//d.getDungeon()[];
*/

//if(dungeon1[hLocaction] == null){
//dungeon1[++hLocaction] = null;
//}