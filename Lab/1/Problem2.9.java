import java.util.Scanner;

public class velocity {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompts the user to input the values that will be plugged into the equation
		System.out.print("Enter v0, v1 and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		//Will calculate the acceleration
		double a =(v1 - v0) / t;
		
		System.out.println("The average acceleration is " + a);
		

	}

}
