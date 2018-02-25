
public class FormulaGrandPrixMain {

	public static void main(String[] args) throws InterruptedException
	{
		Race race = new Race();
		PitStop box = new PitStop();
		
		new Thread(new Pilot("Kimi Raikonen",race,box)).start();
		new Thread(new Pilot("Felipe Massa",race,box)).start();
		new Thread(new Pilot("Luis Hamilton",race,box)).start();
		new Thread(new Pilot("Fernando Alonso",race,box)).start();
		
		System.out.print("Get ready...");
		Thread.sleep(2000);
		System.out.print("get set...");
		Thread.sleep(2000); 
		System.out.println("GO!!");
		race.startRace();
	}
}
