/**
 * This program takes user input to see if they can guess the 
 * random number generated. Add comments to explain the code.
 */

import java.util.Scanner;
// import Java and the class scanner 
public class EatonIsabellaGuessNumber 
//Guess Number is the class name 
//public,class are keywords 
{// start of class
	
	public static void main(String[] args) //the class GuessNumber contains a method named main, this allows the program to begin executing statements from the main method
//static, void are keywords
	{ //start of main
		
		final int RANDOM_MULTIPLIER = 100; //final is declaring the constant, data type is integer.
//final means that the information will stay constant and can't change
//int declares the data type stored (values that do not include decimals)
//constants are capitalized always (RANDOM_MULTIPLIER)
//RANDOM_MULTIPLIER initialized and assigned to 100
//the constant RANDOM_MULTIPLIER is assigned to an integer set of values from 0 to 100
		
		int number = (int) (Math.random() * RANDOM_MULTIPLIER) + 1;
//int declares an integer-sized variable titled "number"
//from this, the variable "number" is assigned the following:
//Math.random: returns "a pseudorandom double greater than or equal to 0.0 and less than 1.0."
//Math (capitalized M) is a class which contains many basic mathematic methods
//random is a method under the class Math. random result assigned between 0 and 1 multiplied by random multiplier and added to 1 
// then declared as an integer to be able to fit back into the variable number without risk of an overflow.

		Scanner keyboardInput = new Scanner(System.in); //warning, method not closed, resource link
//importing the class scanner (non primitive data type)
//creating an object from the class 
//need to use new when creating new object
//system.in scan input form keyboardS
//only need one object to call methods 
		
		System.out.println("Guess a magic number between 0 and 100");
		
		int guess = -1;
// declare and initialize your variable to some value 
//the integer variable guess is assigned the value -1
		
		while (guess != number)
//so long as the integer "guess" does not equal the variable "number"
		{

			System.out.print("\nEnter your guess: ");
			guess = keyboardInput.nextInt();
//now can assign new value (reads in input)
			
			if (guess == number) 
// == is equal to
				
			{
				System.out.println("Yes, the number is " + number);
			}
			
			else if (guess > number)
			{
				System.out.println("Your guess is too high");
			}
			
			else
			{
				System.out.println("Your guess is too low");
			}
		}
		keyboardInput.close();
	}//end of main
}//end of class
