package ClassExercises;

import java.util.Random;
import java.util.Scanner;

public class RandomQuestions {

//    Pseudocode
//    Generate random math questions;
//    Indicate that it should be asked five times;
//        If the first number is lesser than the second number, swap it with the second;
//        Prompt the user to answer;
//
//        Check the answer;
//        Display the number of correct responses and the number of wrong responses;
//        Display the response result as "Correct responses minus Wrong responses";

    private static final Scanner scanner = new Scanner(System.in);
    private static int questionsNumber;
    private static int userAnswer;
    public static void main(String[] args) {
        System.out.println("How many questions would you like to answer: ");
         questionsNumber = scanner.nextInt();

        Random randomNumber = new Random();

        int questionsCount = 0;
        int correctAnswers = 0;
        int wrongAnswers = 0;
        int answer = 0;
        char signType = '?';


        while (questionsCount != questionsNumber) {

            int x = 1 + randomNumber.nextInt(10);
            int y = 1 + randomNumber.nextInt(10);

            int sign = 1 + randomNumber.nextInt(5);

            switch (sign) {
                case 1 -> {
                    signType = '*';
                    answer = x * y;
                }
                case 2 -> {
                    signType = '/';
                    answer = x / y;
                }
                case 3 -> {
                    signType = '-';
                    answer = x - y;
                }
                case 4 -> {
                    signType = '+';
                    answer = x + y;
                }
                default -> {
                }
            }
            System.out.println("What is " + x + signType + y + "?:");
            userAnswer = scanner.nextInt();

            questionsCount++;

            if (userAnswer == answer){
                correctAnswers++;
            }
            if (userAnswer != answer){
                wrongAnswers++;
            }
        }


        int result = correctAnswers - wrongAnswers;

        System.out.printf("You scored %d!", result );

}



}
