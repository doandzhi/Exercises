import java.util.Random;

public class PitStop {

	private Random rand =  new Random(System.currentTimeMillis());
	private int pitStopers = 0;
	
	public long getPitStop() throws InterruptedException {
    
		// racer takes between 1-3 seconds getting served!
		long duration = Math.abs((this.rand.nextLong()) % 2000) + 1000;
		Thread.sleep(duration);
		return duration;
	}
}
