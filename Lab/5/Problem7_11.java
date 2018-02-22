import java.util.Scanner;

public class Problem7_11 {

	static final int totalInt = 10;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] nums = new double[totalInt];
		
		System.out.print("Enter " + totalInt + " random numbers ");
		for (int j = 0; j < nums.length; j++)
			nums[j] = input.nextDouble();
			
			System.out.println("The mean of the numbers is " + mean(nums));
			System.out.println("The standard deviation of the numbers is " + deviation(nums));
			
		}
		public static double deviation(double[] n) {
			double deviation = 0;
			double mean = mean(n);
			for (double e: n) {
				deviation += Math.pow(e - mean, 2);
				
			}
			
			return Math.sqrt(deviation / (n.length - 1));
		}
		
		public static double mean(double[] n) {
			double mean = 0;
			for (double e: n) {
				mean += e;
			}
			return mean / n.length;
		}

}