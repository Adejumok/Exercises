package deitelExercise.chapterFour;

import java.util.Scanner;

public class CreditLimitMain {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();

        System.out.println("Enter the number of customers you want to enter: ");
        int customerNumber = input.nextInt();

        for (int customer = 1; customer <= customerNumber; customer++) {
            System.out.println("Enter number " + customer + " customer's account number: ");
            String accountNumber = input.next();
            System.out.println("Enter the balance at the beginning of the month: ");
            double balance = input.nextDouble();
            System.out.println("Enter the total of all items charged by the customer this month: ");
            int totalItems = input.nextInt();
            System.out.println("Enter the total of all credits" +
                    " applied to the customer's account this month: ");
            double totalCredits = input.nextDouble();
            System.out.println("Enter credit limit allowed for the customer: ");
            double allowedCreditLimit = input.nextDouble();
            System.out.println();

            System.out.println("The customer with account number " + accountNumber + " " +
                    "has a balance of #" + balance + " and " + totalItems + " items was charged. The credits applied to the account this month is #" + totalCredits + "" +
                    " while the allowed credit limit for the customer is #" + allowedCreditLimit + " .");
            System.out.println();

            double charges = 12.00;
            double newBalanceC = creditLimitCalculator.newBalance(balance, charges, totalCredits);
            System.out.println("The customer with account number " +
                    accountNumber + " new balance is #" + newBalanceC);
            System.out.println(creditLimitCalculator.creditLimitExceed(newBalanceC));
            System.out.println();

        }

    }
}
