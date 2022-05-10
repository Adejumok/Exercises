// PoundsToKg.java
// Convert a number in pounds into kilograms.
import java.util.Scanner; // program uses Scanner

public class PoundsToKg {
	public static void main(String[] args){
		// convert pounds to kg (double pounds)
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
 
		double kg = pounds * 0.454;

		System.out.printf("%f pounds is %f kg", pounds, kg);
	} // end method main
} // end class PoundsToKg
