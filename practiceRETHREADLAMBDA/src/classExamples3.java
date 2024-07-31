import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class classExamples3 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher("Hello 1 world 2 ");
        while(matcher.find()){
            System.out.println("match found " + matcher.group());
        }

    }}
 