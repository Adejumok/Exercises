package deitelExercise.chapterThree;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile health = new HealthProfile("Parp", "Joyce", "Male", 02, 13, 1997, 50, 95.5);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.next();

        System.out.print("Enter last name: ");
        String lastName = input.next();

        System.out.print("Enter gender: ");
        String gender = input.next();

        System.out.print("Enter Date of birth(represented in numbers starting with month, day then year all seperated with spaces): ");
        int dateOfBirth = input.nextInt();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.println(firstName + " " + lastName + " is a " + gender + " who is " + health.getAge() + " years");
        System.out.println("Maximum Heart Rate is " + health.maxHeartRate());
        health.targetHeartRate();
        health.bmi();
    }
}
