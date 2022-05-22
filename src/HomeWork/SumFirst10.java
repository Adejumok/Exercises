package HomeWork;

import java.util.Scanner;

public class SumFirst10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int numberCounter = 0;

        for(int i = 1; i <= 10; i++){
            sum = sum + i;
            numberCounter = numberCounter + 1;

        }
        System.out.println("The natural number is " + numberCounter);
        System.out.println("The sum of first 10 natural numbers is " + sum);
    }
}
