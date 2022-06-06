package HomeWork;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value = 1;

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        for (int i = 1; i <= secondNumber; i++) {
            value *= firstNumber;
        }
        System.out.println("The power value of " + firstNumber + " is " + value);
    }
}
