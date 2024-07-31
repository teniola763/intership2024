//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        cgpa obj = new cgpa();
//        obj.
//                Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Enter your CSC111 score :" +);
//
//        }
//
//    }
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class cgpa {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("TO CALCULATE YOUR CGPA ,FOLLOW THE FOLLOWING STEPS :");
//        ArrayList<String> courses = new ArrayList<>();
//        courses.add("CSC111");
//        courses.add("MAT111");
//        courses.add("CHM111");
//        courses.add("PHY1111");
//        courses.add("PHY112");
//        courses.add("BIO111");
//        courses.add("GST111");
//        courses.add("GST113");
//        CalculateScores(courses, scanner);
//    }
//
//    public static void CalculateScores(ArrayList<String> courses, Scanner scanner) {
//        int[] results = new int[courses.size()];
//        for (int i = 0; i < courses.size(); i++) {
//            System.out.println("Enter your score for " + courses.get(i) + ": ");
//            results[i] = scanner.nextInt();
//
//            double totalScore = 0;
//            for (int result : results) {
//                if (result >= 70) {
//                    System.out.println('A');
//                } else if (result >= 60 && result <= 69) {
//                    System.out.println('B');
//                } else if (result >= 50 && result <= 59) {
//                    System.out.println('C');
//                } else if (result >= 40 && result <= 49) {
//                    System.out.println('D');
//                } else if (result >= 0 && result <= 44) {
//                    System.out.println('F');
//                } else {
//                    System.out.println("Invalid input ");
//                }
//            }
//            double cgpa = totalScore / results.length;
//            System.out.println("Your CGPA is: " + cgpa);
//            scanner.close();
//
//        }
//
//    }
//}
//
