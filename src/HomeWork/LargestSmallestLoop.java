package HomeWork;

import java.util.Scanner;

public class LargestSmallestLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number(the program ends if 0 is entered): ");
        int number = input.nextInt();

        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;

        while(number != 0){
           if(number > largestNumber) {
               largestNumber = number;
           }
           if(number < smallestNumber) {
               smallestNumber = number;
           }
            System.out.print("Enter a number(the program ends if 0 is entered): ");
            number = input.nextInt();
        }
        System.out.println("The largest number is " + largestNumber);
        System.out.println("The smallest number is " + smallestNumber);

    }
}
