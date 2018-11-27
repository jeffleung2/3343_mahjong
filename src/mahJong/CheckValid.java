package mahJong;

import java.util.Arrays;

public class CheckValid {
	public static boolean sameTileMoreThanFour(String mahJong[], String target) {
		int count = 0;
		for(int i = 0; i < mahJong.length; i++) {
			if(mahJong[i] == target) {
				count++;
			}
		}
		if(count > 4) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isValidTile(String tile) {
		if (tile.length() != 2) {
			return false;
		}
		if(tile.charAt(0) == 'T' || tile.charAt(0) == 'S' || tile.charAt(0) == 'M') {
//			int rank = Character.getNumericValue(tile.charAt(1));
			int rank = tile.charAt(1);
			if(rank >= '1' && rank <= '9') {
				return true;
			}
		} else if ( tile.charAt(0) == 'H' ) {
//			int rank = Character.getNumericValue(tile.charAt(1));
			int rank = tile.charAt(1);
			if(rank >= '1' && rank <= '7') {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isValidEyes(String eyes[]) {
		return eyes[0].equals(eyes[1]);
	}
	
	public static boolean isValidMeld(String tile[]) {
		isSameSuit(tile);
		Arrays.sort(tile);
		if(isSameTile(tile)) {
			return true;
		} else if (isCommonTile(tile)){
			return true;
		}
		return false;
	}
	public boolean isValidInput(String mahJong[]) {
		if(mahJong.length != 14) {
			System.out.println("You do not have 14 tiles.");
			return false;
		}
		for(int i = 0; i < mahJong.length; i++) {
			if(!isValidTile(mahJong[i])) {
				System.out.println(mahJong[i] + " does not exist.");
				return false;
			}
			if(sameTileMoreThanFour(mahJong, mahJong[i])) {
				System.out.println(mahJong[i] + " could not be more than 4");
				return false;
			}
		}
		return true;
	}
	
	public boolean isWinHand(String mahJong[]) {
		String firstTile[] = new String[]{mahJong[0], mahJong[1], mahJong[2]};
		String secondTile[] = new String[]{mahJong[3], mahJong[4], mahJong[5]};
		String thirdTile[] = new String[]{mahJong[6], mahJong[7], mahJong[8]};
		String fourthTile[] = new String[]{mahJong[9], mahJong[10], mahJong[11]};
		String eyes[] = new String[]{mahJong[12], mahJong[13]};
		return isValidMeld(firstTile) && isValidMeld(secondTile) && isValidMeld(thirdTile) && isValidMeld(fourthTile) && isValidEyes(eyes);
	}

	public static boolean isSameSuit(String[] tile) {
		return tile[0].charAt(0) == tile[1].charAt(0) && tile[0].charAt(0) == tile[2].charAt(0);
	}
	
	public static boolean isSameTile(String[] tile) {
		return tile[0].charAt(1) == tile[1].charAt(1) && tile[0].charAt(1) == tile[2].charAt(1);
	}
	
	public static boolean isCommonTile(String[] tile) {
		return tile[0].charAt(1)+1 == tile[1].charAt(1) && tile[0].charAt(1)+2 == tile[2].charAt(1);
	}
}
