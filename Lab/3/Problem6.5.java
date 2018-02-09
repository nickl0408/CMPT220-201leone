import java.util.Scanner;

public class ThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 3 Numbers");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

		displaySortedNumbers(num1, num2, num3);
	}
		
		public static void displaySortedNumbers(double numb1, double numb2, double numb3) {
			double temp;
			
			if (numb2 < numb1 && numb2 < numb3){
				temp = numb1;
				numb1 = numb2;
				numb2 = temp;
			}
			else if (numb3 < numb1 && numb3 < numb2) {
				temp = numb1; 
				numb1 = numb3;
				numb3 = temp;
			}
			if (numb3 < numb2) {
				temp = numb2;
				numb2 = numb3;
				numb3 = temp;
			}
		
			//Will display the 3 numbers in increasing order
		System.out.println(numb1 + " " + numb2 + " " + numb3);
	}

}
