
/*
 *  Name: Isabella Eaton
 *  Class: CS1050-004 (T/TH)
 *  Description: GE03 
 *  project team and athlete analysis
 */
public class ProjectIteration01

{//start class

	public static void main(String[] args)
	{//start main
	//User Story 1: display program overview 
	//call method in main
	displayProgramOverview();
	
	}//end main
	//user story 1: method to display program overview 
	//testing:
	public static void displayProgramOverview() {
		System.out.println("-------- Program Overview ---------");
		System.out.println("The trainer enters how many athletes are on the team.\n"
				+ "Then the trainer enters each athlete's weigh, height, and age.\n"
				+"For each athlete, the program calculates BMI and Max Heart Rate.\n"
				+"BMI Categories:\n"
				+ "Under 18.5: Underweight\n"
				+ "18.5 to under 30: Normal\n"
				+ "30 or greater: High\n"
				+ "Calculates percentages of max heart rate for athlete training goal if needed.\n");
	}//end method 

	
}//end class