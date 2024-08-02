import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer>data =new HashSet<Integer>();
        data.add(1);
        data.add(12);
        data.add(3);
        System.out.println("Elements in Data : " + data);

        HashSet<Integer>value = new HashSet<Integer>();
        value.add(10);
        value.add(59);
        value.add(100);

        System.out.println("Elements in Value: " + value);

        HashSet<Integer>item = new HashSet<Integer>();
        item.add(20);
        item.add(99);
        item.add(170);

        HashSet<Integer>union = new HashSet<>(data);
        union.addAll(value);
        union.addAll(item);


        System.out.println("Hashset: Contains all " );
        System.out.println(union);





    }
}