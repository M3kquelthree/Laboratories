import java.util.Scanner;

public class deeznewdue {
    public static void main (String[ ] args) {

        Scanner scanner = new Scanner(System.in);
        AmountDue due = new AmountDue();

        int price;
        int quantity;
        int discount;

        double result = 0;

        System.out.println("Press any of the following then enter values separated by spaces:");
        System.out.println("1 - Price only(Example: 1 500)");
        System.out.println("2 - Price and quantity(Example: 2 300 10)");
        System.out.println("3 - Price, quantity, and discount amount(Example: 3 300 10 50)");

        int option = scanner.nextInt();

        switch(option) {
            case 1:
            System.out.println("Enter price: ");
            price = scanner.nextInt();
            result = due.computeAmountDue(price);

            System.out.print("Result: ");
            System.out.println(result);

            break;

            case 2:
            System.out.println("Enter price | quantity: ");
            price = scanner.nextInt();
            quantity = scanner.nextInt();
            result = due.computeAmountDue(price, quantity);

            System.out.print("Result: ");
            System.out.println(result);

            break;

            case 3:
            System.out.println("Enter price | quantity | discount: ");
            price = scanner.nextInt();
            quantity = scanner.nextInt();
            discount = scanner.nextInt();
            result = due.computeAmountDue(price, quantity, discount);

            System.out.print("Result: ");
            System.out.println(result);

            break;
        }

        scanner.close();

    }
}
