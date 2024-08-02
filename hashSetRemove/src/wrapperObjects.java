import java.util.ArrayList;

public class wrapperObjects {
    public static void main(String[] args) {
        Integer myInt= 7;
        Double myDouble = 4.00;
        float myFloat = 1.1f;
        Character myChar = 'A';
//        System.out.println(myInt);
//        System.out.println(myDouble);
//        System.out.println(myFloat);
//        System.out.println(myChar);
//or

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myFloat);
        System.out.println(myChar.charValue());
    }
}