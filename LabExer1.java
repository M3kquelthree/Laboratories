import java.util.Scanner;

public class LabExer1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter two numbers.");
        System.out.print("First number: ");
        double num1 = sc1.nextDouble(); //will store the first number
        System.out.print("Second number: ");
        double num2 = sc1.nextDouble(); //will store the second number

        plusFive(num1, num2);
        timesTwo(num1, num2);
        showSquared(num1, num2);
        computePercent(num1, num2);

        sc1.close();
    }

    public static void plusFive(double a, double b) {
        System.out.println((a + 5) + " and " + (b + 5));
    }

    public static void timesTwo(double a, double b) {
        System.out.println((a * 2) + " and " + (b * 2));
    }

    public static void showSquared(double a, double b) {
        System.out.println((a * a) + " and " + (b * b));
    }

    public static void computePercent(double a, double b) {
        if (b != 0) {
            double percent = (a / b) * 100;
            System.out.printf("%.1f is %.0f percent of %.1f%n", a, percent, b);
        } else {
            System.out.println("Cannot compute percentage: second value is zero.");
        }
    }
}
