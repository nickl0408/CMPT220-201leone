import java.util.Scanner;

public class Problem7_15{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int[] num = new int[10];
		System.out.print("Please enter 10 numbers: ");
		for (int j = 0; j < num.length; j++)
			num[j] = input.nextInt();

		
		int[] getDistinctNumbers = eliminateDuplicates(num);
		System.out.print("The distinct numbers are:");
		for (int x: getDistinctNumbers) {
			if (x > 0) System.out.print(" " + x);
		}
		System.out.println();
	}

	public static int[] eliminateDuplicates(int[] list) {
		int[] distinctNums = new int[list.length];
		int j = 0;	
		for (int x: list) {
			if (newSearch(distinctNums, x) == -1) {
				distinctNums[j] = x;
				j++;
			}
		}
		return distinctNums;
	}

	public static int newSearch(int[] array, int newArray) {
		for (int j = 0; j < array.length; j++) {
			if (newArray == array[j])
				return j;
		}
		return -1;
	}
}