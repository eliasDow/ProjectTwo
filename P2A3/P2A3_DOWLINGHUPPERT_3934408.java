/*
Elias Dowling-Huppert
Project Two
Craps game
Last edited - 10/13/2014
*/
import java.util.Scanner; 
import java.util.Random;

public class P2A3_DOWLINGHUPPERT_3934408 {

	public static void main(String[] args) {
		String name; //string to store name in
		Scanner input = new Scanner(System.in); // creates scanner class input
		System.out.println("Hello, my name is Elias Dowling-Huppert and today you'll be playing a game of craps."
				+ "\nWhat is your name?"); // welcome message
		name = input.next(); // gets name
		System.out.printf("\n Hello %s!", name); // prints name
		// prints rules of craps
		System.out.println("The Rules of craps are as follows:"
				+ "\n A new shooter (player) begins with his first dice roll (2 die = 2 dice)."
				+ "\n \t This is known as the \"come out roll. "
				+ "\n If the shooter rolls a 7 or 11 the player wins. "
				+ "\n If the shooter rolls a 2, 3 or 12, the player loses."
				+ "\n If the shooter rolls any other number, the \"come out roll\" becomes the \n\"point number.\""
				+ "\n The shooter must continue to roll the dice until either one of two things \nhappen:"
				+ "\n \t The shooter rolls a 7, and he loses."
				+ "\n \t The shooter rolls the \"point number\" again, and he wins");
		
		System.out.println("Press enter to start the game. "); 
		Scanner enter = new Scanner(System.in);
		enter.nextLine(); // lets user hit enter to start game
		
		
		Random dieOne = new Random(); // creates random class
		Random dieTwo = new Random();
		
		
		// rolls the die
		int comeOut = (dieOne.nextInt(6)+1) + (dieTwo.nextInt(6)+1);
		
		
		System.out.printf("\nYour come out roll was %d", comeOut); // prints come out roll
		
		// simulates come out roll
		if (comeOut == 7 || comeOut == 11)
			{
			System.out.println("\nYou win!"); // win if you roll 7 or 11
			System.exit(0);
			}
				
		else if (comeOut == 2 || comeOut == 3 || comeOut == 12)
			{
			System.out.println("\nYou lose."); // lose if you roll 2,3, or 12
			System.exit(0);
			}
		else
		{
			
			System.out.printf("\nYou rolled %d. You must keep rolling to complete the game.", comeOut);
		}
	}	
}