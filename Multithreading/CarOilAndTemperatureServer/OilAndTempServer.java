import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OilAndTempServer {

	public static void main(String[] args){
		
		try {
			ServerSocket server= new ServerSocket(9000);
            
			while(true){
				Socket client= server.accept();
				Scanner in=new Scanner( client.getInputStream());
				int id= in.nextInt();
				
				if(id==1 ){                
					//if it is oil sensor (determined by id) and starts new thread for it
					Thread oilThread= new oilThread(client);
					oilThread.start();
				}
				if(id==2){
					//if it is temperature sensor (determined by id) and starts new thread for it
					Thread tempThread= new tempThread(client);
					tempThread.start();
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
