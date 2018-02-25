import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator{

    private Pattern pattern;
    private Matcher matcher;

    //declare a string pattern for username.
    private static final String USERNAME_PATTERN = "^[a-zA-z]{1,50}$";

    public UsernameValidator(){
        pattern = Pattern.compile(USERNAME_PATTERN);
    }

    public boolean validateUserName(String username){
        matcher = pattern.matcher(username);
        return matcher.matches();
    }
}