import java.util.HashSet;

public class HashSetSpecifiedItem {
    public static void main(String[] args) {
        HashSet<String>data = new HashSet<>();
        data.add("BMV");
        data.add("Mazda");
        data.add("Accrd");
        data.add("Chev");

        if (data.contains("Chev")) {
            System.out.println("present");
        }else{
            System.out.println("item Does not exist");
        }


    }
}
