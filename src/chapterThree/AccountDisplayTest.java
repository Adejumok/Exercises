package chapterThree;

import java.util.Scanner;

public class AccountDisplayTest {
    public static void main(String[] args) {
        //System.out.println("%s balance: $%.2f%n", displayAccount(Account milkAccount);

    }

        public static void displayAccount(Account accountToDisplay) {
            AccountDisplay milkAccount = new AccountDisplay("Dorcas", 50.00);
            AccountDisplay caramelAccount = new AccountDisplay("Precious", 45.00);

            Scanner input = new Scanner(System.in);

            System.out.print("Enter deposit amount for milkAccount: ");
            double depositAmount = input.nextDouble();
            System.out.printf("%nadding %.2f to milkAccount balance%n%n", depositAmount);
            milkAccount.deposit(depositAmount);
            

            System.out.print("Enter deposit amount for caramelAccount: ");
            depositAmount = input.nextDouble();
            System.out.printf("%nadding %.2f to caramelAccount balance%n%n", depositAmount);
            caramelAccount.deposit(depositAmount);
            

            System.out.print("Enter withdrawal amount for milkAccount: ");
            double withdrawAmount = input.nextDouble();
            System.out.printf("%nsubtracting %.2f from milkAccount balance%n%n", withdrawAmount);
            milkAccount.withdraw(withdrawAmount);
            
            System.out.print("Enter withdrawal amount for caramelAccount: ");
            withdrawAmount = input.nextDouble();
            System.out.printf("%nsubtracting %.2f from caramelAccount balance%n%n", withdrawAmount);
            caramelAccount.withdraw(withdrawAmount);

            
            

        }
    }
