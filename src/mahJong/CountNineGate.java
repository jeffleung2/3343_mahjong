package mahJong;

public class CountNineGate implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = WinTracker.getPointsAccumulator();
		pointsAccumulator.setPoint(13);
		pointsAccumulator.setName("Nine Gate Hand ");
		
	}

}
