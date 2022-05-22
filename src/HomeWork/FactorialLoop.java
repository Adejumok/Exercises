package HomeWork;

import java.util.Scanner;

public class FactorialLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int factorial = 1;

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for(int i= 1; i<=number; i++){
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
