/*
 *  Name: Isabella Eaton
 *  Class: CS1050-004 (T/TH)
 *  Description: Guided Exploration 02     
 *  The program will produce a Mad-lib given the inputs you provide.
 */

import java.util.Scanner; //allows scanner to be used in program for keyboard input
public class IEMGE02MathCharsStrings// Fulfills GE02 Requirement #1
{// start class

	public static void main(String[] args)
	{// start main
		// TODO Auto-generated method stub
		// declare and initialize string variables that will later be edited when your program is ran.
		//(7a)string variables are used for full words or sentences and assigned content is enclosed in ""
		//(7b) read in a string by declaring and initializing the string variable.
		// Fulfills GE02 Requirement #2
		 String firstName="name";
		 String lastName ="last";
		 String nounAny= "noun";
		 String ingVerb="verb";
		 String adjectiveAny="adjective";
		 String placeAny="place";
		 String favoriteLetter="A";
		
		// incorperate scanner so that keyboard inputs can be used 
		 Scanner input = new Scanner(System.in); //call scanner to use keyboard inputs 
		 
		//fill-in-the-blank for your MadLib, replace initial values for variables with keyboard inputs
		 System.out.println("Let's create a MadLib!");
		 System.out.println("Enter a first name:");
		 firstName = input.next();
		 //entered: Sayuj
		 System.out.println("Enter a last name:");
		 lastName = input.next();
		 //entered: Shrestha
		 System.out.println("Enter a noun (a person, place or thing):");
		 nounAny = input.next();
		 // Entered: burrito
		 System.out.println("Enter a verb (action word) ending in -ing:");
		 ingVerb = input.next();
		 // entered: sitting
		 System.out.println("Enter an adjective (a descriptive word):");
		 adjectiveAny = input.next();
		 //entered: funny
		 System.out.println("Enter a place:");
		 placeAny = input.next();
		 //entered: Olympics
		 System.out.println("Enter your favorite letter:");
		 favoriteLetter = input.next();
		 // entered: Q
		 
		//extract first character of the last name and store it as a char 
		//fulfills requirement #3
		//fulfills requirement #4
		 char lastInitial = lastName.charAt(0);
		//(7a)char data types assigns numerical values to each letter input in an item.
		//char data type content is encased in a '' when assigning.
		//(7b) read in a char by declaring and initializing the char variable.
		//(7c) .charAt(0) reads and identifies the character located at the beginning of the lastName string.
		//fulfills requirement #5.
		//filfills requirement #6.
		//Print the final completed  MadLib.
		 String summary = "Once upon a time " + lastInitial + " " + lastName + " was "
		 		+ ingVerb+" through the "+ placeAny+ " with a "+ nounAny+". "+ "It was a very "
				 +adjectiveAny+ " day. Their favorite letter was "+ favoriteLetter +".";
		 //using the + is a way of practicing string concatenation. This combines strings with additional strings that are not defined as variables anywhere other than the summary.
		 System.out.println(summary);
		 //output: Once upon a time, Sayuj S was sitting through the Olympics with a burrito. It was a very funny day. Their favorite letter was Q.”
		 input.close();	//closes keyboard input to prevent data leak warning

	}//end main

}//end class
