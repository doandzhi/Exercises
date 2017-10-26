import java.util.InputMismatchException;
import java.util.Scanner;


public class Exception {

	public static void main(String[] args){		
		
		System.out.println("What kind of equation would you like to solve ? ");
		System.out.println("------------------------------");
		System.out.println("Enter 1 for linear and 2 for quadratic ");
        Input();
	}
	
	public static void Input(){
    		
		Scanner input = new Scanner(System.in);
		Equation[] equation = new Equation[2];
		int choice = 0;
	
	    try{
	    	do{
	    		System.out.println("Please enter your choice");
	    		choice = input.nextInt();
	    		switch(choice){  
	    			case 1:
	    				
	    				LinearEquation le = new LinearEquation();  
	    				equation[0] = le;
	    			//	double[] solution = new double[1];
	    				//solution = le.getSolutions();
	    				equation[0].printSolution();
	    				break;

	    			case 2:
	    				QuadraticEquation quadratic = new QuadraticEquation();
	    				equation[1] = quadratic;
	    				//double[] solutions = new double[2];
	    				//solutions = quadratic.getSolutions();
	    				equation[1].printSolution();
	    				break;
	    			default: System.out.println("Please enter 1 or 2 ");
	    			break;
				
	    		}
	    	}while(choice!= 1 && choice != 2);
	    }
	    
	    catch(InputMismatchException e){
	    	System.out.println("You haven't entered an optional choice !");	 
	    	Input();
	    }
	       
	    catch(NumberFormatException e){
	    	System.out.println("You have entered a negative choice! ");
	    	Input();
	    }
	}
}
