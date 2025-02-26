import java.util.Scanner;
import java.util.MissingFormatArgumentException;

	public class LogisticsServices{
	public static void main(String... ericalli){

	Scanner userInput = new Scanner(System.in);

	int wage = 0;

	System.out.println("\t─────.WELCOME TO BACK TO SENDER LOGISTICS SERVICES.─────");
	System.out.println("""
		Collection Rate    |Amount Per Parcel  |Base Pay  
     
                Less than 50 %                     160                       5000
		   
		  50 - 59 %                               200                      5000
		
		  60 - 69 %                               250                      5000

		  >= 70 %                                  500                      5000
		
		  """);
	 

	System.out.println("Enter the number of successful delivery: ");
	int response = userInput.nextInt();

	while(true){
	if (response < 1){
		System.out.println("invalid input, try again...");
		response = userinput.nextInt();
               break;
	}else {

 if(response < 50) {
	wage = response * 200 + 5000;
		System.out.printf("Hello rider,your wage for today is: %d " , wage);
            break;

	}else if (response >= 50 && response < 60){
	wage = response * 200 + 5000;
		System.out.printf("Hello rider,your wage for today is: %d " , wage);

	}else if (response >= 60 && response < 70){
	wage = response * 200 + 5000;
		System.out.printf("Hello rider,your wage for today is: %d " , wage);

	}else {
	if (response >= 70);
           wage = response * 200 + 5000;
		System.out.printf("Hello rider,your wage for today is: %d " , wage);
		}
            }

	}
   }
}	