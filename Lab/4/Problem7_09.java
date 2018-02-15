import java.util.Scanner;

public class Problem7_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] nums = new double[10];
		
		System.out.print("Enter 10 randomn numbers ");
		for (int j = 0; j < nums.length; j++) {
			nums[j] = input.nextDouble();
		
		}
		
		System.out.println("The minimum number is " + min(nums));
		
		
	}
	
	public static double min(double[] array) {
		double min = array[0];
		for (double j: array) {
			if (j < min)
				min = j;
				
			}
			
		return min;
		
		}

}
