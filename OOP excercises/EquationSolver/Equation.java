import java.util.InputMismatchException;

public abstract class Equation implements Solvable {
	
	public abstract double[] solve() throws InputMismatchException, IllegalCoefficientException;
	public abstract void printSolution();
	public abstract float[] getUserCoefficients();
}


