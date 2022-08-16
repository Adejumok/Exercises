package deitelExercise.chapterTwo;

import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter world population: ");
        double currentPopulation = input.nextDouble();

        System.out.println("Enter annual world population growth rate: ");
        double growthRate = input.nextDouble();

        double estimatedPopulation = currentPopulation * (Math.pow(1 + (growthRate / 100), 5));
        System.out.printf("Estimated Population after five years is %.1fbillion", estimatedPopulation);
    }
}
