package chapterSix;

import java.util.Scanner;

public class HypotenuseCalculation {
//    Pseudocode
//    Define a hypotenuse method;
//        Provide two arguments of type double;
//        Calculate the hypotenuse using the lengths given;
//        return hypotenuse as a double;
//
//    Prepare an application (method main) that read values for side1 and side2;
//        It performs the calculation with the hypotenuse method;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two floating-point values seperated by spaces: ");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("The hypotenuse value is " + hypotenuse(firstNumber, secondNumber));

    }



    public static double hypotenuse(double a, double b){
        double hypotenuseValue = Math.hypot(a, b);

        return hypotenuseValue;
    }
}
