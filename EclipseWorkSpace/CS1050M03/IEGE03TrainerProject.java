
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
	
	//display story 1
	PrintSummary();
	
	//setup scanner for inputs 
	java.util.Scanner methodInput = new java.util.Scanner(System.in);
	
	//display user story 2 
	String questionPrompt="placeholder";
	double athleteWeight=GetPositiveDouble(methodInput,"\n Enter athlete Weight");
	double athleteHeight=GetPositiveDouble(methodInput,"\nEnter Athlete Height");
	System.out.println("Athlete information saved as:  " + athleteWeight + " lbs, " + athleteHeight + " inches.");
	
	}//end main
	
//User story 1: Method to display summary.
	public static void PrintSummary() {
	System.out.print("Team and Athlete Analysis\n"
			+ "The trainer enters athlete data until they indicate they are done entering data."
			+ "\nThe trainer will enter each athlete’s weight and height"
			+ "\nFor each athlete entered, the BMI value and category will be displayed based"
			+"\non these BMI ranges.\n"
			+ "Under 18.5: Underweight\n"
			+ "18.5 to under 25: Normal\n"
			+ "25 to under 30: Overweight\n"
			+ "30 or greater: Obese\n"
				);
	
}//end PrintSummary
//User story 2: Method to Validate a Positive Double.
	public static double GetPositiveDouble(java.util.Scanner methodInput, String questionPrompt){
	double userDoubleInput=0;
	boolean isValidDouble=false;
	while (isValidDouble==false){
	System.out.print(questionPrompt);
	userDoubleInput = methodInput.nextDouble();
	if (userDoubleInput > 0) {
        isValidDouble = true; // condition to exit loop (if the number entered is a valid double)
    }//end if statement
	}//end while statement
	return userDoubleInput;
		
		
		
	}//end method 2 
	}//end class
