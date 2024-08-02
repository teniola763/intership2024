import java.util.ArrayList;
import java.util.Iterator;

public class iteratorToRemove {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(23);
        numbers.add(30);
        numbers.add(10);

        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if (i <= 20) {
                it.remove();


            }
        }     System.out.println(numbers);
}
}