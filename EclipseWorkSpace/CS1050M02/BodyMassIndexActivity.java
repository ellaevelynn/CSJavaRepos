/*
 *  Name: Isabella Eaton
 *  Class: CS1050-004 (T/TH)
 *  Description: Guided Exploration 02     
 *  The program will calculate the BMI using formula in US units. 
 *  *User will enter weight in pounds and height in inches
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
		final double BMI_FACTOR_CONSTANT= 703;
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
		userWeight = keyboardInput.nextDouble();
		//keyboard input: 150.5
		
		// Get the user's height.
		System.out.print("Enter your height, in inches: ");
		// ADD CODE input next double for height
		userHeightIn = keyboardInput.nextDouble();
		//keyboard input: 66
		// Calculate the user's body mass index.
	userBmi = (userWeight/ (Math.pow(userHeightIn,2))) * BMI_FACTOR_CONSTANT ;

		// Display the user's BMI.
		//&& is used to add further parameters to the user BMI results so that the proper weight category is printed in the output.
		System.out.printf("Your body mass index (BMI) is %f", userBmi );
			if (userBmi < 18.50)
		{System.out.print(" You are underweight");
		}
		else if (userBmi >= 18.50 && userBmi<25.00)
		{System.out.print(" You are a healthy weight");
		}
		else if (userBmi >= 25.0 && userBmi<30.00)
		{System.out.print(" You are overweight");
		}
		else if (userBmi >= 30.00)
		{System.out.print(" You are obese");
		}
		keyboardInput.close();
		}
	
}