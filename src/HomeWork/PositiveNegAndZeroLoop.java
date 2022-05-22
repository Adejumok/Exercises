package HomeWork;

import java.util.Scanner;

public class PositiveNegAndZeroLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        char choice;

        do{
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if(number > 0){
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            }else {
                countZero++;
            }

            System.out.print("Enter E to end the program and C to continue the program: ");
            choice = input.next().charAt(0);

        }while (choice == 'C' || choice == 'c');

        System.out.println("Positive number(s) is " + countPositive);
        System.out.println("Negative number(s) is " + countNegative);
        System.out.println("Zero(s) is " + countZero);
    }

}
