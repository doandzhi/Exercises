import java.util.InputMismatchException;
import java.util.Scanner;


public class QuadraticEquation extends Equation {
	
	private float[] coeffs = new float[3];
	private double[] solutions = new double[2];
	
	public QuadraticEquation(){
	    getUserCoefficients();
	}
	
	private float[] getCoefficients(){
		return coeffs;
	}
	
	double[] getSolutions(){
		return solutions;
	}

	
	@Override
	public float[] getUserCoefficients(){
	    float[] coeffs = new float[3];
	    coeffs = getCoefficients();
        
		try{
		    Scanner input = new Scanner(System.in);
		    System.out.println("Enter the 1st coeff ");
		    coeffs[0] = input.nextFloat();
	    	System.out.println("Enter the 2nd coeff ");
	    	coeffs[1] = input.nextFloat();
	    	System.out.println("Enter the 3rd coeff");
	    	coeffs[2] = input.nextFloat();
		}catch(InputMismatchException e){
			System.out.println("You haven't entered float !");
		}
		return coeffs;
	}




	@Override
	public double[] solve() throws InputMismatchException, IllegalCoefficientException {	
		Scanner input = new Scanner(System.in);
		double[] solutions = new double[2];
		
		try{
			if(coeffs[0]==0)
			throw new IllegalCoefficientException();
		}catch(IllegalCoefficientException e){			
			if(coeffs[0] == 0 ){
			    System.out.println("The equation isn't quadratic ! ");
			    System.out.println("Enter new value for the 1st coeff: ");
			    coeffs[0] = input.nextFloat();
		    	System.out.println("Enter new value for the 1st coeff: ");
		    	coeffs[1] = input.nextFloat();
		    	System.out.println("Enter new value for the 1st coeff: ");
		    	coeffs[2] = input.nextFloat();
			}
		}
			
		if(coeffs[2] == 0){		
			solutions[0] = 0;
			solutions[1] =  (double) -(coeffs[1]/coeffs[0]);
		}
			
			double discriminant = coeffs[1]*coeffs[1] - 4*coeffs[0]*coeffs[2];
			
		if(discriminant>0) {
			solutions[0] = (double) -((coeffs[1] + Math.sqrt(discriminant)) / (2*coeffs[0]));
			solutions[1] = (double) -((coeffs[1] - Math.sqrt(discriminant)) / (2*coeffs[0]));			
		}
			
		if(discriminant == 0){
			if(coeffs[1]>0)
			solutions[0] = solutions[1] = (double) -Math.sqrt(coeffs[2]);
				
			if(coeffs[1]<0)
			solutions[0] = solutions[1] = (double) Math.sqrt(coeffs[2]);
		}
			
		if(discriminant < 0){
			System.out.println("There are no solutions to the quadratic equation");				
		}
        
		this.solutions=solutions;
		return solutions;
	}

	@Override
	public void printSolution() {
		solve();
		solutions = getSolutions();
		System.out.println("The solutions of the quadratic equation are: " + solutions[0] + " " + solutions[1]);
	}
}
