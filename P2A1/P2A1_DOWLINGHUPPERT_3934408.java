/*
Elias Dowling-Huppert
Project Two
Craps game
Last edited - 10/6/2014
*/
import java.util.Scanner; 

public class P2A1_DOWLINGHUPPERT_3934408 {

	public static void main(String[] args) {
		String name; //string to store name in
		Scanner input = new Scanner(System.in); // creates scanner class input
		System.out.println("Hello, my name is Elias Dowling-Huppert and today you'll be playing a game of craps."
				+ "\nWhat is your name?"); // welcome message
		name = input.next(); // gets name
		System.out.printf("\nHello %s!", name); // prints name
		// prints rules of craps
		System.out.println(" The Rules of craps are as follows:"
				+ "\nA new shooter (player) begins with his first dice roll (2 die = 2 dice)."
				+ "\n \tThis is known as the \"come out roll\". "
				+ "\nIf the shooter rolls a 7 or 11 the player wins. "
				+ "\nIf the shooter rolls a 2, 3 or 12, the player loses."
				+ "\nIf the shooter rolls any other number, the \"come out roll\" becomes the\n \"point number.\""
				+ "\nThe shooter must continue to roll the dice until either one of two things happens:"
				+ "\n \tThe shooter rolls a 7, and he loses."
				+ "\n \tThe shooter rolls the \"point number\" again, and he wins");

	}

}
