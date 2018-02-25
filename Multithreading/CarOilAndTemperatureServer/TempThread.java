import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class tempThread extends Thread {

	Socket socket;
	int temp;
	
	public tempThread(Socket socket) {
		this.socket=socket;
	}

	@Override
	public void run() {
		tempCheck();
	}
	
	public boolean tempCheck(){
		while(true){
			try {
				Scanner tempIn= new Scanner(socket.getInputStream());
				Thread.sleep(500);
				temp=tempIn.nextInt();
				if(temp>120){
					//throw new exception
				}
				
				
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
