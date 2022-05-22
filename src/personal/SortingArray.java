package personal;

import java.util.Scanner;

public class SortingArray {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(6);
        int[] sorted = sortInteger(myIntegers);
        printArray(sorted);

    }

    public static int[] getIntegers(int numbers){
        System.out.println("Enter " + numbers + " integer values\r");
        int[] values = new int[numbers];

        for (int i = 0; i < values.length; i++){
            values[i] = input.nextInt();
        }
        return values;
    }

    public static void printArray(int[] values){
        for (int i=0; i < values.length; i++){
            System.out.println("Element " + i + " contains " + values[i]);
        }
    }

    public static int[] sortInteger(int[] values) {
        int[] sortedArray = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            sortedArray[i] = values[i];
        }
      boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;

                }
            }
        }return sortedArray;
    }

}
