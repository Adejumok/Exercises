package deitelExercise.chapterThree;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;

        if (price > 0.0) {
            this.price = price;
        }

    }

    public void discount(double discountPrice){
        if (discountPrice > 0.0){
            price = price * discountPrice;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }



}

