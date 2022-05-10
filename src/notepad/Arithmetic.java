import java.util.Scanner;

public class Arithmetic{
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter firstNumber: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter secondNumber: ");
		int secondNumber = input.nextInt();

 		int sum = firstNumber + secondNumber;
		System.out.printf("Sum is %d%n", sum);

		int subtraction = firstNumber - secondNumber;
		System.out.printf("Subtraction is %d%n", subtraction);

		int multiplication = firstNumber * secondNumber;
		System.out.printf("Multiplication is %d%n", multiplication);

		int division = firstNumber / secondNumber;
		System.out.printf("Division is %d%n", division);


	}
		

}