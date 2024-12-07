public class TaskSix{
public static void main(String... ericalli){
	System.out.println("Powers of the multiples of 4 between 1 and 10: ");

	for(int number = 1; number  < 11; number++)
		if(number % 4 == 0){
			System.out.printf("Powers of %d:%n" , number);
			int result = 1;
			for (int count = 1; count  <= 5; count++){
				System.out.println(result);
					result *= number;


}
  }
   
      }
}