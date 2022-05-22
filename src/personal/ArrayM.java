package personal;

public class ArrayM {
    public static void main(String[] args) {

        int[] jum = new int[6];

        for (int column = 0; column < jum.length; column++){
            jum[column] = 4 + 3 * column;
        }
        System.out.printf("%s%6s%n", "Index", "Value");

        for (int column = 0; column < jum.length; column++) {
            System.out.printf("%5d%6d%n", column, jum[column]);
        }
    }
}
