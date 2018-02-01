import java.util.Scanner;

public class GratandSub {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			//Will prompt the user to type in a gratuity rate and total
			System.out.print("Enter the gratuity rate and subtotal");;
			double subtotal = input.nextDouble();
			double gratuityRate = input.nextDouble();
			
			//Will calculate the gratuity rate and what the total value is and display it for the user
			double gratuity = subtotal * (gratuityRate / 100);
			double total = subtotal + gratuity;
			
			System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

	}

}
