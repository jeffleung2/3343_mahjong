package mahJong;

public class CountGreatWinds implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = PointsAccumulator.getInstance();
		pointsAccumulator.setPoint(13);
		pointsAccumulator.setName("Great Winds");
	}

}
