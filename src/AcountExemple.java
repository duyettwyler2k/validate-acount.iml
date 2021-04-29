import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AcountExemple {
    public static final String Acount="^[_a-z0-9]{6,}$";
    public AcountExemple(){};
    public boolean validate(String regex){
        Pattern pattern=Pattern.compile(Acount);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
