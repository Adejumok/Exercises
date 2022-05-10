import java.util.Scanner;

public class InTempFiTemp{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number in initial temperature: ");
		double initialTemperature = input.nextDouble();
 		
		System.out.print("Enter a number in final temperature: ");
		double finalTemperature = input.nextDouble();

		System.out.print("Enter the amount of water in kilograms: ");
		double M = input.nextDouble();

		double Q = M * (finalTemperature - initialTemperature) * 4184;
		

		System.out.printf("The energy needed is %f ", Q);
	} 
} 
