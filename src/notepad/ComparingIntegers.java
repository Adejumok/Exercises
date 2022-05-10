import java.util.Scanner;

public class ComparingIntegers{
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = input.nextInt();

		int squareNumber = number * number;
		System.out.printf("Square is %d%n", squareNumber);

		if (number > 100){
			System.out.printf("%d > %d%n", number, 100);
		}

		if (number == 100){
			System.out.printf("%d == %d%n", number, 100);
		}

		if (number != 100){
			System.out.printf("%d != %d%n", number, 100);
		}

		if (number < 100){
			System.out.printf("%d < %d%n", number, 100);
		}
	
		if (squareNumber > 100){
			System.out.printf("%d > %d%n", squareNumber, 100);
		}

		if (squareNumber == 100){
			System.out.printf("%d == %d%n", squareNumber, 100);
		}

		if (squareNumber != 100){
			System.out.printf("%d != %d%n", squareNumber, 100);
		}

		if (squareNumber < 100){
			System.out.printf("%d < %d%n", squareNumber, 100);
		}


	}
}

	