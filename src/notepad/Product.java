// Product.java
// Calculate the product of three integers.
import java.util.Scanner; // program uses Scanner

public class Product{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: 10"); // prompt for input
		int x = input.nextInt(); // read first integer

		System.out.print("Enter second integer: 20"); //prompt for input
		int y = input.nextInt(); // read second integer
		
		System.out.print("Enter third integer: 30"); // prompt for input
		int z = input.nextInt(); // read third integer

		int result = x * y * z; // calculate product of numbers

		System.out.printf("Product is %d%n", result);
	} // end method main
} // end class Product

	