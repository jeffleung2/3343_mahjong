package mahJong;

public class CountSmallDragon implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = PointsAccumulator.getInstance();
		pointsAccumulator.setPoint(5);
		pointsAccumulator.setName("Small Dragon");
		
	}

}
