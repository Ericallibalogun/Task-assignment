import java.util.Scanner;

public class ExpenseTrackers {
    String[] dates = new String[100];
    String[] descriptions = new String[100];
    double[] amounts = new double[100];
    int expenseCount = 0; 
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayWelcome();

    while (true) {
            displayMenu();
            int choice = getChoice();
            handleChoice(choice);
        }
    }


    public static void displayWelcome(){
	System.out.println(">>>>>>>>Welcome to Expense Tracker App<<<<<<<<")
}





















   }
}