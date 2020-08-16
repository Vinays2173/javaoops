import java.util.Scanner;

public class BreakStatement {
	public static void main(String[] args) {
			int a[] = new int[] {10,20,30,40,50,60};
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter a roll no ");
			int rollno = scanner.nextInt();
			System.out.println("entered roll no is: "+rollno);
			scanner.close();
			for(int i=0;i<a.length;i++) {
				System.out.println("cheaking "+rollno+" against"+a[i]);
				if(a[i]==rollno) {
					System.out.println("you are selected");
					break;
				}
			}
				
		}
}
