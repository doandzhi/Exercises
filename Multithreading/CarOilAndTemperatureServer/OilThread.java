import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class oilThread extends Thread {
	
	boolean oil;
	Socket socket;
	
	public oilThread(Socket socket) {
		this.socket=socket;
	}

	@Override
	public void run() {
    
        //check the oil every 500 milliseconds
		while(true){             
			try {      
				Scanner oilSc= new Scanner(socket.getInputStream());
				oil=oilSc.nextBoolean();
			
				if(oil==false){
					//	throw new EngineOilLow Exception;
				}
				Thread.sleep(500);
			} catch (IOException | InterruptedException e) {
			
			e.printStackTrace();
			}
		}
	}
}
