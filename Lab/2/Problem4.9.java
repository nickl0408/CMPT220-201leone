import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char character = input.next().charAt(0);
		input.close();
		
		System.out.println("The Unicode for " + character + " is " + (int)character);

	}

}
