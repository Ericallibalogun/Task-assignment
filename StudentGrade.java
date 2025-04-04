import java.util.Scanner;

public class StudentGrade{
	public static void main(String... ericalli){
	Scanner userInput = new Scanner(System.in);

	
	System.out.println("""
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
\tLAGBAJA SCHOOLS STUDENTS GRADE
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
""");
	
	int noOfStudents;
	System.out.println("How many students do you have?");
	noOfStudents = userInput.nextInt();

	int noOfSubjects;
	System.out.println("How many subject do they offer?");
	noOfSubjects = userInput.nextInt();
	
	System.out.println("""
	Saving >>>>>>>>>>>>>>>>>>>>>>>>>
	Saved successfully
	""");
	
	int[][] studentGrades = new int [noOfStudents][noOfSubjects];

	for(int student = 0;student < noOfStudents; student++){
		System.out.println("Entering score for student" + (student + 1) + ":" );
	for(int subject = 0;subject < noOfSubjects; subject ++){
		while(true){
		System.out.println("Entering score for subject" + (subject + 1) + ":");
		int score = userInput.nextInt();
		
		if (score < 0 || score > 100){
			System.out.println("Invalid input,enter your number from 0 - 100!!!");
			break;
		   }else {
			studentGrades[student][subject] = score;
		   }
		 }
		}
	
	System.out.println("""
	Saving >>>>>>>>>>>>>>>>>>>>>>>>>
	Saved successfullyssss
	""");
	  }
	 }	
	
	}


	
