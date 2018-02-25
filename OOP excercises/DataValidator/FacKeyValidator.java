	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class FacKeyValidator {

	    private Pattern pattern;
	    private Matcher matcher;
	    private static final String FK_PATTERN = "(\\d){2}-(\\d){3}";

	    public FacKeyValidator(){
	        pattern = Pattern.compile(FK_PATTERN);
	    }

	    public boolean validateFacilityKey(String facKey){
	    matcher = pattern.matcher(facKey);
	    return matcher.matches();
	    }
	}