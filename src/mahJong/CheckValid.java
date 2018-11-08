package mahJong;

import java.lang.reflect.Array;

public class CheckValid {
	public Boolean sameMahJongLessThanFour(String mahJong[], String target) {
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
	
	public boolean isValidTile(String tile) {
		if(tile.charAt(0) == 'T' || tile.charAt(0) == 'S' || tile.charAt(0) == 'M') {
			int rank = Character.getNumericValue(tile.charAt(1));
			if(rank >= 1 && rank <= 9) {
				return true;
			}
		} else if ( tile.charAt(0) == 'H' ) {
			int rank = Character.getNumericValue(tile.charAt(1));
			if(rank >= 1 && rank <= 7) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isValidEyes(String eyes[]) {
		return eyes[0] == eyes[1];
	}
	
	public boolean isValidMeld(String tile[]) {
		int count = 0;
		for(int i = 0; i < 2; i++) {
			if(tile[0].charAt(0) == tile[i + 1].charAt(0)) {
				count++;
			}
		}
		if(count == 2) {
			if(tile[0].charAt(1) == tile[1].charAt(1) && tile[0].charAt(1) == tile[2].charAt(1)) {
				return true;
			} else {
				int firstCard = Character.getNumericValue(tile[0].charAt(1));
				int secondCard = Character.getNumericValue(tile[1].charAt(1));
				int thirdCard = Character.getNumericValue(tile[2].charAt(1));
				return secondCard == firstCard + 1 && thirdCard == firstCard + 2; 
			}
		}
		else {
			return false;
		}
	}
	
	public boolean isValidInput(String mahJong[]) {
		for(int i = 0; i < Array.getLength(mahJong); i++) {
			if(!isValidTile(mahJong[i])) {
				return false;
			}
			if(!sameMahJongLessThanFour(mahJong, mahJong[i])) {
				return false;
			}
		}
		String firstTile[] = new String[]{mahJong[0], mahJong[1], mahJong[2]};
		String secondTile[] = new String[]{mahJong[3], mahJong[4], mahJong[5]};
		String thirdTile[] = new String[]{mahJong[6], mahJong[7], mahJong[8]};
		String fourthTile[] = new String[]{mahJong[9], mahJong[10], mahJong[11]};
		String eyes[] = new String[]{mahJong[12], mahJong[13]};
		return isValidMeld(firstTile) && isValidMeld(secondTile) && isValidMeld(thirdTile) && isValidMeld(fourthTile) && isValidEyes(eyes);
	}

}
