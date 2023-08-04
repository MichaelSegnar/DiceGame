import java.util.Random;
import java.util.Scanner;

public class Test {
	

	public static void main(String[] args)
	{
		diceGame();
	}

	public static void diceGame()
	{
		Random roll = new Random();
		int win = 0, loss = 0;
		
		System.out.println("Would you like to play a dice game?");
		boolean play = yesNo();
		
		while(play)
		{
			int secret = 1 + roll.nextInt(6);
			boolean result = ((secret % 2) == 0);
		
			String outcome;
			if(result) {outcome = "even";}else {outcome = "odd";}
			
			System.out.println("Dice has been rolled.\nIs it even or odd?");
			boolean evens = evenOdd();
			
			System.out.println("The result is: " + secret + "! It's " + outcome + "!");
			if(result == evens)
			{
				System.out.println("You Win!"); win++;
			}
			else {System.out.println("You Lose!");loss++;}
			
			System.out.println("\nWould you like to play again?");
			play = yesNo();
		}
		System.out.println("Results:\nWins: " + win + "\nLosses: " + loss);
	}
	
	public static boolean yesNo()
	{
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
			String choice = in.nextLine();
			if(choice.equals("Yes")|choice.equals("Y")|choice.equals("yes")|choice.equals("y")) {return true;}
			if(choice.equals("No")|choice.equals("N")|choice.equals("no")|choice.equals("n")) {return false;}
			System.out.println("Invalid Choice");
		}
	}
	
	public static boolean evenOdd()
	{
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
			String choice = in.nextLine();
			if(choice.equals("Even")|choice.equals("even")) {return true;}
			if(choice.equals("Odd")|choice.equals("odd")) {return false;}
			System.out.println("Invalid Choice");
		}
	}
}
