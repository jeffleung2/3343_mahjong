package mahJong;

public class CountContainTwoDragon implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = PointsAccumulator.getInstance();
		pointsAccumulator.setPoint(2);
		pointsAccumulator.setName("Contain two Dragon ");
	}

}
