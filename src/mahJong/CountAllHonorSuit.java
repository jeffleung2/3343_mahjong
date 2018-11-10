package mahJong;

import java.util.ArrayList;

public class CountAllHonorSuit implements Counter {

	@Override
	public void count() {
		PointsAccumulator pointsAccumulator = WinTracker.getPointsAccumulator();
		pointsAccumulator.setName(" All Honor Suit");
		pointsAccumulator.setPoint(13);
	}

}
