import java.util.HashSet;

public class hashSetCollection {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(14);
        numbers.add(19);
        numbers.add(20);
        numbers.add(15);

        for (int i = 1; i <=20 ; i++ ) {
            if (numbers.contains(i)) {
                System.out.println(i + " number is present");
            } else {
                System.out.println(i + "number is not present");
            }

        }
    }
}
