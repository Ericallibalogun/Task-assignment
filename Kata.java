import java.util.Scanner;

public class Kata {

	public static void main(String... ericalli){

	Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number");
		int even = userInput.nextInt();
		if(even % 2 == 0) System.out.println("It is an even number");
		else {
		System.out.println("It is an odd number");
		}

	System.out.println("Enter a number");
	int prime = userInput.nextInt();
	if(prime % prime == 0) System.out.println("It is a prime number");
	else {
	System.out.println("It is not a prime number");
	}

	System.out.println("Enter a number");
	int first = userInput.nextInt();
	System.out.println("Enter a number");
	int second = userInput.nextInt();

	int difference = first - second;
	if(difference < 0) {
	System.out.println("The difference is " + Math.abs(difference));
		difference = -difference;
	} else
	System.out.println("The difference is " + difference);

	System.out.println("Enter an integer");
	float firstQuotient = userInput.nextFloat();
	System.out.println("Enter an integer");
	float secondQuotient = userInput.nextFloat();

	float quotient = 0;
	if(secondQuotient == 0) {
		quotient = 0;
	System.out.println("The quotient is " + quotient);	
	} else {
	quotient = firstQuotient / secondQuotient;
	System.out.println("The quotient is " + quotient);	
	}
	
	System.out.println("Enter an integer");
	int factor = userInput.nextInt();
	int factors = factor;
	System.out.println("The factor of "+factor+" is");
	while(factors > 0){
		if(factor % factors == 0){
	System.out.println(factors);
	}
	factors--;
	}
	

	System.out.println("Enter a number");
	int squaredNumber = userInput.nextInt();
	float Square = (float)Math.pow(squaredNumber,0.5);
	
		if(Square % 1 !=0){
		System.out.println("false");
		}
		else{
		System.out.println("true");
		}
	
	System.out.print("enter a five digit number: ");
	int integer = userInput.nextInt();

	int firstnumber = integer % 10;
	integer /=10;

	int secondnumber = integer % 10;
	integer /=10;
	
	int thirdnumber = integer % 10;
	integer /=10;
	
	int fourthnumber = integer % 10;
	integer /=10;
	
	int fifthnumber = integer % 10;

	
	if (firstnumber == fifthnumber &&  secondnumber == fourthnumber) {
	
	System.out.println("the integer is a palindrome");
	} else {
	System.out.println("the integer is not a palindrome");
}

	System.out.println("Enter a number to get the factorial");
	int factorial = userInput.nextInt();
	int factorialNumber = 1;
	System.out.println("The factorial of "+factorial+" is   " +factorial);
	while(factorial > 0){
	factorialNumber *= factorial;
	factorialNumber ++;
	}
	System.out.println(factorialNumber);

	System.out.println("Enter a number");
	int theSquare = userInput.nextInt();
	int numberSquare = theSquare * theSquare;
	System.out.println(theSquare + "The square of the number is " + numberSquare);

	




} 
}