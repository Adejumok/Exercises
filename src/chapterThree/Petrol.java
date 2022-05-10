package chapterThree;

import java.util.Scanner;

public class Petrol {

    public static void main(String[] args) {

        PetrolPurchase total = new PetrolPurchase("Badagry", "Premium", 50, 147.50, 10.00);


        System.out.println(total.getStationLocation());
        System.out.println(total.getPetrolType());
        System.out.println(total.getPurchaseQuantityLiter());
        System.out.println(total.getPricePerLiter());
        double result = total.purchaseAmount(50, 147.50, 10.0);
        System.out.printf("The net purchase amount is $%.2f ", result);


    }
}
