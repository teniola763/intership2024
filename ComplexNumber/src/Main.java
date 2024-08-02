import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Add two complex numbers");
            System.out.println("2. Subtract two complex numbers");
            System.out.println("3. Multiply two complex numbers");
            System.out.println("4. Divide two complex numbers");
            System.out.println("5. Exit");


            System.out.println("Pick an option");
            int option = scanner.nextInt();




            // Get the first complex number input
            System.out.print("Enter the real part of the first complex number: ");
            double real1;
            while(true){
                try{
                    real1= scanner.nextDouble();
                    scanner.nextLine();
                    break;
                }catch(InputMismatchException e){
                    System.out.println("Invalid input.Pls input valid real number ");
                    scanner.nextLine();
                }
            }
            System.out.print("Enter the imaginary part of the first complex number: ");
            double imaginary1;
            while(true) {
                try {
                    imaginary1 = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input.Pls input valid imaginary number :");
                    scanner.nextLine();
                }
            }
            ComplexNumber c1 = new ComplexNumber(real1, imaginary1);

            // Get the second complex number from the user
            System.out.print("Enter the real part of the second complex number: ");
            double real2;
            while(true){
                try{
                    real2 = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                }catch(InputMismatchException e){
                    System.out.println("Invalid input.Pls input valid real number:");
                    scanner.nextLine();
                }
            }
            System.out.print("Enter the imaginary part of the second complex number: ");
            double imaginary2;
            while(true){
                try{
                    imaginary2 = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                }catch(InputMismatchException e){
                    System.out.println("Invalid input.Pls input a vaild imaginary number");
                }
            }

            ComplexNumber c2 = new ComplexNumber(real2, imaginary2);
            //switch case
            ComplexNumber result = null;
            switch (option) {
                case 1:
                    result = c1.add(c2);
                    System.out.println("Sum: " + result.getReal() + " + " + result.getImaginary() + "i");
                    break;

                case 2:
                    result= c1.subtract(c2);
                    System.out.println("Difference: " + result.getReal() + " + " + result.getImaginary() + "i");
                    break;
                case 3:
                    result = c1.multiply(c2);
                    System.out.println("Mulitplication: " + result.getReal() + " + " + result.getImaginary() + "i");
                    break;
                case 4:
                    result = c1.divide(c2);
                    System.out.println("Division: " + result.getReal() + " + " + result.getImaginary() + "i");
                    break;

                case 5:
                    exit  = true ;
                   break;

                default:
                    System.out.println("Inavlid option.Pls select a valid option");
                    break;
            }

        }

    }

}

