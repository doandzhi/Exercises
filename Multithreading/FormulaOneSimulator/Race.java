
public class Race {
	
	private int place=0;
	
	public synchronized void getReadyToRace() throws InterruptedException
	{
		this.wait();
	}
		
	/**
	 * Called to start the race.
	 */
	public synchronized void startRace()
	{
		this.notifyAll();		
	}

	public synchronized int crossFinishLine()
	{
		return ++place;
	}
}
