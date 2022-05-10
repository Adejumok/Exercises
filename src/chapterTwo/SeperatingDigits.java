package chapterTwo;

import java.util.Scanner;

public class SeperatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any five digit number: ");
        int number = input.nextInt();

        int firstNumber = number % 10;
        int secondNumber = number % 100;
        int thirdNumber = number % 1000;
        int fourthNumber = number % 10_000;
        int fifthNumber = number % 100_000;

        int firstDigit = fifthNumber / 10_000;
        int secondDigit = fourthNumber / 1000;
        int thirdDigit = thirdNumber / 100;
        int fourthDigit = secondNumber / 10;
        int fifthDigit = firstNumber / 1;
        System.out.printf("Numbers are %d %d %d %d %d" ,firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);

    }
}
