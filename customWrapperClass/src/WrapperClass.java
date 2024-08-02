import java.math.BigInteger;
import java.util.Scanner;

public class WrapperClass {
    private BigInteger value;

    public WrapperClass(String value) {
        this.value = new BigInteger(value);
    }

    public WrapperClass add(WrapperClass other) {
        return new WrapperClass(this.value.add(other.value).toString());
    }

    public WrapperClass subtract(WrapperClass other) {
        return new WrapperClass(this.value.subtract(other.value).toString());
    }

    public WrapperClass multiply(WrapperClass other) {
        return new WrapperClass(this.value.multiply(other.value).toString());
    }

    public WrapperClass divide(WrapperClass other) {
        return new WrapperClass(this.value.divide(other.value).toString());
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

class WrapperClassOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first very large number: ");
        String num1Str = scanner.next();
        WrapperClass num1 = new WrapperClass(num1Str);

        System.out.print("Enter the second very large number: ");
        String num2Str = scanner.next();
        WrapperClass num2 = new WrapperClass(num2Str);

        // Perform arithmetic operations
        WrapperClass sum = num1.add(num2);
        WrapperClass difference = num1.subtract(num2);
        WrapperClass product = num1.multiply(num2);
        WrapperClass quotient = num1.divide(num2);

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}