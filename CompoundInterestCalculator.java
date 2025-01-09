import java.util.Scanner;
	public class CompoundInterestCalculator{
	public static void main(String... ericalli){

	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Initial Investment");
	System.out.print("Amount of money that you have available to invest initially:  ");
	double initial = userInput.nextDouble();

	System.out.println("Monthly Contribution");
	System.out.print("Amount that you plan to add to the principal every month or withdraw:  ");
	double contribution = userInput.nextDouble();

	System.out.println("Length of Time in Years");
	System.out.print("Length of time in years that you plan to save:  ");
	int duration = userInput.nextInt();
	
	System.out.println("Estimated Interest Rate");
	System.out.print("Your estimated annual interest rate:  ");
	double interestRate = userInput.nextDouble();

	System.out.println("Interest Rate Variance Range");
	System.out.print("Range of interest rate that you desire to see results for:  ");
	double variance = userInput.nextDouble();
	
	double baseRate = interestRate - variance;
	int totalMonths = duration * 12;

	

	System.out.println("\nCompound Interest Calculation");
        System.out.println("================================-");
        System.out.printf("Final Amount after %d years: %.2f\n", duration, finalAmount);
        System.out.println("------------------------------------------------");

		while (baseRate <= interestRate + variance ) {
		double monthlyRate = baseRate / 100 / 12;

	finalAmount = 0;

	double finalAmount = initial * Math.pow(1 + monthlyRate, totalMonths) +
        contribution * (Math.pow(1 + monthlyRate, totalMonths) - 1) / monthlyRate;
	
	System.out.printf("%-20.2f %-20.2f\n", baseRate, finalAmount);

	baseRate += 0.5;
	}

	 System.out.println("================================-");


    }
}