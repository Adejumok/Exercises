package deitelExercise.chapterTwo;

import java.util.Scanner;

public class GreatPyramidOfGiza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the estimated number of stones used: ");
        double numberOfStones = input.nextDouble();

        System.out.println("Enter the average weight of each stone: ");
        double averageStoneWeight = input.nextDouble();

        System.out.println("Enter the number of years taken to build the pyramid: ");
        int years = input.nextInt();

        double priceByWeight = numberOfStones / averageStoneWeight;
        System.out.printf("The price by weight is $%.2f%n ", priceByWeight);

        double pricePerYear = priceByWeight / years;
        System.out.printf("The price by weight each year is $%.2f%n ", pricePerYear);

        double pricePerHour = pricePerYear / (365 * 24);
        System.out.printf("The price by weight each hour is $%.2f%n ", pricePerHour);

        double pricePerMinute = pricePerHour / 60;
        System.out.printf("The price by weight each minute is $%.2f%n ", pricePerMinute);

    }
}
