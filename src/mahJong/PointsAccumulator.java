package mahJong;

import java.util.ArrayList;

public class PointsAccumulator {
	
	private int point;
	private String name = "";
	private ArrayList<String> names = new ArrayList<>();
//	private static PointsAccumulator instance = new PointsAccumulator();
	
	public PointsAccumulator() {
		point = 0;
		name = "";
	}
	
//	public static PointsAccumulator getInstance() {
//		return instance;
//	}
	
	public void setName(String name) {
		names.clear();
		names.add(name);
	}
	
	public void addName (String name) {
		names.add(name);
	}
	
	public String getName () {
		if(isChickenHand()) {
			return "Chicken Hand";
		}
//		return this.name;
		return String.join(" ", names);
	}

	public void setPoint(int point) {
		this.point = point;	
	}
	
	public void addPoint(int point) {
		this.point += point;
	}
	
	public int getPoint() {
		if(this.point > 13) {
			return 13;
		}
		return point;
	}
	
	public boolean isChickenHand() {
		if(this.point == 0) {
			return true;
		}
		return false;
	}
	
// 	public void printString() {
// 		System.out.println("Points: " + point);
// 		if(isChickenHand()) {
// 			System.out.println("Name: " + "Chicken Hand");
// 		}
// 		System.out.println("Name: " + name);
// 	}

	
}
