package personal;

public class SquareLoop {
    public static void main(String[] args) {

        for (int row = 0; row < 6; row++) {
            for (int column = 0; column < 6; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
