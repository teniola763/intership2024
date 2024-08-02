import java.util.ArrayList;
import java.util.Collections;

    class Main2 {
        public static void main(String[] args) {

            // sort is used to sort array list and arrange it in ascending or descending order
            ArrayList<Integer> Mynumbers = new ArrayList<Integer>();
            Mynumbers.add(1);
            Mynumbers.add(2);

            //to sort through the numbers
            Collections.sort(Mynumbers, Collections.reverseOrder());

            for (int i : Mynumbers) {
                System.out.println(Mynumbers);

            }
        }
    }