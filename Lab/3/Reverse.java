import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.print("Enter an integer ");
		int num = input.nextInt();

		System.out.println(num + (isPalin(num) ? " is " : " isn't ") +"a palindrome.");
	}

	
	public static boolean isPalin(int num) {
		return num == reverse(num) ? true : false;
	}

	
	public static int reverse(int number) {
		String reverse = ""; 	
		String n = number + ""; 
	
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
			}
		return Integer.parseInt(reverse); 
		}
	}