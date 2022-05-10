import java.util.Scanner;

public class FinancialCompound{

	public static void main(String[] args){
		 
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the monthly saving amount: ");
		double monthlySavings = input.nextDouble();
		double monthlyInterestRate = 0.05/12;
 		
		double accountValue = accountValue(monthlySavings, monthlyInterestRate, 6);
		
		System.out.printf("After the sixth month, the account value is $%.2f\n ", accountValue);
	} 


		private static double accountValue(double savings, double rate, int months){double account = 0.0;
		for (int i = 0; i < months; i++){
			account = (account + savings) * (1 + rate);
		}
		return account;
	
	} 

} 
