package mahJong;

public class CountContainOneDragon implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = WinTracker.getPointsAccumulator();
		pointsAccumulator.setPoint(1);
		pointsAccumulator.setName("Contain One Dragon ");
		
	}

}
