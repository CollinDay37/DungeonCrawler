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
		boolean mDead = false;
		boolean hDead = false;

		public void createDungeon() {
			dungeon1[0] = h;
			dungeon1[9] = m;
		}//End of createDungeon

		public void dungeonToString(Dungeon d) {
			System.out.print("\n############\n#");
				for(Object x:dungeon1){
					if(x == null)
						System.out.print("-");
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
					moveMonsterLeft();
				}
				else {
					moveHeroLeft();
					moveMonsterLeft();
				}//moves hero left and monster left
			}//if input is 1 (moving left)
			else if(input == 2) {
				if((hLocation+1) == mLocation && mDead == false) {
					h.adjustHealth(m);
					m.adjustHealth(h);

					System.out.println("The hero's health is: " + h.getHealth());
					System.out.println("The monster's health is: " + m.getHealth());

					if(m.getHealth() <= 0) {
						mDead = true;
					}//Checks for monster's health
					if(h.getHealth() <= 0) {
						hDead = true;
					}//Checks for hero's health

				}//Checking for when both the hero and monster are right next to each other and have to fight
				else if((hLocation+1) == mLocation && mDead == true) {
				if(mDead == false)
					moveMonsterLeft();
				if(hDead == false)
					moveHeroRight();
				}
				else {
				moveHeroRight();
				moveMonsterLeft();
			}//Moves both the monster and hero
		}//End of if input is 2(move right)
	}//end of moveBeings method


		private void moveHeroRight() {
			hLocation++;
			dungeon1[hLocation] = h;
			dungeon1[hLocationRemover] = null;
			hLocationRemover++;
		}//End of moving Hero Right
		private void moveHeroLeft() {
			hLocation--;
			dungeon1[hLocation] = h;
			dungeon1[hLocationRemover] = null;
			hLocationRemover--;
		}//End of moving Hero Left
		private void moveMonsterLeft() {
			if(mDead == false) {
				mLocation--;
				dungeon1[mLocation] = m;
				dungeon1[mLocationRemover] = null;
				mLocationRemover--;
			}
		}//End of moving Monster left
		public int gameEnd() {
			if(hLocation == 9) {
				System.out.println("Congrats, you made it through the dungeon!");
				return 1;
				}
			else if(mLocation == 0) {
				System.out.println("You lost, try agian!");
				return 1;
				}
			else
				return 2;
		}//End of checking if game should end

}//End of Dungeon class
