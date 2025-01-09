import java.util.Scanner;

public class Checkout{
	public static void main(String... ericalli){

	Scanner customerInput = new Scanner(System.in);

	System.out.println("What is the customer's Name? ");
	String customerName = customerInput.nextLine();

	System.out.print("Enter the cashier's name: ");
         String cashierName = customerInput.nextLine();

	double totalDiscount = 0;
	double totalCost = 0;
	boolean addMore;
	String receipt = "";

	do {
	System.out.print("What did the user buy?");
	String customerPurchase = customerInput.nextLine();

	System.out.print("How many pieces?");
	int quantity = customerInput.nextInt();

	System.out.print("How much per unit?");
	double price = customerInput.nextInt();

	double itemCost = quantity * price;

	System.out.print("How much discount are you applying(in percentage): ");
	double discountPercentage = customerInput.nextDouble();

	double discountValue = (discountPercentage / 100) * itemCost;
	totalCost += itemCost - discountValue;
	totalDiscount += discountValue;

	receipt += String.format("%-15s %-5d %-10.2f %-10.2f\n", customerPurchase,      	quantity, price, itemCost);

	customerInput.nextLine();

	System.out.print("Add more items?");
	String response = customerInput.nextLine();
	addMore = response.equalsIgnoreCase("yes");

	}while(addMore);
	double vat = totalCost * 0.175;
	double total = totalCost + vat;


	System.out.println("==============================================");
	System.out.println("SEMICOLON STORES ");
	System.out.println("MAIN BRANCH");
	System.out.println("LOCATION: HERBERT MACAULY WAY, SABO YABA, LAGOS.");
	System.out.println("TEL: 03293828343");
	System.out.println("Date : 18-Dec-22  8 : 48 : 11 pm ");
	System.out.println("Cashier: " + cashierName); 
	System.out.println("Customer's Name: " + customerName);
	System.out.println("_______________________________________________");

        System.out.printf("%-15s %-5s %-10s %-10s\n", "ITEM", "QTY", "PRICE", "TOTAL (NGN)");

	System.out.print(receipt);
	
        System.out.println("==============================================");

        System.out.printf("%-25s %-10.2f\n", "Total Cost:", totalCost);
        System.out.printf("%-25s %-10.2f\n", "Discount:", totalDiscount);
        System.out.printf("%-25s %-10.2f\n", "VAT @ 17.50%:", vat);
        System.out.printf("%-25s %-10.2f\n", "Total:", total);
        System.out.println("KINDLY MAKE PAYMENT");
        System.out.println("_______________________________________________");

        double amountPaid;
        do {
            System.out.print("\n\nInput the amount paid: ");
            amountPaid = customerInput.nextDouble();
            if (amountPaid < total) {
            System.out.println("Insufficient payment. Kindly pay the full amount.");
	  }

        } while (amountPaid < total);
		System.out.println("Payment received. Thank you!");

        	double balance = amountPaid - total; 

	System.out.println("\n==============================================");
	System.out.println("SEMICOLON STORES ");
	System.out.println("MAIN BRANCH");
	System.out.println("LOCATION: HERBERT MACAULY WAY, SABO YABA, LAGOS.");
	System.out.println("TEL: 03293828343");
	System.out.println("Date : 18-Dec-22  8 : 48 : 11 pm ");
	System.out.println("Cashier: " + cashierName); 
	System.out.println("Customer's Name: " + customerName);
	System.out.println("_______________________________________________");

	  System.out.printf("%-15s %-5s %-10s %-10s\n", "ITEM", "QTY", "PRICE", "TOTAL 	(NGN)");

	System.out.print(receipt);
	
        System.out.println("==============================================");

        System.out.printf("%-25s %-10.2f\n", "Total Cost:", totalCost);
        System.out.printf("%-25s %-10.2f\n", "Discount:", totalDiscount);
        System.out.printf("%-25s %-10.2f\n", "VAT @ 17.50%:", vat);
        System.out.printf("%-25s %-10.2f\n", "Total:", total);
        System.out.println("KINDLY MAKE PAYMENT");
        System.out.println("_______________________________________________");



       	System.out.println("===============================================");	
        System.out.printf("%-25s %-10.2f\n", "Amount Paid:", amountPaid);
        System.out.printf("%-25s %-10.2f\n", "Balance:", balance);
	
	 System.out.println("_______________________________________________");
          System.out.println("THANK YOU FOR YOUR PATRONAGE ");
	System.out.println("===============================================");
	
    
  }
}