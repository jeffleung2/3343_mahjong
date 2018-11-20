package mahJong;

import java.lang.reflect.Array;

public class CheckValid {
	public static boolean sameMahJongLessThanFour(String mahJong[], String target) {
		int count = 0;
		for(int i = 0; i < Array.getLength(mahJong); i++) {
			if(mahJong[i] == target) {
				count++;
			}
		}
		if(count > 4) {
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean isValidTile(String tile) {
		if (tile.length() != 2) {
			return false;
		}
		if(tile.charAt(0) == 'T' || tile.charAt(0) == 'S' || tile.charAt(0) == 'M') {
//			int rank = Character.getNumericValue(tile.charAt(1));
			int rank = (int)tile.charAt(1) - 48;
			if(rank >= 1 && rank <= 9) {
				return true;
			}
		} else if ( tile.charAt(0) == 'H' ) {
//			int rank = Character.getNumericValue(tile.charAt(1));
			int rank = (int)tile.charAt(1) - 48;
			if(rank >= 1 && rank <= 7) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isValidEyes(String eyes[]) {
		return eyes[0] == eyes[1];
	}
	
	public static boolean isValidMeld(String tile[]) {
		int count = 0;
		boolean isValid = true;
		for(int i = 0; i < 2; i++) {
			if(tile[0].charAt(0) == tile[i + 1].charAt(0)) {
				count++;
			}
		}
		if(count == 2) {
			if(tile[0].charAt(1) == tile[1].charAt(1) && tile[0].charAt(1) == tile[2].charAt(1)) {
				return true;
			} else if (tile[0].charAt(0)!='H'){
				int firstCard = Character.getNumericValue(tile[0].charAt(1));
				int secondCard = Character.getNumericValue(tile[1].charAt(1));
				int thirdCard = Character.getNumericValue(tile[2].charAt(1));
				if(secondCard != firstCard + 1)isValid = false;
				if(thirdCard != firstCard + 2)isValid = false;
				return isValid; 
			}else {
				return false;
			}
		}
		return false;		
	}
	public static boolean isValidInput(String mahJong[]) {
		if(mahJong.length != 14) {
			System.out.println("You do not have 14 tiles.");
			return false;
		}
		for(int i = 0; i < Array.getLength(mahJong); i++) {
			if(!isValidTile(mahJong[i])) {
				System.out.println(mahJong[i] + " does not exist.");
				return false;
			}
			if(!sameMahJongLessThanFour(mahJong, mahJong[i])) {
				System.out.println(mahJong[i] + " could not be more than 4");
				return false;
			}
		}
		return true;
	}
	
	public static boolean isWinHand(String mahJong[]) {
		String firstTile[] = new String[]{mahJong[0], mahJong[1], mahJong[2]};
		String secondTile[] = new String[]{mahJong[3], mahJong[4], mahJong[5]};
		String thirdTile[] = new String[]{mahJong[6], mahJong[7], mahJong[8]};
		String fourthTile[] = new String[]{mahJong[9], mahJong[10], mahJong[11]};
		String eyes[] = new String[]{mahJong[12], mahJong[13]};
		return isValidMeld(firstTile) && isValidMeld(secondTile) && isValidMeld(thirdTile) && isValidMeld(fourthTile) && isValidEyes(eyes);
	}

}
