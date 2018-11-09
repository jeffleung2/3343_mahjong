package mahJong;

import java.util.ArrayList;

public class PointsAccumulator {
	
	private static int point;
	private static String name = "chicken hand";
	private static PointsAccumulator instance = new PointsAccumulator();
	
	private PointsAccumulator() {
		point = 0;
		name = "chicken hand";
	}
	
	public void setName(String name) {
		PointsAccumulator.name = name;
	}
	
	public static PointsAccumulator getInstance() {
		return instance;
	}
	
	
	public int getPoint() {
		return point;
	}
	
	public void addPoint(int point) {
		PointsAccumulator.point += point;
	}
	
	public void addName (String name) {
		PointsAccumulator.name += name;
	}
	
	public void printString() {
		System.out.println("Points: " + point);
		System.out.println("Name: " + name);
	}

	public void setPoint(int point) {
		PointsAccumulator.point = point;	
	}
	
	
	
}
