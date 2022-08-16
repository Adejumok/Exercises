package deitelExercise.chapterTwo;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight in kilograms: ");
        double weightInKilograms = input.nextDouble();

        System.out.print("Enter the height in meters: ");
        double heightInMeters = input.nextDouble();

        double BMI = weightInKilograms / (heightInMeters * heightInMeters);
        if(BMI < 18.5){
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Healthy Weight");
        }else if(BMI >= 25 && BMI <= 29.9){
            System.out.println("Overweight");
        }else {
            System.out.printf("Obese");
        }




    }
}
