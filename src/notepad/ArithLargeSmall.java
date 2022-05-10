import java.util.Scanner;

public class ArithLargeSmall{
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int largestNumber = 0;

		int smallestNumber = 1000;

		System.out.print("Enter firstNumber: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter secondNumber: ");
		int secondNumber = input.nextInt();

		System.out.print("Enter thirdNumber: ");
		int thirdNumber = input.nextInt();

 		int sum = firstNumber + secondNumber + thirdNumber;
		System.out.printf("Sum is %d%n", sum);

		int product = firstNumber * secondNumber * thirdNumber;
		System.out.printf("Product is %d%n", product);

		int average = sum / 3;
		System.out.printf("Average is %d%n", average);

		if (firstNumber > secondNumber && firstNumber > thirdNumber){largestNumber = firstNumber;}

		else if (secondNumber > firstNumber && secondNumber > thirdNumber){largestNumber = secondNumber;}

		else if (thirdNumber > firstNumber && thirdNumber > secondNumber){largestNumber = thirdNumber;}

		if (firstNumber < secondNumber && firstNumber < thirdNumber){smallestNumber = firstNumber;}

		else if (secondNumber < firstNumber && secondNumber < thirdNumber){smallestNumber = secondNumber;}

		else if (thirdNumber < firstNumber && thirdNumber < secondNumber){smallestNumber = thirdNumber;}

		System.out.println("SmallestNumber is " + smallestNumber);
		System.out.printf("LargestNumber is " + largestNumber);



	}
		

}