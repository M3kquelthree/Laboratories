import java.util.Scanner;

public class RunAmountDue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AmountDue due = new AmountDue();

        System.out.println("Press any of the following then enter values separated by spaces:");
        System.out.println("1 - Price only(Example: 1 500)");
        System.out.println("2 - Price and quantity(Example: 2 300 10)");
        System.out.println("3 - Price, quantity, and discount amount(Example: 3 300 10 50)");

        // Read the full line
        String line = scanner.nextLine();
        String[] parts = line.split(" ");

        if (parts.length < 2) {
            System.out.println("Insufficient input.");
            return;
        }

        int option = Integer.parseInt(parts[0]);
        double result = 0;

        try {
            switch (option) {
                case 1:
                    double price = Double.parseDouble(parts[1]);
                    result = due.computeAmountDue(price);
                    break;
                case 2:
                    price = Double.parseDouble(parts[1]);
                    double quantity = Double.parseDouble(parts[2]);
                    result = due.computeAmountDue(price, quantity);
                    break;
                case 3:
                    price = Double.parseDouble(parts[1]);
                    quantity = Double.parseDouble(parts[2]);
                    double discount = Double.parseDouble(parts[3]);
                    result = due.computeAmountDue(price, quantity, discount);
                    break;
                default:
                    System.out.println("Invalid option.");
                    return;
            }

            System.out.println("Amount due is " + result);
        } catch (Exception e) {
            System.out.println("Invalid input format.");
        }

        scanner.close();
    }
}

