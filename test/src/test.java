import java.util.ArrayList;
import java.util.Scanner;


public class test {

    static Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    public void input(){
        System.out.println("please enter a number ");
        int i = Integer.parseInt(scanner.nextLine());
        numbers.add(i);
        if ( i <= 0) {
            System.out.println("The number is positive ");
        } else {
            System.out.println("The number is negative ");
        }
    }
}