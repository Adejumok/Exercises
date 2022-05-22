package notepad;

import java.util.Scanner;

public class Addition{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter firstNumber: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter secondNumber: ");
	int secondNumber = input.nextInt();

	int sum = firstNumber + secondNumber;
	
	System.out.printf("Sum is %d%n", sum);
	}
}