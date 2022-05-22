package practice;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {

//      Generate two single-digit integers into number1 and number2.
//           If number1 < number2, swap number1 with number2.
//           Prompt the student to answer, "What is number1 − number2?"
//           Check the student’s answer and display whether the answer is correct

        Scanner input = new Scanner(System.in);

        int firstNumber = (int)(Math.random() * 10);
        int secondNumber = (int)(Math.random() * 10);

        if(firstNumber < secondNumber){
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }

        System.out.println("What is " + firstNumber + "-" + secondNumber + "?");
        int result = input.nextInt();

        if(firstNumber - secondNumber == result) {
            System.out.println("You are correct");
        }
        else {
            System.out.println("You are wrong");
            System.out.println("The correct answer should be " + (firstNumber - secondNumber));
        }

    }
}
