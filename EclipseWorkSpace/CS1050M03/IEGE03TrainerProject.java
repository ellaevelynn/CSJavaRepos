/*
 *  Name: Isabella Eaton
 *  Class: CS1050-004 (T/TH)
 *  Description: Guided Exploration 03     
 *  The program will provide a summary of a BMI analysis program.
 */
public class IEGE03TrainerProject
{//start class

	public static void main(String[] args)
	{//start main
	PrintSummary();

	}//end main
	public static void PrintSummary() {
	System.out.print("Team and Athlete Analysis\n"
			+ "The trainer enters athlete data until they indicate they are done entering data."
			+ "\nThe trainer will enter each athlete’s weight and height"
			+ "\nFor each athlete entered, the BMI value and category will be displayed based"
			+"\non these BMI ranges.\n"
			+ "Under 18.5: Underweight\n"
			+ "18.5 to under 25: Normal\n"
			+ "25 to under 30: Overweight\n"
			+ "30 or greater: Obese"
				);
	
}//end PrintSummary
}//end Class