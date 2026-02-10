/**
 * Calculate the BMI using formula in US units. 
 * User will enter weight in pounds and height in inches
 */

// ADD CODE to import Scanner class
import java.util.Scanner;

public class BodyMassIndexActivity
{

	public static void main(String[] args)
	{
		//Create constants and variables
		//initializing variables and constants
		// constants
		// factor formula in pounds
		final int BMI_FACTOR_CONSTANT= 703;
		// Variables
		//the user's weight 
		double userWeight = 0;
		// The user's height
		double userHeightIn = 0;
		 // The user's BMI
		double userBmi = 0;
		// Create a Scanner object for scanning input from keyboard
		Scanner keyboardInput = new Scanner(System.in);
		// Tell the user what the program will do.
		System.out.println("This program will calculate your " + "body mass index, or BMI.");

		// Get the user's weight.
		System.out.print("Enter your weight, in pounds: ");
		// ADD CODE to input next double for weight
		userWeight = keyboardInput.nextInt();
		
		// Get the user's height.
		System.out.print("Enter your height, in inches: ");
		// ADD CODE input next double for height
		userHeightIn = keyboardInput.nextInt();
		
		// Calculate the user's body mass index.
		userBmi = (userWeight/ (userHeightIn * userHeightIn)) * BMI_FACTOR_CONSTANT ;

		// Display the user's BMI.
		System.out.printf("Your body mass index (BMI) is %f", userBmi);

	}
}