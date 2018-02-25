import java.util.InputMismatchException;

public interface Solvable {	
	
	public abstract double[] solve() throws InputMismatchException, IllegalCoefficientException;
	public abstract void printSolution();
	public abstract float[] getUserCoefficients();
}