import java.util.Scanner;

public class Minutes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Promopts the user to enter a number of minutes
		System.out.print("Enter the number of minutes: ");
		long minutes = input.nextLong();

		//Calculate years and days
		long years = minutes / (365 * 60 * 24);
		long days = (minutes % (365 * 60 * 24)) / 1440;

		
		System.out.println(minutes + " minutes is approximately " + years
			+ " years and " + days + " days");
	}
}