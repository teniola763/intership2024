import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("teni tedlance ", Pattern.CASE_INSENSITIVE);
        Matcher matcher= pattern.matcher(" ,[abc] teni tedlance ");
        boolean matchFound = matcher.find();
        if (matchFound){
            System.out.println("match found ");
        }else {
            System.out.println("item NOT FOUND");
        }


    }
}
