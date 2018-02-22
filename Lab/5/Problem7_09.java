import java.util.Scanner;

public class Problem7_09 {

	static final int Group = 10;
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] x = new double[Group];
		System.out.print("Please enter " + Group + " numbers: ");
		for (int j = 0; j < x.length; j++) x[j] = input.nextDouble();
		
		System.out.println("Out of these choices, the smallest number is " + minimum(x));
	}
	
	public static double minimum(double[] array) {
		double minimum = array[0];
		for (int j= 0; j < array.length; j++) {
		if (minimum > array[j]) minimum = array[j];
		}
		
		return minimum;

	}

}
