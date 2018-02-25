	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class EgnValidator {
	
		private Pattern pattern;
		private Matcher matcher;

	    //declare a string pattern for username.

	    private static final String EGN_PATTERN = "(\\d)+";

	    public EgnValidator(){
	        pattern = Pattern.compile(EGN_PATTERN);
	    }

	    public boolean validateEgn(String egn){
	        matcher = pattern.matcher(egn);
	    return matcher.matches();
	    }
	}