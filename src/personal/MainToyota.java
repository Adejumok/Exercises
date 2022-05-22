package personal;

public class MainToyota {
    public static void main(String[] args) {
        Toyota toyota = new Toyota(26);
        toyota.steer(25);
        toyota.accelerate(25);
        toyota.accelerate(20);
    }
}
