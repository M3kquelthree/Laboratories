import java.util.Scanner;

public class RunSavingsAccount {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();

        System.out.print("Enter interest rate\n(As Decimal Example 5% = 0.05): ");
        double rate = number.nextDouble();
        SavingsAccount.setInterestRate(rate);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = number.nextDouble();
        savings.deposit(depositAmount);

        System.out.print("Enter 1 for another deposit or 2 for withdraw: ");
        char choice = number.next().toUpperCase().charAt(0);

        if (choice == '1') {
            System.out.print("Enter amount to deposit: ");
            double moreDeposit = number.nextDouble();
            savings.deposit(moreDeposit);
            
        } else if (choice == '2') {
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = number.nextDouble();
            savings.withdraw(withdrawAmount);
        }

        SavingsAccount.showBalance(savings);

        if (savings.getBalance() > 1000) {
            savings.addInterest();
            System.out.println("This is the balance after interest: " + savings.getBalance());
        }

        number.close();
    }
}