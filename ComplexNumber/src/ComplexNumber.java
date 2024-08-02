import java.util.Scanner;

public class ComplexNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    private double real;
    private double imaginary;

    public ComplexNumber() {
        this(0.0, 0.0);
    }

    public ComplexNumber(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }


    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    //add method
    public ComplexNumber add(ComplexNumber c2) {
        return new ComplexNumber(this.real + c2.real, this.imaginary + c2.getImaginary());
    }


    //subtract method
    public ComplexNumber subtract(ComplexNumber c2) {
        return new ComplexNumber(this.real - c2.real, this.imaginary - c2.getImaginary());
    }

    //multiply method
    public ComplexNumber multiply(ComplexNumber c2) {
        double newReal = this.real * c2.real - this.imaginary * c2.imaginary;
        double newImaginary = this.real * c2.imaginary + this.imaginary * c2.real;
        return new ComplexNumber(newReal, newImaginary);

    }

    //division method
    public ComplexNumber divide(ComplexNumber c2) {
        double denominator = c2.real * c2.real + c2.imaginary * c2.imaginary;
        double newReal = (this.real * c2.real + this.imaginary *c2.imaginary)/ denominator;
        double newImaginary = (this.imaginary * c2.real - this.real * c2.imaginary)/ denominator;
        return new ComplexNumber(newReal, newImaginary);
    }
    }






