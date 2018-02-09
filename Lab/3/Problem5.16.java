import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer");
		int num = input.nextInt();
		int index = 2;
		
		while (num/index !=1) {
			if ( num % index == 0) {
				System.out.print(index + " , ");;
				num /= index;
			}
			else
				index++;
		}
		System.out.print( num + ". ");

	}

}
