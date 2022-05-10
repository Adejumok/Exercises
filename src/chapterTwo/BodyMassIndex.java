package chapterTwo;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight in kilograms: ");
        double weightInKilograms = input.nextDouble();

        System.out.print("Enter the height in meters: ");
        double heightInMeters = input.nextDouble();

        double BMI = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.printf("Body Mass Index is %.2f", BMI);




    }
}
