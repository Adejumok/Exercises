package ClassExercises;

import java.util.Random;

public class Random5Questions {

//    Pseudocode
//    Generate random math questions;
//    Indicate that it should be asked five times;
//        If the first number is lesser than the second number, swap it with the second;
//        Prompt the user to answer;
//
//        Check the answer;
//        Display the number of correct responses and the number of wrong responses;
//        Display the response result as "Correct responses minus Wrong responses";

    static Random randomGenerator = new Random();
    static String operators = "+-*/()";

    public  static char getRandomOperator(){
        return operators.charAt(randomGenerator.nextInt(operators.length()));
    }

    public static int getRandomNumber(){
        return randomGenerator.nextInt(100);
    }

    public static String createEquation(){
        String equation = "";
        int numOfOperators = 2;
        char operator = ' ';

        for (int i = 0; i < numOfOperators; i++){
            equation += getRandomNumber();
            equation += getRandomOperator();
        }
        equation += getRandomNumber();
        return equation;
    }

    public static void main(String[] args) {
        String equation = createEquation();
        System.out.println("What is " + equation + "?");




}



}
