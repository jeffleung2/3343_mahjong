package mahJong;

public class CountSmallWinds implements Counter{

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = PointsAccumulator.getInstance();
		pointsAccumulator.setPoint(13);
		pointsAccumulator.setName("Small Winds");
	}

}
