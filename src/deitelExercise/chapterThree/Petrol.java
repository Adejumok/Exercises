package deitelExercise.chapterThree;

public class Petrol {

    public static void main(String[] args) {

        PetrolPurchase total = new PetrolPurchase("Badagry", "Premium", 50, 147.50, 10.00);


        System.out.printf("The station location is %s%n", total.getStationLocation());
        System.out.printf("The petrol type is %s%n", total.getPetrolType());
        System.out.printf("The quantity purchased per liter is %d%n", total.getPurchaseQuantityLiter());
        System.out.printf("The price per liter is $%.2f%n", total.getPricePerLiter());
        System.out.printf("The net purchase amount is $%.2f ", total.purchaseAmount());


    }
}
