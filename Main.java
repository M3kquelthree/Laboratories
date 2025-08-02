import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter first double value: ");
        double num1 = sc1.nextDouble();
        System.out.print("Enter second double value: ");
        double num2 = sc1.nextDouble();

        plusFive(num1, num2);
        timesTwo(num1, num2);
        Squared(num1, num2);
        Percent(num1, num2);

        sc1.close();
    }

    public static void plusFive(double a, double b) {
        System.out.println("After adding five is: " + (a + 5) + " and " + (b + 5));
    }

    public static void timesTwo(double a, double b) {
        System.out.println("After multiplying by two is: " + (a * 2) + " and " + (b * 2));
    }

    public static void Squared(double a, double b) {
        System.out.println("Squared values is: " + (a * a) + " and " + (b * b));
    }

    public static void Percent(double a, double b) {
        if (b != 0) {
            double percent = (a / b) * 100;
            System.out.printf("%.2f is %.0f percent of %.2f.%n", a, percent, b);
        } else {
            System.out.println("Cannot compute percentage: second value is zero.");
        }
    }
}