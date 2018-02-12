import java.util.Scanner;

public class UnspecifiedInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int pos = 0;
		int neg = 0;
		int amount = 0;
		double total = 0;
		
		
		//Prompts the user to enter a non-zero integer
		System.out.print("Enter an integer that is not 0, then type 0 when you would like to end: ");
		int num = input.nextInt();
		
		if (num  == 0) {
			System.out.print("The only number entered was 0.");
			System.exit(1);
		}
		
		//Will increase the number of positive or negative numbers based on what is entered
		
		while (num != 0) {
			if (num > 0)
				pos++;
			else
				neg++;
			//Will increase the amount total
			total += num;
			amount++;
			num = input.nextInt();
			
			
		}
		
		//Will calculate the average for the user
		double avg = total / amount;
		
		//Will give the results of positives, negatives, aberage and total
		System.out.println(
			"The number of positive numbers are " + pos +
			"\nThe number of negative numbers are " + neg +
			"\nThe Total numbers are " + total +
			"\nThe average " + avg);
		}

}
