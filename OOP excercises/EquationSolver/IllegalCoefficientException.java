
public class IllegalCoefficientException extends IllegalArgumentException {
	
	@Override	
	public String getMessage(){
		return "You have entered 0 as a coeff !!!" ;
	}
}
