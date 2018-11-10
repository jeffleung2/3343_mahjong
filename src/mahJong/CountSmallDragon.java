package mahJong;

public class CountSmallDragon implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = WinTracker.getPointsAccumulator();
		pointsAccumulator.setPoint(5);
		pointsAccumulator.setName("Small Dragon");
		
	}

}
