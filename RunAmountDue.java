import java.util.Scanner;

public class RunAmountDue {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        AmountDue due = new AmountDue();

        System.out.println("Enter values separated by spaces:");
        System.out.println("1 value = Price only (Example: 500)");
        System.out.println("2 values = Price and Quantity (Example: 300 10)");
        System.out.println("3 values = Price, Quantity, Discount (Example: 300 10 50)");

        String line = Sc.nextLine();
        String[] parts = line.split(" ");

        double result = 0;

        try {
            if (parts.length == 1) {
                double price = Double.parseDouble(parts[0]);
                result = due.computeAmountDue(price);
            } else if (parts.length == 2) {
                double price = Double.parseDouble(parts[0]);
                double quantity = Double.parseDouble(parts[1]);
                result = due.computeAmountDue(price, quantity);
            } else if (parts.length == 3) {
                double price = Double.parseDouble(parts[0]);
                double quantity = Double.parseDouble(parts[1]);
                double discount = Double.parseDouble(parts[2]);
                result = due.computeAmountDue(price, quantity, discount);
            } else {
                System.out.println("Invalid number of inputs.");
                Sc.close();
                return;
            }

            System.out.printf("Amount due is %.2f%n", result);
        } catch (Exception e) {
            System.out.println("Invalid input format.");
        }
        
        Sc.close();
    }
}

