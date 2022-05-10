import java.util.Scanner;

public class FutureInvestment{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double investmentAmount= input.nextDouble();
 		
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();

		System.out.print("Enter number of years: ");
		double numberOfYears = input.nextDouble();

		double monthlyInterestRate = annualInterestRate / (1200.0530847);
		
		double futureInvestmentValue = investmentAmount * (Math.pow (1 + monthlyInterestRate, (numberOfYears * 12)));

		System.out.printf("Accumulated value is $%.2f ", futureInvestmentValue);
	} 
} 
