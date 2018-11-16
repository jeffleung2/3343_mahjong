package mahJong;

public class CountContainOneDragon implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = WinTracker.getPointsAccumulator();
		pointsAccumulator.addPoint(1);
		pointsAccumulator.addName("Contain One Dragon ");
		
	}

}
