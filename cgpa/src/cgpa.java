import java.util.ArrayList;
import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declaration


        ArrayList<String> courses = new ArrayList<>();
        courses.add("CSC111");
        courses.add("MAT111");
        courses.add("MAT112");
        courses.add("CHM111");
        courses.add("PHY111");
        courses.add("BIO111");
        courses.add("GST113");
        courses.add("PHY112");
        courses.add("GST111");
        courses.add("GST112");


        calculateScores(courses, scanner);
    }


    public static void calculateScores(ArrayList<String> courses, Scanner scanner) {
        int[] results = new int[courses.size()];
        for (int i = 0; i < courses.size(); i++) {
            System.out.println("Enter your score for " + courses.get(i) + ": ");
            results[i] = scanner.nextInt();

            if (results[i] >= 70) {
                System.out.println('A');
            } else if (results[i] >= 60 && results[i] <= 69) {
                System.out.println('B');
            } else if (results[i] >= 50 && results[i] <= 59) {
                System.out.println('C');
            } else if (results[i] >= 40 && results[i] <= 49) {
                System.out.println('D');
            } else if (results[i] >= 0 && results[i] <= 44) {
                System.out.println('F');
            }
        }

        double totalScore = 0;
        double totalCredits = 0;

        for (int i = 0; i < results.length; i++) {
            double gradePoint = getGradePoint(results[i]);
            if (i < 5) {
                totalScore += gradePoint * 3;
                totalCredits += 3;
            } else {
                totalScore += gradePoint * 2;
                totalCredits += 2;
            }
        }
        double cgpa = totalScore / totalCredits;
        System.out.println("Your CGPA is: " + cgpa);
    }

    public static double getGradePoint(int score) {

            if (score >= 70) {
                return  5.0;
            } else if (score >= 60 && score <= 69) {
                return 4.0;

            } else if (score >= 50 && score <= 59) {
                return 3.0;

            } else if (score >= 40 && score <= 49) {
                return  2.0;

            } else if (score >= 0 && score <= 44) {
                return 0.0;

            } else {
                System.out.println("Invalid input ");
            }
            return - 1;
        }
    }


