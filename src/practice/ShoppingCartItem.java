package practice;

public class ShoppingCartItem {
    private String itemName;
    private  double pricePerUnit;
    private int qty;

    public ShoppingCartItem(String itemName, double pricePerUnit, int qty) {
        this.itemName = itemName;
        this.pricePerUnit = pricePerUnit;
        this.qty = qty;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
