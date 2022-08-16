package deitelExercise.chapterTwo;

import java.util.Scanner;

public class NegativePositiveZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        System.out.println("Enter first Number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter second Number: ");
        int secondNumber = input.nextInt();

        System.out.println("Enter third Number: ");
        int thirdNumber = input.nextInt();

        System.out.println("Enter fourth Number: ");
        int fourthNumber = input.nextInt();

        System.out.println("Enter fifth Number: ");
        int fifthNumber = input.nextInt();

        if (firstNumber < 0){countNegative+=1;}
        else if (firstNumber == 0){countZero+=1;}
        else countPositive+=1;

        if (secondNumber < 0){countNegative+=1;}
        else if (secondNumber == 0){countZero+=1;}
        else countPositive+=1;

        if (thirdNumber < 0){countNegative+=1;}
        else if (thirdNumber ==0){countZero+=1;}
        else countPositive+=1;

        if (fourthNumber < 0){countNegative+=1;}
        else if (fourthNumber == 0){countZero+=1;}
        else countPositive+=1;

        if (fifthNumber < 0){countNegative+=1;}
        else if (fifthNumber == 0){countZero+=1;}
        else countPositive+=1;



        System.out.println("The number of positive numbers is: "+countPositive);
        System.out.println("The number of negative numbers is: "+countNegative);
        System.out.println("The number of zero is: "+countZero);
    }
}
