// Program: Terning
// Version: 2.00
// Date created: 2014-06-10
// Last modified: 2016-09-24
// Author: Bjørn Christensen 
// Modified by: Agner Fog

// Description:
// This program simulates roll of a die
// It has three errors:
// 1. The program asks the user how many times he wants the dice to roll.
//    If he doesn´t enter a valid number the program will crash.
// 2. The program rolls the dice one time less than asked
// 3. The dice is not symetric. It will roll too few ones and six'es



import terning.Dice;

import java.util.Scanner;

public class UseDice {

	public static void main(String[] args) {


		///////////////////////////////////////////////////////////////////////////////
		/*
		-------------------------------------------------------------------------------
		Create Dice object and Scanner object
		-------------------------------------------------------------------------------
		 */
		Dice cup = new Dice();   // Make an instance of Dice
		Scanner keyboard=new Scanner(System.in);   // Make an instance of keyboard Scanner

		///////////////////////////////////////////////////////////////////////////////



		///////////////////////////////////////////////////////////////////////////////
		/*
		-------------------------------------------------------------------------------
		Print welcome message and prompt the user for the input
		-------------------------------------------------------------------------------
		 */
		System.out.println("Welcome to the diceroll program");
		System.out.println("How many times do you want to roll the dice?");

		///////////////////////////////////////////////////////////////////////////////



		///////////////////////////////////////////////////////////////////////////////
		/*
		-------------------------------------------------------------------------------
		Get the user input and check if it's valid
		-------------------------------------------------------------------------------
		 */
		String n;
		int c;
		while (true) {

			n = keyboard.next();  // Read input
			boolean bestod = true;

			for (int i = 0; n.length() > i; i++) {
				if (n.charAt(i) >= '0' && n.charAt(i) <= '9') {
                    // Do nothing
				}
				else {
						bestod = false;
				}
			}

			// Hvis inputtet ikke bested forrige test, så loop forfra.
			if (!bestod) {
				// Print en fejlmeddelse
				System.out.println("Dit input skal være et positivt tal \nPrøv igen");
				continue;		// Loop again
			}

			if (bestod) {
				break;			// Gå ud af while loop
			}
		}
		///////////////////////////////////////////////////////////////////////////////



		///////////////////////////////////////////////////////////////////////////////
		// Parse the input to a int
		c = Integer.parseInt(n);

		cup.rollMultiple(c);         // Roll the dice c times
		keyboard.close();            // Close the scanner

		///////////////////////////////////////////////////////////////////////////////

	}
}
