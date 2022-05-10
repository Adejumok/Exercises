package personal;

public class AirConditionerTest {
    public static void main(String[] args) {
        AirConditioner sony = new AirConditioner();
        AirConditioner thermostat = new AirConditioner();
        sony.setProductName("Jum");
        System.out.println("Product Name is " + sony.getProductName());

    }
}
