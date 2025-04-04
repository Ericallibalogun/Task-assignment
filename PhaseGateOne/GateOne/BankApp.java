package GateOne;
import java.util.*;

public class BankApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        System.out.println("Enter ur first name: ");
        String firstName = userInput.nextLine();

        System.out.println("Enter ur last name: ");
        String lastName = userInput.nextLine();

        System.out.println("Create your pin:");
        int pin = userInput.nextInt();

        Account account = new Account(firstName, lastName, pin);
        System.out.println("Account created successfully.");

        System.out.println("Enter the amount to withdraw: ");
        double amount = userInput.nextDouble();

        System.out.println("\nWelcome," + account.getFirstName);

    }
}
