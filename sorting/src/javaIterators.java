import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;

public class javaIterators {
    public static void main(String[] args) {
        // Make a collection
        ArrayList<Integer> cars = new ArrayList<Integer>();
        cars.add(11);
        cars.add(12);
        cars.add(33);
        cars.add(4);

        //get the iterator
        Iterator<Integer> it = cars.iterator();

        //to print the first item
//        System.out.println(it.next());


        //to loop through collection

        while (it.hasNext()) {
//        System.out.println(it.next());

            Integer i = it.next();
            if (i <10) {
                it.remove();
            }
        }
        System.out.println(cars);
    }
}