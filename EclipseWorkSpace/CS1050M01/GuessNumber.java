/**
 * This program takes user input to see if they can guess the 
 * random number generated. Add comments to explain the code.
 */

import java.util.Scanner;

public class GuessNumber 
//Guess Number is the class name 
//public,class are keywords 
{// start of class
	public static void main(String[] args)
//the class GuessNumber contains a method named main, this allows the program to begin executing 
//statements from the main method
//static, void are keywords
	{ //start of main
		final int RANDOM_MULTIPLIER = 100;
//final is declaring the constant type int
//int declares the constnant as an integer and allocated the proper ammount of data 
//constants are capitalized always (RANDOM_MULTIPLIER)
// the constant RANDOM_MULTIPLIER is assigned to an integer set of values from 0 to 100
		int number = (int) (Math.random() * RANDOM_MULTIPLIER) + 1;
//int declares an integer-sized variable titled "number"
//from this, the variable "number" is assigned the following:
//Math.random: returns "a pseudorandom double greater than or equal to 0.0 and less than 1.0."
//Math (capitalized M) is a class which contains many basic mathematic methods
//random is a method under the class Math.

		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("Guess a magic number between 0 and 100");

		int guess = -1;
		while (guess != number)
		{

			System.out.print("\nEnter your guess: ");
			guess = keyboardInput.nextInt();

			if (guess == number) 
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

	}//end of main
}//end of class
