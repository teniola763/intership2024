import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class classExamples {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Hello world ");
        Matcher matcher = pattern.matcher("[abc]");
        boolean matchFound = matcher.find();


        if(matcher.find()) {
            System.out.println("match found ");
        }else {
            System.out.println("match not found");
        }
    }
}
