import java.util.Scanner;

public class DivisibleBy3{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int number = input.nextInt();

		int secondNumber = number / 3;

		if (number == secondNumber ){ 
 		System.out.printf("%d == %d%n", number, secondNumber);
		}
	}
}