public class TaskSeven {
    public static void main(String... ericalli) {
        System.out.println("Sum of the powers of the multiples of 4 between 1 and 10:");

        for (int number = 1; number < 11; number++) {
            if (number % 4 == 0) { 
                System.out.printf("Powers of %d:%n", number);

                int result = 1; 
                int sum = 0;    

                for (int count = 1; count <= 5; count++) {
                    result *= number;  
                    sum += result;     
                    System.out.printf("  %d^%d = %d%n", number, count, result);
                }
                System.out.printf("Sum of powers of %d: %d%n%n", number, sum);
             }
          }
      }
}