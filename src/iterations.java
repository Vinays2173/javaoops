import java.util.Scanner;
public class iterations {
			public static void main(String[] args) {
				
				Scanner scanner = new Scanner(System.in);
				int d= scanner.nextInt();
				int m = scanner.nextInt();
				int r =  scanner.nextInt();
				int u = scanner.nextInt();
				int c = scanner.nextInt();
				scanner.close();
				int [] newc = {d,m,r,u,c};
				for(int i=0;i<newc.length;i++) {
					System.out.println("cities are"+newc[i]);
					System.out.println();
				}
				System.out.println("while loop");
				int ind = 0;
				while(ind<newc.length) {
					System.out.println("cities"+newc[ind]);
					ind++;
				}
				
				
				
				
				
			}
}
