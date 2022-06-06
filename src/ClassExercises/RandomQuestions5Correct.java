package ClassExercises;

import java.util.Random;
import java.util.Scanner;

public class RandomQuestions5Correct {
    public static void main(String[] args) {
        System.out.println("The program ends when you get five questions correctly.");

        Scanner input = new Scanner(System.in);

        Random random = new Random();

        int correctResponse = 0;
        int response = 0;
        int answer = 0;
        char signT = ' ';

        while (correctResponse != 5) {
            int l = 1 + random.nextInt(10);
            int m = 1 + random.nextInt(10);
            int sign = 1 + random.nextInt(4);

            switch (sign) {
                case 1 -> {
                    signT = '+';
                    answer = l + m;
                }
                case 2 -> {
                    signT = '-';
                    answer = l - m;
                }
                case 3 -> {
                    signT = '/';
                    answer = l / m;
                }
                case 4 -> {
                    signT = '*';
                    answer = l * m;
                }
                default -> {

                }
            }

            System.out.printf("What is %d %s %d?:", l, signT, m);
            response = input.nextInt();

            if (response == answer) {
                correctResponse++;
            }

        }


        System.out.print("Awesome! You're a genus.");

    }
}
