// Adha Fawwaz Syakhroza & Gabriella Samantha Maria
// 22/2/23
// CS &141
// Lab #4
// This program will do the following: Create a number guessing game
import java.util.*;
public class GSGuessingGame 
{
	public static final int maximum = 100;
	public static void main(String[] args) 
   {
		introduction();
		int games = 1;
		int guesses = playGame(games);
		int gaema = guesses;
		int guessnumb = guesses;
		boolean yesOrNo = true;
		while (yesOrNo) 
      {
			System.out.print("Do you want to play again? ");
			Scanner playAgainInput = new Scanner(System.in);
			String playAgainLC = playAgainInput.next().toLowerCase();
			yesOrNo = playAgainLC.startsWith("y");
			if (playAgainLC.startsWith("y")) 
         {
				System.out.println();
				games++;
				guesses = playGame(games);
				guessnumb += guesses;
				if (guesses < gaema) 
            {
					gaema = guesses;
				}
			}
		}
		if (yesOrNo != true) 
      {
			displayResults(guessnumb, games, gaema);
		}
	}
	public static void introduction() 
   {
		System.out.print("This program allows you to play a guessing game.\n");
		System.out.print("I will think of a number between 1 and\n");
		System.out.print(maximum + " and will allow you to guess until\n");
		System.out.print("you get it. For each guess, I will tell you\n");
		System.out.print("whether the right answer is higher or lower\n");
		System.out.print("than your guess.\n");
		System.out.println();
	}
	public static int playGame(int games) 
   {
		Scanner inputAttempt = new Scanner(System.in);
		Random randInt = new Random();
		int number = randInt.nextInt(maximum - 1) + 1;
		int guesses = 0;
		boolean win = false;
		System.out.println("I am thinking of a number between 1 and " + maximum + "...");
		while (win == false) 
      {
			System.out.print("Your Guess? ");
			int guess = inputAttempt.nextInt();
			guesses++;
			if (guess == number) 
         {
				win = true;
			} else if (guess < number) 
         {
				System.out.println("It's higher.");
			} else if (guess > number) 
         {
				System.out.println("It's lower.");
			}
		}
		String a = ("guesses");
		if (guesses < 2) 
      {
			a = ("guess");
		}
		System.out.println("You got it right in " + guesses + " " + a);
		return guesses;
	}
	public static void displayResults(int guessnumb, int games, int gaema) 
   {
		System.out.println("Overall Results:");
		System.out.println("total games = " + games);
		System.out.println("total guesses = " + guessnumb);
		System.out.println("guesses/game " + (guessnumb / games));
		System.out.println("best game = " + gaema);
	}
}