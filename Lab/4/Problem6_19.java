import java.util.Scanner;

public class Problem6_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three random sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println(isValid(side1, side2, side3) ?
				"The area of the triangle sides given is " + area1(side1, side2, side3) :
					"Input is invalid");
	}
	
	public static boolean isValid(
			double side1, double side2, double side3) {
		boolean valid =
				side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
				return valid;
	}
	
	public static double area1(
			double side1, double side2, double side3) {
			double s = (side1 + side2 + side3) / 2;
			return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
			
	
	}

}
