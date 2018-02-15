import java.util.Scanner;

public class Problem6_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an 'n' : ");
		int n = input.nextInt();
		
		printMatrix(n);
		
	}
	
	public static void printMatrix(int n) {
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols < n; cols++) {
			System.out.print((int)(Math.random() * 2));
			
		}
		
		System.out.println();
		}
	}
}