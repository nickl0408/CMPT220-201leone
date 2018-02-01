import java.util.Scanner;

public class CelsFaren {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Will prompt the user to type in a temperature value
		System.out.print("Enter a temperature value in Celsius: ");
		double celsius = input.nextDouble();
		
		//Will calculate the temperature in Farenheit
		double farenheit = (9.0 / 5) * celsius + 32;
		
		System.out.print("The temperature in Farenheit is: " + (int)(farenheit * 100) / 100.0);

	}

}