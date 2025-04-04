import java.util.Scanner;

public class ExpenseTracker {
    public static String[] dates = new String[100];
    public static String[] descriptions = new String[100];
    public static double[] amounts = new double[100];
    public static int expenseCount = 0; 
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        displayWelcome();
        
        while (true) {
            displayMenu();
            int choice = getChoice();
            handleChoice(choice);
        }
    }


    public static void displayWelcome() {
        System.out.println("Welcome to Expense Tracker!\n");
    }

    public static void displayMenu() {
        System.out.println("1. Add Expense");
        System.out.println("2. View Expenses");
        System.out.println("3. Show Total");
        System.out.println("4. Exit");
    }

    public static int getChoice() {
        System.out.print("Choose an option: ");
        return userInput.nextInt();
    }

    public static void handleChoice(int choice) {
        userInput.nextLine();
        
        switch (choice) {
            case 1 -> addExpense();
            case 2 -> viewExpenses();
            case 3 -> showTotal();
            case 4 -> exitProgram();
            default -> System.out.println("Invalid choice. Try again.\n");
        }
    }

    public static void addExpense() {
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = userInput.nextLine();

        System.out.print("Enter description: ");
        String description = userInput.nextLine();

	double amount;
	while (true){
        System.out.print("Enter amount: $");
        amount = userInput.nextDouble();
	userInput.nextLine();
	
	
	if(amount < 0){
	System.out.println("Invalid amount..Please try again!!!!");
	}else {
	   break;
   }
}

    
        dates[expenseCount] = date;
        descriptions[expenseCount] = description;
        amounts[expenseCount] = amount;
        expenseCount++; 

        System.out.println("Expense added!\n");
    }

   public static void viewExpenses() {
        System.out.println("\nAll Expenses:");
        for (int count = 0; count < expenseCount; count++) {
            System.out.println("Expense " + (count + 1) + ":");
            System.out.println("  Date: " + dates[count]);
            System.out.println("  Description: " + descriptions[count]);
            System.out.printf("  Amount: $%.2f%n", amounts[count]);
            System.out.println("---------------------");
        }
    }

    public static void showTotal() {
        double total = 0;
        for (int count = 0; count < expenseCount; count++) {
            total += amounts[count];
        }
        System.out.printf("\nTotal Expenses: $%.2f%n%n", total);
    }

    public static void exitProgram() {
        System.out.println("Exiting the app. Goodbye!");
        System.exit(0);
    }
}