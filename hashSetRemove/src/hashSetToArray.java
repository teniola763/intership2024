import java.util.HashSet;

public class hashSetToArray {
    public static void main(String[] args) {
        HashSet<String> money  = new HashSet<String>();
        money.add("naira");
        money.add("pounds");
        money.add("dollars");
        money.add("btc");
        money.add("cedis");

        System.out.println(" HashSet contains " + money );

        //creating an array here
        String[] new_Array = new String [money.size ()];
        money.toArray(new_Array);

        //displaying
        System.out.println("Array contains: ");
        for (String cash : new_Array){
            System.out.println(cash);
        }

    }
}
