package mahJong;

public class CountAllOneSuit implements Counter{

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = PointsAccumulator.getInstance();
		pointsAccumulator.setName(" All One Suit");
		pointsAccumulator.setPoint(7);
	}

}
