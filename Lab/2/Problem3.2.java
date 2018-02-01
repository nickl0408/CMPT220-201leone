import java.util.Scanner;

public class Intergers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Will create three random integers and display them
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		int num3 = (int)(Math.random() * 10);
		
		//Will ask the user to type the sum of the three integers
		System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + " ? " );
		int answer = input.nextInt();
		
		System.out.println(
				num1 + " + " + num2 + " + " + num3 + " = " + answer + " is " + (num1 + num2 + num3 == answer));

	}

}
