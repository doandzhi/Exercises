import java.util.InputMismatchException;
import java.util.Scanner;

public class LinearEquation extends Equation{
	
	
	private float[] coeffs = new float[2];
	private double[] solutions = new double[1]; 
	
	public LinearEquation(){
		getUserCoefficients();
	}
	
	public float[] getCoefficients(){
		return coeffs;
	}
	
	
	public void setCoefficients(float[] coeffs){
		this.coeffs = coeffs;
	}
	
	
	@Override
	public float[] getUserCoefficients(){
		
		try{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the 1st coeff: ");
			coeffs[0] = input.nextFloat();
			System.out.println("Enter the 2nd coeff: ");
			coeffs[1] = input.nextFloat();
			//coeffs = getCoefficients();
		}
		
		catch(InputMismatchException e){
			System.out.println("You haven't entered a float !");
		}
		
	//	this.coeffs = coeffs;
	//	coeffs=getCoefficients();
		//coeffs[0] = getCoefficients()[0];
	//	coeffs[1] = getCoefficients()[1];
		
		return coeffs;
	}

	
		
		public double[] getSolutions(){
			return solutions;
		}
		
	
		
	@Override
	public double[] solve() throws InputMismatchException, IllegalCoefficientException{
		
		Scanner input = new Scanner(System.in);
		
		try{
			if(coeffs[0]==0 || coeffs[1]==0)
			throw new IllegalCoefficientException();
		}
		
		catch(IllegalCoefficientException e){
			System.out.println("The equation isn't linear !");
			System.out.println("Enter new values for 1st coeff or 2nd coeff or both: ");
            
			if(coeffs[0] == 0){
			coeffs[0] = input.nextFloat();
			}
			
			if (coeffs[1] == 0){
			coeffs[1] = input.nextFloat();
			}
			
			if(coeffs[0] == 0 && coeffs[1] == 0){
			    coeffs[0] = input.nextFloat();
			    coeffs[1] = input.nextFloat(); 
			}
		}

		solutions[0] = (-coeffs[1])/coeffs[0];
		return solutions;
	}

	@Override
	public void printSolution() {
		solve();
		System.out.println("The solution of the linear equation is: " + solutions[0]);
	}
}
