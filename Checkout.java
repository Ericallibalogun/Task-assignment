import java.util.Scanner;

public class Checkout{
	public static void main(String... ericalli){

	Scanner customerInput = new Scanner(System.in);
	
	System.out.print("Enter the cashier's name: ");
        String cashierName = customerInput.nextLine();

	System.out.println("What is the customer's Name? ");
	String customerName = customerInput.nextLine();

	System.out.println("_______________________________________________");
	System.out.println("SEMICOLON STORES");
	System.out.println("MAIN BRANCH");
	System.out.println("LOCATION: HERBERT MACAULY WAY, SABO YABA, LAGOS.");
	System.out.println("TEL: 03293828343");
	System.out.println("Date : 18-Dec-22  8 : 48 : 11 pm ");
	System.out.println("Cashier: " + cashierName); 
	System.out.println("Customer's Name: " + customerName);
	System.out.println("_______________________________________________");

        System.out.printf("%-15s %-5s %-10s %-10s\n", "ITEM", "QTY", "PRICE", "TOTAL (NGN)");


	double totalCost = 0;
	boolean addMore;

	do {
	System.out.println("What did the user buy? ");
	String customerPurchase = customerInput.nextLine();

	System.out.println("How many pieces? ");
	int quantity = customerInput.nextInt();

	System.out.println("How much per unit? ");
	double price = customerInput.nextDouble();

	double itemCost = quantity * price;
	totalCost += itemCost;

	
	 System.out.println("_______________________________________________");
	 System.out.printf("%-15s %-5d %-10.2f %-10.2f\n", customerPurchase, quantity, price, itemCost);
	
	customerInput.nextLine();

	System.out.println("_______________________________________________");
	System.out.println("Do you want to add more items? (yes/no) : ");
	String response = customerInput.nextLine();
	addMore = response.equalsIgnoreCase("yes");

	}while (addMore);

	double discount = totalCost * 0.08;
	double vat = totalCost * 0.175;
	double total = totalCost + vat - discount;

	System.out.println("_______________________________________________");
        System.out.printf("%-25s %-10.2f\n", "Total Cost:", totalCost);
        System.out.printf("%-25s %-10.2f\n", "Discount:", discount);
        System.out.printf("%-25s %-10.2f\n", "VAT @ 17.50%:", vat);
        System.out.printf("%-25s %-10.2f\n", "Total:", total);
	System.out.println("_______________________________________________");

	System.out.print("Input the amount paid:  ");
	double amountPaid = customerInput.nextDouble();
	double balance = amountPaid - total;
	System.out.println("_______________________________________________");


		
	System.out.printf("%-25s %-10.2f\n", "Amount Paid:", amountPaid);
        System.out.printf("%-25s %-10.2f\n", "Balance:", balance);

	System.out.println("_______________________________________________");
        System.out.println("THANK YOU FOR YOUR PATRONAGE");


    }
}