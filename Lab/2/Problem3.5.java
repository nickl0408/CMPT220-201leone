import java.util.Scanner;

public class Days {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompts the user to enter the number to represent today
		System.out.print("Enter what day it is: ");
		int day = input.nextInt();
	
		//Prompts the user to enter the amount of days passed
		System.out.print("Enter the amount of days that have passed since today: ");
		int daysPassed = input.nextInt();
		
		//Will calculate the next day
		int nextDays = (day + daysPassed) % 7;
		
		System.out.print("Today is");
		switch (day)
		{
		
		case 0: System.out.print("Sunday"); break;
		case 1: System.out.print("Monday"); break;
		case 2: System.out.print("Tuesday"); break;
		case 3: System.out.print("Wednesday"); break;
		case 4: System.out.print("Thursday"); break;
		case 5: System.out.print("Friday"); break;
		case 6: System.out.print("Saturday");
		
		}

		System.out.print(" and the next day is ");
		switch (nextDays)
		
		{
		case 0: System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday");
		}
	}

}
