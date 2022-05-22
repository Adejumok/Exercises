package ClassExcercises;

public class Array {
    public static void main(String[] args) {
        int[] babe = {10, 20, 33, -6, -7};
        int sum = 0;
        int maximum = babe[0];
        int minimum = babe[0];

        double average = 0.0;
        for (int i = 0; i < babe.length; i++) {
            sum += babe[i];

            if(babe[i] > maximum){
                maximum = babe[i];
            }
            if(babe[i] < minimum){
                minimum = babe[i];
            }

        }
        System.out.println("The sum is " + sum + " and the average is " + sum / babe.length);

        System.out.println("Maximum value is " + maximum + " and minimum value is " + minimum);
    }
}
