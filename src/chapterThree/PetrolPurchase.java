package chapterThree;

public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int purchaseQuantityLiter;
    private double pricePerLiter;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String petrolType, int purchaseQuantityLiter, double pricePerLiter, double percentageDiscount) {
        this.stationLocation = stationLocation;

        this.petrolType = petrolType;

        if (purchaseQuantityLiter > 0) ;
        this.purchaseQuantityLiter = purchaseQuantityLiter;

        if (pricePerLiter > 0.0) ;
        this.pricePerLiter = pricePerLiter;

        if (percentageDiscount > 0.0) ;
        this.percentageDiscount = percentageDiscount;
    }

    public double purchaseAmount(int purchaseQuantityLiter, double pricePerLiter, double percentageDiscount){
       double purchaseAmount = 0.0;

        purchaseAmount = (purchaseQuantityLiter * pricePerLiter) - percentageDiscount;


        return purchaseAmount;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public int getPurchaseQuantityLiter() {
        return purchaseQuantityLiter;
    }

    public void setPurchaseQuantityLiter(int purchaseQuantityLiter) {
        this.purchaseQuantityLiter = purchaseQuantityLiter;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
}






