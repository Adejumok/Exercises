package chapterThree;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        HeartRates health = new HeartRates("Jumoke", "Adeyinka", 9, 25, 1978);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = input.next();

        System.out.print("Enter Last Name: ");
        String lastName = input.next();

        System.out.print("Enter Date of Birth(in the format of month, day and year in numbers format seperated with space): ");
        int birthOfDate = input.nextInt();

        System.out.printf(firstName + " " + lastName + " is " + health.getAge() + " years old%n");
        System.out.printf("Maximum Heart Rate is " + health.maxHeartRate() +"%n");

        health.targetHeartRate();
    }
}
