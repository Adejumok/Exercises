package practice;

import java.util.Objects;
import java.util.Scanner;

public class ShoppingMain {
    public static void main(String[] args) {
        String userInput = "";
        Scanner scanner = new Scanner(System.in);
        String customerName = "";
        ShoppingCart cart = new ShoppingCart();
        do {
            System.out.println("Enter customer name: ");
            customerName = scanner.next();
            System.out.println("Enter item name: ");
            String itemName = scanner.next();
            System.out.println("Enter price per unit name: ");
            double pricePerUnit = scanner.nextDouble();
            System.out.println("Enter quantity: ");
            int qty = scanner.nextInt();
            System.out.println("Do you want to add a new item, enter yes otherwise enter no: ");
            userInput = scanner.next();

            ShoppingCartItem item = new ShoppingCartItem(
                    itemName,
                    pricePerUnit,
                    qty
            );

            cart.addItem(item);

        }while (!Objects.equals(userInput, "no"));
    }
}
