<<<<<<< HEAD
public class ArrayKata{
	public static void main(String... ericalli){
		int[] numbers ={34 , 56 , 78 , 90 , 23 , 54};
			
			int maximumIn = numbers[0];
			for(int count = 1;  count < numbers.length; count++)  
				if (numbers[count] > maximumIn) {
					maximumIn = numbers[count];
					}
				System.out.println("\nThe largest element is : " + maximumIn);


				int minimumIn =numbers[0];
				for(int count = 0;  count < numbers.length; count++)  
				if(numbers[count] < minimumIn) {
					minimumIn = numbers[count];
				}
				System.out.println("\nThe smallest element is : " + minimumIn);

							
				int sumOf = 0;
				for(int count = 0; count < numbers.length; count++){
				sumOf += numbers[count];
				}
				
				System.out.println("\nThe sum of the elements is : " + sumOf);


				
				int noOfOddNumberIn = 0;
				int sumOfOddNumbersIn = 0;
				System.out.print("\nThe odd numbers are: "  );
				for(int count = 0; count < numbers.length; count++){
					if(numbers[count] % 2 != 0){
						noOfOddNumberIn++;
						sumOfOddNumbersIn += numbers[count];
						System.out.println(numbers[count] + " ");
					}
				}
				System.out.println("\nTotal number of odd numbers: " + noOfOddNumberIn);				
				System.out.printf("%n%s%n" , "The sum of odd numbers is:" + sumOfOddNumbersIn);
				

				
				int noOfEvenNumberIn = 0;
				int sumOfEvenNumbersIn = 0;
				System.out.printf( "%n%s%n" , "The even numbers are: " );
						for(int count = 0; count < numbers.length; count++){
							if(numbers[count] % 2 == 0){
							noOfEvenNumberIn++;
							sumOfEvenNumbersIn += numbers[count];
							System.out.print(numbers[count] + " ");
					}
				}
				System.out.println("\nTotal number of even numbers: " + noOfEvenNumberIn);
				System.out.println("\nThe sum of  even numbers is: " + sumOfEvenNumbersIn );			
	
				

				System.out.print("\nThe square of the numbers are: ");
				for(int count = 0; count < numbers.length; count++) {
					int squareNumbersIn = numbers[count] * numbers[count];
					System.out.print(squareNumbersIn + " ");
				}		
	}
=======
public class ArrayKata{
	public static void main(String... ericalli){
		int[] numbers ={34 , 56 , 78 , 90 , 23 , 54};
			
			int maximumIn = numbers[0];
			for(int count = 1;  count < numbers.length; count++)  
				if (numbers[count] > maximumIn) {
					maximumIn = numbers[count];
					}
				System.out.println("\nThe largest element is : " + maximumIn);


				int minimumIn =numbers[0];
				for(int count = 0;  count < numbers.length; count++)  
				if(numbers[count] < minimumIn) {
					minimumIn = numbers[count];
				}
				System.out.println("\nThe smallest element is : " + minimumIn);

							
				int sumOf = 0;
				for(int count = 0; count < numbers.length; count++){
				sumOf += numbers[count];
				}
				
				System.out.println("\nThe sum of the elements is : " + sumOf);


				
				int noOfOddNumberIn = 0;
				int sumOfOddNumbersIn = 0;
				System.out.print("\nThe odd numbers are: "  );
				for(int count = 0; count < numbers.length; count++){
					if(numbers[count] % 2 != 0){
						noOfOddNumberIn++;
						sumOfOddNumbersIn += numbers[count];
						System.out.println(numbers[count] + " ");
					}
				}
				System.out.println("\nTotal number of odd numbers: " + noOfOddNumberIn);				
				System.out.printf("%n%s%n" , "The sum of odd numbers is:" + sumOfOddNumbersIn);
				

				
				int noOfEvenNumberIn = 0;
				int sumOfEvenNumbersIn = 0;
				System.out.printf( "%n%s%n" , "The even numbers are: " );
						for(int count = 0; count < numbers.length; count++){
							if(numbers[count] % 2 == 0){
							noOfEvenNumberIn++;
							sumOfEvenNumbersIn += numbers[count];
							System.out.print(numbers[count] + " ");
					}
				}
				System.out.println("\nTotal number of even numbers: " + noOfEvenNumberIn);
				System.out.println("\nThe sum of  even numbers is: " + sumOfEvenNumbersIn );			
	
				

				System.out.print("\nThe square of the numbers are: ");
				for(int count = 0; count < numbers.length; count++) {
					int squareNumbersIn = numbers[count] * numbers[count];
					System.out.print(squareNumbersIn + " ");
				}		
	}
>>>>>>> 8d28105c070b2b289fbd01d25ef09fd172c36c9e
}