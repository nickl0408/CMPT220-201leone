import java.util.Scanner;

public class Problem7_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] values = new int[100];
		int input;
		int total = 0;
		System.out.print("Enter the integers that are between 1 and 100");
		do
		{
			input = in.nextInt();
			values[total] = input;
			total += 1;
			
		}
		
		while (input != 0);
		
		totalOccurence(values);
		
	}
	
	public static void totalOccurence(int[] list) {
		for (int j = 1; j <= 100; j++) {
			int total = 0;
			for (int k = 0; k < list.length - 1; j++) {
				if (list[k] == 1)
					total += 1;
			}
			if (total != 0)
				System.out.printf("%d occurs %d %s%n", j, total, total > 1 ? "times" : "time");
		}

	}

}
