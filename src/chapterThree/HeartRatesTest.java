package chapterThree;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        HeartRates pride = new HeartRates();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.next();

        System.out.print("Enter last name: ");
        String lastName = input.next();

        System.out.print("Enter year of birth: ");
        int yearOfBirth = input.nextInt();

        System.out.print("Enter month of birth: ");
        int monthOfBirth = input.nextInt();

        System.out.print("Enter day of birth: ");
        int dayOfBirth = input.nextInt();

        //System.out.printf("%s maximum heart rate: %d%n", pride.getFirstName(), pride.maxHeartRate());
        //System.out.printf("%s target heart rate: %d%n", pride.getFirstName(), pride.targetHeartRate());
    }
}
