package mahJong;

public class CountMixOneSuit implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = WinTracker.getPointsAccumulator();
		if(pointsAccumulator.getPoint() == 0) {
			pointsAccumulator.setPoint(3);
			pointsAccumulator.setName("Mix One Suit ");
		} else {
			pointsAccumulator.addPoint(3);
			pointsAccumulator.addName("Mix One Suit ");
		}
	}

}
