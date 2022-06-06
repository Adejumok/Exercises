package HomeWork;

import java.util.Scanner;

public class GuessGame {
    private static int randomNumber;
    private static Scanner scanner = new Scanner(System.in);
    private static int userGuess;

    public static void main(String[] args) {

        randomNumber = (int)(Math.random() * 100);
        guessCheck();


    }

    private static void guessCheck(){
        while (userGuess != randomNumber) {
            System.out.print("Guess the computer's number between 1-100 both inclusive: ");
            userGuess = scanner.nextInt();

            if (userGuess > randomNumber) {
                System.out.println("Too high, try again");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low, try again");
            } else break;
        }
        System.out.println("Congratulations! You are correct.");
    }

}
