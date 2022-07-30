package ShoppingCart;

import java.util.Arrays;
import java.util.Scanner;

public class ShoppingCartMain {
    private static Scanner input=new Scanner(System.in);
    private static Item item =new Item("Item");
    private static class Customer{

        private String name;
        private Item[] items;

        private Item[] getItems(){
            return items;
        }
        public Customer(String name) {
            this.name = name;
        }

        private void addItem(Item itemName){
            for (int i = 0; i < items.length; i++) {
                if (items[i]==null){
                    items[i]=itemName;
                    break;
                }
            }
        }

        private void addItems(Item[] item1){
            Item item;
            for (int i = 0; i < items.length; i++) {
                item=new Item(item1[i].getName());
                addItem(item);
            }
        }

        private String getItemName(Item itemName){
            for (Item item : items) {
                if (item == itemName) {
                    return item.getName();
                }
            }
            return null;
        }

        private Item getItem(int index){
            return items[index];
        }

    }
    private static class Item{
        private String name;
        private double price;
        private int quantity;

        public Item(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private double getPrice() {
            return price;
        }

        private void setPrice(double price) {
            this.price = price;
        }

        private int getQuantity() {
            return quantity;
        }

        private void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        @Override
        public String toString(){
            return String.format("""
                    Item: %s
                    Price: %f
                    Quantity: %d
                    """,name,price,quantity);
        }

    }

    public static void main(String[] args) {
        System.out.println("What is customer's name? ");
        String customerName = input.nextLine();
        Customer customer=new Customer(customerName);


        String moreItems;
        do {
            System.out.println("What did the user buy? ");
            String itemPurchased = input.nextLine();
            item=new Item(itemPurchased);
            customer.addItem(item);

            System.out.println("How many pieces? ");
            int quantity = input.nextInt();
            item.setQuantity(quantity);

            System.out.println("How much per unit? ");
            double price = input.nextDouble();
            item.setPrice(price);

            System.out.println("Add more items? ");
            moreItems = input.nextLine();
        } while (moreItems.equalsIgnoreCase("yes"));

        System.out.println("What is your name? ");
        String cashierName=input.nextLine();
        System.out.println("How much discount will he get? ");
        double discount=input.nextDouble();

        System.out.println(Arrays.toString(customer.getItems()));
    }
}
