package HomeWork;

import java.util.Scanner;

public class EvenOddSumLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.print("Enter an integer(enter 0 to stop inputting): ");
        int integer = input.nextInt();

        while (integer != 0){
            if(integer % 2 == 0){
                evenSum = evenSum + integer;
            }else {
                oddSum = oddSum + integer;
            }
            System.out.print("Enter an integer(enter 0 to stop inputting): ");
            integer = input.nextInt();
        }
        System.out.println("The sum of even numbers is " + evenSum);
        System.out.print("The sum of odd numbers is " + oddSum);
    }
}
