import java.util.ArrayList;
import java.util.Iterator;

public class UsingAnIterator {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<String>();
        objects.add("books");
        objects.add("lipstick");
        objects.add("red bag");

        Iterator<String> it = objects.iterator();
//        System.out.println(objects);
//
//        or to print first item
//        System.out.println(it.next());

//        or to loop through
        while(it.hasNext()){
            String i = it.next();
            if(i .equals("red bag")){
            it.remove();

        }
    }
        System.out.println(objects);
}
}