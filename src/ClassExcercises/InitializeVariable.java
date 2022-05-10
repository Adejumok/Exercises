package ClassExcercises;

import java.util.Scanner;

public class InitializeVariable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mysteryNumber = 40;

        System.out.println("Guess a number: ");
        int guessedNumber = input.nextInt();


        if (guessedNumber == mysteryNumber) {
            System.out.println("correct");
        }

        if (guessedNumber < mysteryNumber) {
            System.out.println("too low");
        }

        if (guessedNumber > mysteryNumber) {
            System.out.println("too high");
        }



    }
}
