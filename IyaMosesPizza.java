
import java.util.Scanner;

	public class IyaMosesPizza{
	public static void main(String ... ericalli){
	
	int sapaSizePrices = 2500 , sapaSizeSlices = 4;
	int smallMoneyPrices = 2900 , smallMoneySlices = 6;
	int bigBoysPrices = 4000 , bigBoysSlices = 8;
	int odogwuPrices = 5200 , odogwuSlices = 12;
	
			
	System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
	System.out.println("          WELCOME TO IYA MOSES PIZZA JOINT");
	System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");


	Scanner userInput = new Scanner(System.in);
	
	System.out.println("How many number of people are attending your party? ");
	int noOfGuests = userInput.nextInt();
			
			System.out.println("""
	What type of pizza would you like to buy:
		1. Sapa size
		2. Small Money
		3. Big Boys
		4. Odogwu	
	""");
	System.out.print("Kindly enter your choice  (1-4) : ");
	int pizzaChoice = userInput.nextInt();

	int pricePerBox = 0 , slicesPerBox = 0;
	String pizzaType = " ";
	switch(pizzaChoice) {
		case 1 -> {
			pizzaType = "Sapa size";
			pricePerBox = sapaSizePrices;
			slicesPerBox = sapaSizeSlices;
		}
		case 2 ->{
			pizzaType = "Small money";
			pricePerBox = smallMoneyPrices;
			slicesPerBox = smallMoneySlices;
		}
		case 3 ->{
			pizzaType = "Big boys";
			pricePerBox = bigBoysPrices;
			slicesPerBox = bigBoysSlices;
		}
		case 4 ->{
			pizzaType = "Odogwu";
			pricePerBox = odogwuPrices;
			slicesPerBox = odogwuSlices;
		}
		default ->{
			System.out.println("We could not find a match for your search,try using another keyword....");
			return;
		}
	}

	int totalBoxes = (int) Math.ceil((double) noOfGuests / slicesPerBox);
	int totalSlices = totalBoxes  * slicesPerBox;
	int leftover = totalSlices - noOfGuests;
	
	int totalPrice = totalBoxes  *  pricePerBox;


	System.out.println("____________________::::::::::::::_____________________");
	System.out.println("Order summary:");
        System.out.println("Pizza Type: " + pizzaType);
        System.out.println("Number of Guests: " + noOfGuests);
        System.out.println("Boxes Needed : " + totalBoxes);
	System.out.println("Total Slices; " + totalSlices);
	System.out.println("Leftovers: " + leftover);
	System.out.println("Total price is: " + totalPrice);
	System.out.println("____________________::::::::::::::_____________________");


}
}