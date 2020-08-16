import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		
		// Result for some examination and we have selected students and below is an Array of Selected Roll Numbers
		int[] students = {101, 705, 313, 456, 765};
		
		// Scanner Object Construction Statement
		Scanner scanner = new Scanner(System.in); // System.in is to read from console :)
		
		System.out.println("Enter Your Roll Number to Check if You Are Selected or Not");
		int rollNum = scanner.nextInt();
		
		System.out.println("You have Entered: "+rollNum);
		
		// close the scanner to release memory resources
		scanner.close();
		
		// Algorithm: Linear Search
		for(int i=0;i<students.length;i++) {
			System.out.println("Checking "+rollNum+" against "+students[i]);
			if(rollNum == students[i]) {
				System.out.println("RollNumber: "+rollNum+" Found. You Are Selected");
				break; // this will break the loop and hence loop will not execute further
			}
		}
	}
}

