package chapterThree;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile health = new HealthProfile();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.next();

        System.out.print("Enter last name: ");
        String lastName = input.next();

        System.out.print("Enter gender: ");
        String gender = input.next();

        System.out.print("Enter year of birth: ");
        int yearOfBirth = input.nextInt();

        System.out.print("Enter month of birth: ");
        int monthOfBirth = input.nextInt();

        System.out.print("Enter day of birth: ");
        int dayOfBirth = input.nextInt();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        //System.out.printf("%s maximum heart rate: %d%n", pride.getFirstName(), pride.maxHeartRate());
        //System.out.printf("%s target heart rate: %d%n", pride.getFirstName(), pride.targetHeartRate());
    }
}
