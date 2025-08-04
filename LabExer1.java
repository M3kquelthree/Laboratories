import java.util.Scanner;

public class LabExer1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter two numbers.");
        System.out.print("First number: ");
        double num1 = sc1.nextDouble(); //will store the first number
        System.out.print("Second number: ");
        double num2 = sc1.nextDouble(); //will store the second number

        plusFive(num1, num2); //Calls the plusFive method
        timesTwo(num1, num2); //Calls the timesTwo method
        showSquared(num1, num2); //Calls the showSquared method
        computePercent(num1, num2); //Calls the computePercent method

        sc1.close();
    }
    //Methods for plusfive
    public static void plusFive(double a, double b) {
        System.out.println((a + 5) + " and " + (b + 5));
    }
    //Methods for timesTwo
    public static void timesTwo(double a, double b) {
        System.out.println((a * 2) + " and " + (b * 2));
    }
    //Methods for showSquared
    public static void showSquared(double a, double b) {
        System.out.println((a * a) + " and " + (b * b));
    }
    //Methods for computePercent
    //This method computes the percentage of the first number relative to the second number
    public static void computePercent(double a, double b) {
        if (b != 0) {
            double percent = (a / b) * 100;
            System.out.printf("%.1f is %.0f percent of %.1f%n", a, percent, b); //Formatted output
        } else {
            System.out.println("Cannot compute percentage: second value is zero.");
        }
    }
}
