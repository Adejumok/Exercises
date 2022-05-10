package chapterThree;

import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {
        Car toyota = new Car("Camry", "2018", 2_000_000.00);
        Car benz = new Car("Dolip", "2022", -1_500.00);

        System.out.printf("%s price: $%.2f%n", toyota.getModel(), toyota.getPrice());
        System.out.printf("%s price: $%.2f%n", benz.getModel(), benz.getPrice());

        Scanner input = new Scanner(System.in);

        System.out.print("Apply 5% discount on the price of toyota: ");
        double discountPrice = input.nextDouble();
        System.out.printf("%napplying %.2f to toyota price%n%n", discountPrice);
        toyota.discount(discountPrice);

        System.out.printf("%s price: $%.2f%n", toyota.getModel(), toyota.getPrice());
        System.out.printf("%s price: $%.2f%n", benz.getModel(), benz.getPrice());

        System.out.print("Apply 7% discount on the price of benz: ");
        discountPrice = input.nextDouble();
        System.out.printf("%napplying %.2f to benz price%n%n", discountPrice);
        benz.discount(discountPrice);

        System.out.printf("%s price: $%.2f%n", toyota.getModel(), toyota.getPrice());
        System.out.printf("%s price: $%.2f%n", benz.getModel(), benz.getPrice());

    }
}
