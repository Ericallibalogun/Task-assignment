import java.util.Scanner;

public class IyaMatthewPizza {
    public static void main(String... ericalli) {
        // Define the prices and slices per box for each pizza type
        final int SAPA_SIZE_SLICES = 6;
        final int SMALL_MONEY_SLICES = 8;
        final int BIG_BOYS_SLICES = 10;
        final int ODOGWU_SLICES = 12;

        final int SAPA_SIZE_PRICE = 2500;
        final int SMALL_MONEY_PRICE = 2900;
        final int BIG_BOYS_PRICE = 4000;
        final int ODOGWU_PRICE = 5200;

        System.out.println("__________________________________________________");
        System.out.println("\n\nWELCOME TO IYA MOSES PIZZA JOINT");

        Scanner userInput = new Scanner(System.in);

        // Get the number of guests
        System.out.println("How many people are attending the birthday party?");
        int numberOfGuests = userInput.nextInt();

        // Get the pizza type
        System.out.println("What type of pizza would you like to buy? (sapaSize, smallMoney, bigBoys, odogwu): ");
        String pizzaType = userInput.next();

        // Variables for slices per box and price per box
        int slicesPerBox = 0;
        int pricePerBox = 0;

        // Determine slices per box and price per box based on pizza type
        switch (pizzaType.toLowerCase()) {
            case "sapasize":
                slicesPerBox = SAPA_SIZE_SLICES;
                pricePerBox = SAPA_SIZE_PRICE;
                break;
            case "smallmoney":
                slicesPerBox = SMALL_MONEY_SLICES;
                pricePerBox = SMALL_MONEY_PRICE;
                break;
            case "bigboys":
                slicesPerBox = BIG_BOYS_SLICES;
                pricePerBox = BIG_BOYS_PRICE;
                break;
            case "odogwu":
                slicesPerBox = ODOGWU_SLICES;
                pricePerBox = ODOGWU_PRICE;
                break;
            default:
                System.out.println("Invalid pizza type. Exiting program.");
                return; // Exit the program for invalid pizza type
        }

        // Calculate the number of boxes needed and leftover slices
        int totalSlicesNeeded = numberOfGuests;
        int boxesNeeded = (int) Math.ceil((double) totalSlicesNeeded / slicesPerBox);
        int totalSlicesAvailable = boxesNeeded * slicesPerBox;
        int leftoverSlices = totalSlicesAvailable - totalSlicesNeeded;

        // Calculate the total price
        int totalPrice = boxesNeeded * pricePerBox;

        // Display the summary
        System.out.println("__________________________________________________");
        System.out.println("Order Summary:");
        System.out.println("Number of boxes of pizza to buy: " + boxesNeeded + " box(es)");
        System.out.println("Number of leftover slices after serving: " + leftoverSlices + " slice(s)");
        System.out.println("Total price: " + totalPrice);

        userInput.close(); // Close the scanner to avoid resource leaks
    }
}
