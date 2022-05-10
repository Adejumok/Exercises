import java.util.Scanner;

public class NumberSquare{
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter firstNumber: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter secondNumber: ");
		int secondNumber = input.nextInt();

 		int squareFirstNumber = firstNumber * firstNumber;
		System.out.printf("SquareOne is %d%n", squareFirstNumber);

		int squareSecondNumber = secondNumber * secondNumber;
		System.out.printf("SquareTwo is %d%n", squareSecondNumber);

		int sumSquare = squareFirstNumber + squareSecondNumber;
		System.out.printf("Sum is %d%n", sumSquare);

		int diffSquare = squareFirstNumber - squareSecondNumber;
		System.out.printf("Difference is %d%n", diffSquare);


	}
		

}