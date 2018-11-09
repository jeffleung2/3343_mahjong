package mahJong;

public class CountCommonHand implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = PointsAccumulator.getInstance();
		pointsAccumulator.addPoint(1);
		pointsAccumulator.addName(" common hand");
	}

}
