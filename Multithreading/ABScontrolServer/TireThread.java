import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TireThread extends Thread {

	static Socket socket;
	int id;
	static int breaks;
	static int slip;
	boolean slip1, slip2,slip3,slip4;
	
	public TireThread(Socket socket) {
    this.socket= socket;
	}
	
	
	@Override
	public void run() {
	{
		try {
			Scanner sc=new Scanner(socket.getInputStream());
            
            //get the id(number of the wheel)
			id=sc.nextInt();
			
			
			if(id==1){
				
				slip1= slipTire();
				controlABS(slip1);
				Thread.sleep(500);
				slip1=false;
			}
			else if(id==2){
				
				slip2=slipTire();		
				controlABS(slip2);
				Thread.sleep(500);
				slip2=false;
			}
			else if(id==3){
				
				slip3=slipTire();
				controlABS(slip3);
				Thread.sleep(500);
				slip3=false;
			}
			else if(id==4){
				
				slip4=slipTire();
				controlABS(slip4);
				Thread.sleep(500);
				slip4=false;
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean slipTire(){
		Scanner sc;
		try {
			sc = new Scanner(socket.getInputStream());
			slip=sc.nextInt();
		} catch (IOException e) {
			e.printStackTrace();
		}
			if(slip<50){            //everything is normal
				slipTire();
			}
			else{
				return true;          //wheel spins at one place
			}
            
	return false;
	}
	
	public static void controlABS(boolean slip){
    
		if(slip){
		breaks-=(int) (breaks*0.3);        //if slips lowers breaks by 30%
		}
	}
}
