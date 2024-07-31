import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class classExamples2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[^abc]");
        Matcher matcher = pattern.matcher("Hello world ");


        if (matcher.find()) {
            System.out.println(" match found " + matcher.group());
        } else {
            System.out.println("match not found");
        }
    }
}