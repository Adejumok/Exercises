package notepad;

import java.util.Scanner;

public class LargeSmall1{
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int largestNumber = 0;

		int smallestNumber = 1_000_000_000;

		System.out.print("Enter firstNumber: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter secondNumber: ");
		int secondNumber = input.nextInt();

		System.out.print("Enter thirdNumber: ");
		int thirdNumber = input.nextInt();

		System.out.print("Enter fourthNumber: ");
		int fourthNumber = input.nextInt();

		System.out.print("Enter fifthNumber: ");
		int fifthNumber = input.nextInt();


		if (firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber && firstNumber > fifthNumber){largestNumber = firstNumber;}

		else if (secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > fourthNumber && secondNumber > fifthNumber){largestNumber = secondNumber;}

		else if (thirdNumber > firstNumber && thirdNumber > secondNumber && thirdNumber > fourthNumber && thirdNumber > fifthNumber){largestNumber = thirdNumber;}

		else if (fourthNumber > firstNumber && fourthNumber > secondNumber && fourthNumber > thirdNumber && fourthNumber > fifthNumber){largestNumber = fourthNumber;}

		else if (fifthNumber > firstNumber && fifthNumber > secondNumber && fifthNumber > thirdNumber && fifthNumber > fourthNumber){largestNumber = fifthNumber;}

		if (firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < fourthNumber && firstNumber < fifthNumber){smallestNumber = firstNumber;}

		else if (secondNumber < firstNumber && secondNumber < thirdNumber && secondNumber < fourthNumber && secondNumber < fifthNumber){smallestNumber = secondNumber;}

		else if (thirdNumber < firstNumber && thirdNumber < secondNumber && thirdNumber < fourthNumber && thirdNumber < fifthNumber){smallestNumber = thirdNumber;}

		else if (fourthNumber < firstNumber && fourthNumber < secondNumber && fourthNumber < thirdNumber && fourthNumber < fifthNumber){smallestNumber = fourthNumber;}
		
		else if (fifthNumber < firstNumber && fifthNumber < secondNumber && fifthNumber < thirdNumber && fifthNumber < fourthNumber){smallestNumber = fifthNumber;}


		System.out.println("SmallestNumber is " + smallestNumber);
		System.out.printf("LargestNumber is " + largestNumber);



	}
		

}