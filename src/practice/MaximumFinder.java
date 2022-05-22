package practice;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter four floating-point values seperated by spaces: ");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();
        double fourthNumber = input.nextDouble();

        double result = maximum(firstNumber, secondNumber, thirdNumber, fourthNumber);

        System.out.println("Maximum number is " + result);
    }

    private static double maximum(double w, double x, double y, double z) {
//        double maximumValue = x;
//
//        if(y > maximumValue){
//            maximumValue = y;
//        }
//        if (z > maximumValue){
//            maximumValue = z;
//        }

        double maximumValue =Math.max(w, Math.max(x, Math.max(y, z)));

        return maximumValue;
    }
}
