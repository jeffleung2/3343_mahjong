package mahJong;

import java.util.ArrayList;

public class PointsAccumulator {
	
	private int point;
	private String name = "";
//	private static PointsAccumulator instance = new PointsAccumulator();
	
	public PointsAccumulator() {
		point = 0;
		name = "";
	}
	
//	public static PointsAccumulator getInstance() {
//		return instance;
//	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addName (String name) {
		this.name += name;
	}
	
	public String getName () {
		if(this.point == 0) {
			return "Chicken Hand ";
		}
		return this.name;
	}

	public void setPoint(int point) {
		this.point = point;	
	}
	
	public void addPoint(int point) {
		this.point += point;
	}
	
	public int getPoint() {
		return point;
	}
	
// 	public void printString() {
// 		System.out.println("Points: " + point);
// 		System.out.println("Name: " + name);
// 	}
	
}
