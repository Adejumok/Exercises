package ClassExercises;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter score: ");
        int score = input.nextInt();

        if (score >= 90 && score < 100) {
            System.out.println("A");
        }
        if (score >= 80 && score < 90) {
            System.out.println("B");
        }
        if (score >= 70 && score < 80) {
            System.out.println("C");
        }
        if (score >= 60 && score < 70) {
            System.out.println("D");
        }
        if (score < 60) {
            System.out.println("F");
        }
    }
}
