import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		int opponent = (int)(Math.random() * 3);
		
		//Prompts the user to pick rock, paper, or scissors
		System.out.print("Rock (0), Paper (1), Scissors (2): ");
		int user = input.nextInt();
		
		System.out.print("Opponent chose ");
	
		switch (opponent) 
		
		{
		
		case 0: System.out.print("rock."); break;
		case 1: System.out.print("paper."); break;
		case 2: System.out.print("scissors.");
		
		}
		
		System.out.print(" You chose ");
		switch (user)
		
		{
		
		case 0: System.out.print("rock."); break;
		case 1: System.out.print("paper."); break;
		case 2: System.out.print("scissors.");
		
		}

		//Will show who won
		if (opponent == user)
			System.out.print(" too. You tied");
		else
		{
			boolean win = (user == 0 && opponent == 2) || (user == 1 && opponent == 0) || (user == 2 && opponent == 1);
			
			if (win)
				System.out.println(". You won congrats!");
			else
				
				System.out.println( "You lose yikes.");
		}
	}

}
