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

	int noOfsubjects;
	System.out.println("How many subject do they offer?");
	noOfSubjects = userInput.nextInt();
	
	System.out.println("""
	Saving >>>>>>>>>>>>>>>>>>>>>>>>>
	Saved successfully
	""");
	
	int[][] studentGrades = new int [noOfStudents][noOfSubjects];

	for(int student = 0;student < noOfStudents; student++){
		System.out.println("Entering score for student" , (Student + 1) + ":" );
	
	for(int score = 0;score < noOfSubjects; score ++){

		int subjects;
		System.out.println("Entering score for subject" , (Subject + 1) + ":");
		subjects = userInput.nextInt();
		
		if (score < 0 || score > 100){
			System.out.println("Invalid input,enter your number from 0 - 100!!!");
		   }
		while true
			(score < 0 || score > 100){
			studentGrades[noOfStudents][noOfSubjects] = score;

	System.out.println("""
	Saving >>>>>>>>>>>>>>>>>>>>>>>>>
	Saved successfully
	""");
		}
	}	
 


	}
}