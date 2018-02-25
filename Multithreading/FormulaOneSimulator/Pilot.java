import java.util.Random;


public class Pilot implements Runnable {

	private String name;
	private Race race;
	private PitStop box;
	private Random rand = new Random(System.nanoTime());
	
	public Pilot(String name, Race race, PitStop box) {
		this.name = name;
		this.race = race;
		this.box = box;
	}
	
	public long runLap() throws InterruptedException
	{
		// Racer takes between 4-6 seconds to finish the lap!
		long duration = Math.abs((this.rand.nextLong())) % 4000 + 2000;
		Thread.sleep(duration);
		return duration;
	}	
	
	@Override
	public void run() {
        try {
			
			// lineup for the race
			this.race.getReadyToRace();
			System.out.println(this.name + " started!");
			
			// run three laps.
			for(int i=1; i<=3; i++) {
				
				// First run a lap.
				long time = this.runLap();
				System.out.println(name + " completes lap " + i + " in " + (double)time/(double)1000.00 + " seconds!");		
				
				// Time for a pitstop....
				time = this.box.getPitStop();				
				System.out.println(name + " was in the pit stop for " + (double)time/(double)1000.00 + " seconds!");
			}
            
			// ok race is finished. 
			int place = this.race.crossFinishLine();
			System.out.println(">>> " + name + " finishes in position " + place + "! <<<<<<<<<<<<<<<<<<<<<<<<<<<");
			
		} catch (InterruptedException ie) {
			System.out.println(name + " crashed badly and won't be finishing the race.");
		  }
	}
}
