import java.util.Scanner;

public class Problem7_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] distinctNumber = new int[10];
		int number;
		int total = 0;
		
		System.out.print("Enter 10 random numbers: ");
		for (int j = 0; j < 10; j++) {
			number = input.nextInt();
			
			if (isDistinct(distinctNumber, number)) {
				distinctNumber[total] = number;
				total++;
			}
		}
		
		System.out.println("The total distinct numbers is " + total);
		System.out.print("The distinct numbers are");
		for (int j = 0; j < distinctNumber.length; j++) {
			if (distinctNumber[j] > 0)
				System.out.print(" " + distinctNumber[j]);
			
		}
		System.out.println();
	}

	public static boolean isDistinct(int[] array, int number) {
		for (int j = 0; j< array.length; j++) {
			if (number == array[j])
				return false;
		}
		return true;
	}
}
