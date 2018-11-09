package mahJong;

public class Calculator {
	//test
	public static void main(String args[]) {
//		String[] input = new String[] {"O1","O2","O3","L1","L2","L3","M3","M3","M3","M1","M1","M1","M2","M2"};
//		String[] input = new String[] {"H1","H2","H3","H1","H2","H3","H4","H4","H4","H5","H5","H5","H6","H6"};
//		String[] input = new String[] {"H2","H2","H2","H1","H1","H1","H4","H4","H4","H5","H5","H5","H6","H6"};
//		String[] input = new String[] {"M1", "M1", "M1", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9", "M2", "M2"}; // Valid 9chain case 2
//		String[] input = new String[] {"M1", "M1", "M1", "M3", "M3", "M3", "M6", "M7", "M8", "M9", "M9", "M9", "M2", "M2"}; // Invalid 9 chain case
//		String[] input = new String[] {"M1", "M1", "M1", "M1", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9"}; // Valid 9chain case 1
//		String[] input = new String[] {"M1", "M2", "M3", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9", "M1", "M1"}; // Valid 9chain case 3
//		String[] input = new String[] {"M1", "M1", "M1", "M2", "M3", "M4", "M4", "M5", "M6", "M7", "M8", "M9", "M9", "M9"}; // Valid 9chain case 4
//		String[] input = new String[] {"M1", "M1", "M1", "M2", "M3", "M4", "M6", "M7", "M8", "M9", "M9", "M9", "M5", "M5"}; // Valid 9chain case 5
//		String[] input = new String[] {"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H7"}; // Valid 9chain case 5
//		String[] input = new String[] {"M1", "M9", "T1", "T9", "S1", "S9", "H1", "H2", "H3", "H5", "H4", "H6", "H7", "H7"}; // Valid 9chain case 5
//		String[] input = new String[] {"M1", "M1", "M1", "M2", "M3", "M4", "M3", "M3", "M3", "M4", "M4", "M4", "M5", "M5"}; // Valid 9chain case 5
		
//		String[] input = new String[] {"H5", "H5", "H5", "H6", "H6", "H6", "H7", "H7", "H7", "M4", "M4", "M4", "M5", "M5"}; // Valid 9chain case 5
//		String[] input = new String[] {"T1", "T2", "T3", "T1", "T2", "T3", "T2", "T3", "T4", "T6", "T7", "T8", "T5", "T5"}; // Valid 9chain case 5
//		String[] input = new String[] {"H5", "H5", "H5", "M6", "M6", "M6", "H7", "H7", "H7", "M4", "M4", "M4", "M5", "M5"}; // Valid 9chain case 5
		String[] input = new String[] {"H5", "H1", "H2", "H3", "H4", "M6", "H7", "H7", "H7", "M4", "M6", "M4", "M5", "M5"}; // Valid 9chain case 5
		
//		new CheckValid();
		if(!CheckValid.isValidInput(input)) {
			System.exit(1);
		}
		Combination c = new Combination();
		for(String s:input)
		{
			c.addTiles(new Tile(s));
		}
		if(MJUtil.isThirteenOrphans(c) ){
			System.out.print(13);
			System.exit(0);
		}
		
		boolean isWinHand = CheckValid.isWinHand(input);
		if(!isWinHand) {
			System.out.println("Trick Hand");
		} else {
//			int point = 0;
			System.out.println("Is a legal Hand Type");
			Win win = new MakeWin(input).getWin();
			
//			System.out.println(win.getWin().get(2).getState());
//			System.out.println(win.getWin().get(2).getSuit());
			
//			System.out.println(MJUtil.isSmallDragon(win.getWin()));
//			System.out.println(MJUtil.isAllOneOrNine(win.getWin()));
//			System.out.println(MJUtil.isNineGate(win.getWin()));
//			System.out.println(MJUtil.isAllOneSuit(win.getWin()));
//			System.out.println(MJUtil.isPureOneSuit(win.getWin()));
//			System.out.println(MJUtil.isAllHonorSuit(win.getWin()));
			
			PointsAccumulator pointsAccumulator = PointsAccumulator.getInstance();
			pointsAccumulator.setWin(win.getWin());
		}
	}
	
}
