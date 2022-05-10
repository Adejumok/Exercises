import java.util.Scanner;

public class Addition{
	public static void main(String[] args){
	Scanner input = new Scanner(Sytem.in);
	
	System.out.print("Enter firstNumber: ");
	int firstNumber = input.nextIn();

	System.out.print("Enter secondNumber: ");
	int secondNumber = input.nextIn();

	int sum = firstNumber + secondNumber;
	
	System.out.printf("Sum is %d%n", sum);
	}
}