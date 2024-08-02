import java.util.ArrayList;

public class JavaWrapperClass {
    public static void main(String[] args) {
        ArrayList<String> laptops = new ArrayList<String>();
        laptops.add("mac");
        laptops.add("lenovo");
        laptops.add("samsung");
        for (String i : laptops) {
            System.out.println(i);
        }
    }
}
