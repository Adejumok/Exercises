package ClassExercises;

import java.util.Scanner;

public class UberApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0){System.out.println("Is an even number");
        }
        if (number % 2 != 0){
            System.out.println("Is an odd number");
        }
    }
}
