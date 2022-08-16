package deitelExercise.chapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account melaninAccount = new Account("Daniel Joy", 50.00);
        Account ebonyAccount = new Account("Dave Lois", 45.00);

        System.out.printf("%s balance: $%.2f%n%n", melaninAccount.getName(), melaninAccount.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", ebonyAccount.getName(), ebonyAccount.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for melaninAccount: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to melaninAccount balance%n%n", depositAmount);
        melaninAccount.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", melaninAccount.getName(), melaninAccount.getBalance());
        System.out.printf("%s balance: $%.2f%n", ebonyAccount.getName(), ebonyAccount.getBalance());

        System.out.print("Enter deposit amount for ebonyAccount: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to ebonyAccount balance%n%n", depositAmount);
        ebonyAccount.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n%n", melaninAccount.getName(), melaninAccount.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", ebonyAccount.getName(), ebonyAccount.getBalance());

        System.out.print("Enter withdrawal amount for melaninAccount: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%nsubtracting %.2f from melaninAccount balance%n%n", withdrawAmount);
        melaninAccount.withdraw(withdrawAmount);

        System.out.printf("%s balance: $%.2f%n", melaninAccount.getName(), melaninAccount.getBalance());
        System.out.printf("%s balance: $%.2f%n", ebonyAccount.getName(), ebonyAccount.getBalance());

        System.out.print("Enter withdrawal amount for ebonyAccount: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%nsubtracting %.2f from ebonyAccount balance%n%n", withdrawAmount);
        ebonyAccount.withdraw(withdrawAmount);

        System.out.printf("%s balance: $%.2f%n", melaninAccount.getName(), melaninAccount.getBalance());
        System.out.printf("%s balance: $%.2f%n", ebonyAccount.getName(), ebonyAccount.getBalance());

    }
}
