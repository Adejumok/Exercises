package ClassExercises;

import java.util.Scanner;

public class ZubaApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number > 55){
            System.out.println("Pass");
        }

        if (number < 55){
            System.out.println("Fail");
        }
    }

}
