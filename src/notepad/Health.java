import java.util.Scanner;

public class Health{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double weightPounds = input.nextDouble();
 		
		System.out.print("Enter height in inches: ");
		double heightInches = input.nextDouble();

		double weightKg = weightPounds * 0.45359237;
		System.out.printf("Weight in kg is %f\n ", weightKg);

		double heightMeters = heightInches * 0.0254;
		System.out.printf("Height in meters is %f\n ", heightMeters);

		double BMI = weightKg / (heightMeters * heightMeters);
		
		System.out.printf("Body Mass Index is %.4f\n ", BMI);
	} 
} 
