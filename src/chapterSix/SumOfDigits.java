package chapterSix;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter four digits seperating them with spaces: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        int fourthNumber = input.nextInt();

        System.out.println("The sum of the four digits is " + digitSum(firstNumber, secondNumber, thirdNumber, fourthNumber));

    }

    public static int digitSum(int w, int x, int y, int z){
        int sum = w + x + y + z;

        return sum;
    }

}
