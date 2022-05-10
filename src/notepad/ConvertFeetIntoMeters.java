// ConvertFeetIntoMeters.java
// Convert a number in feet into meters.
import java.util.Scanner; // program uses Scanner

public class ConvertFeetIntoMeters {
	public static void main(String[] args){
		// convert feet to meter (double feet)
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
 
		double meter = feet * 0.305;

		System.out.printf("%f feet is %f Meters", feet, meter);
	} // end method main
} // end class ConvertFeetIntoMeters
