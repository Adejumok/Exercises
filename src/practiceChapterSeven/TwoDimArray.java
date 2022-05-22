package practiceChapterSeven;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6}};
        int[][] b = {{1,2}, {3}, {4,5,6}};

        System.out.println("Values in a by row are");
        outputArray(a);

        System.out.printf("%nValues in b by row are%n");
        outputArray(b);
    }

    private static void outputArray(int[][] array) {
        int sum = 0;
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                sum += array[row][column];
                System.out.printf("%d   ", array[row][column]);
            }
            System.out.println();
        }
        System.out.printf("The sum is " + sum);
    }
}
