import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ABSserverMAIN {

	static int slip;
    
	public static void main(String[] args) throws IOException, InterruptedException {
	
		ServerSocket server= new ServerSocket(9001);
		int tire=0;
        
		while(tire<4){
			Socket socket=server.accept();
			Thread tireThread = new TireThread(socket);
			tireThread.start();
		    tire++;
		}
	}	
}
