package practice;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<ShoppingCartItem>totalItems;

    public ShoppingCart(){
        totalItems = new ArrayList<>();
    }

    public void addItem(ShoppingCartItem newItem){
        totalItems.add(newItem);
    }

    public ArrayList<ShoppingCartItem> getTotalItems() {
        return totalItems;
    }

    public double calculateSubTotal(){
        double subTotal = 0.0;
        for (ShoppingCartItem item : totalItems){
            double itemPrice = item.getPricePerUnit() * item.getQty();
            subTotal += itemPrice;
        }
        return subTotal;
    }

    public double discount(double percentageDiscount){
        double total = calculateSubTotal();
        double discountAmount = (percentageDiscount * total) / 100;
        return discountAmount;
    }

    public double vat(){
        double vatPercentage = 7.5/100;
        double total = calculateSubTotal();
        return vatPercentage * total;
    }


}
