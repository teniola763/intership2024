import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> bottles  = new HashSet<String>();

        //Add things to the string
        bottles.add("8");
        bottles.add("7");
        bottles.add("6");
        bottles.add("4");
        bottles.add("3");

        for (int i = 1;i<= 10; i++){
            if (bottles.contains(i)){
                System.out.println(i + " "+ " bottles were found ");
            }else {
                System.out.println(i + "  " + "bottles were not found ");
            }
        }
    }
}
