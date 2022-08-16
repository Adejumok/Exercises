package deitelExercise.chapterSeven;

import java.util.Scanner;

public class DuplicateElimination {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int count = 0; count < array.length; count++) {
            array[count] = -1;
        }
        System.out.println("Enter ten numbers, each between 10 and 100, both inclusive: ");


        for (int count = 0; count < array.length; count++) {
            array[count] = input.nextInt();
        }

        eliminateDuplicate(array);
        for (int count = 0; count < array.length; count++) {
            System.out.println("The content in index " + (count) + " is " + array[count]);
        }

    }

    public static void eliminateDuplicate(int[] array) {


        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    System.out.println(array[j] + " is repeated, enter another number");
                    array[j] = input.nextInt();
                }
            }
        }

    }
}

