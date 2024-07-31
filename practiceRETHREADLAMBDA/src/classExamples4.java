import java.util.regex.Matcher;
import java.util.regex.Pattern;

//public class classExamples4 {
//    code for outmost number of charcters present in match
//    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("a{3}");
//        Matcher matcher = pattern.matcher("aaaabbbccc");
//        while(matcher.find()){
//            System.out.println("match found " + matcher.group());
//        }



//code for the lowest and outmost number of character that can be found in a match
//    public class classExamples4 {
//        public static void main(String[] args) {
//            Pattern pattern = Pattern.compile("a{2,4}");
//            Matcher matcher = pattern.matcher("aaaaabbbcc");
//            while (matcher.find()) {
//                System.out.println("match found " + matcher.group());
//            }



//code for the lowest number of a particular that can be present in a match
public class classExamples4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a{2,}");
        Matcher matcher = pattern.matcher("cccaabbbbnnnn");
        while(matcher.find()){
            System.out.println("match found " + matcher.group());
        }



        }
    }

