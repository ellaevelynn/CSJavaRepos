
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
	//setup scanner for inputs 
	java.util.Scanner methodInput = new java.util.Scanner(System.in);
	//counter for story 5
	int athleteEntriesCount = 0;
	boolean keepCalculatingBMI = true;
	//display story 1
	PrintSummary();
	do {
	
	//display user story 2 
	String questionPrompt="placeholder";
	double athleteWeight=getPositiveDouble(methodInput,"\n Enter athlete Weight in pounds: ");
	double athleteHeight=getPositiveDouble(methodInput,"\nEnter Athlete Height in inches: ");
	System.out.println("Athlete information saved as:  " + athleteWeight + " lbs, " + athleteHeight + " inches.");
	
	//display user story 3
	double athleteBmiValue=calculateBMI(athleteWeight,athleteHeight);
	System.out.println("\n The BMI of this Athlete is:  "+athleteBmiValue);
	
	//display user story 4
	String bmiCategory=getBMICategory(athleteBmiValue);
	System.out.println("\n The BMI category of this Athlete is:  "+bmiCategory);
	
	//display user story 5
	
	//keep track of bmi for athletes entered 
	athleteEntriesCount++;
	keepCalculatingBMI = AskToContinue(methodInput);
		} while (keepCalculatingBMI);
	System.out.println("\n" + athleteEntriesCount + " athlete calculations were completed.");
	methodInput.close();
	   
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
}//end PrintSummary/user story 1 
	
//User story 2: Method to Validate a Positive Double.
	public static double getPositiveDouble(java.util.Scanner methodInput, String questionPrompt){//need to use java.util.Scanner instead of just Scanner 
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
	}//end method 2 / user story 2

//User story 3:Method to Calculate BMI
	public static double calculateBMI(double athleteWeight, double athleteHeight) {
	final double BMI_FORMULA_CONSTANT=703;
	double athleteBmiFormula=(athleteWeight/(Math.pow(athleteHeight,2)))* BMI_FORMULA_CONSTANT;
	return Math.round(athleteBmiFormula);
	}//end method 3/ user story 3 

//User story 4:Get BMI Category
	public static String getBMICategory(double athleteBmiValue ) {
		String bmiCategory="Placeholder";
		if (athleteBmiValue >= 30.0){
			bmiCategory = "Obese";
		} else if (athleteBmiValue >=25.0 ){
			bmiCategory = "Overweight";
		} else if (athleteBmiValue>= 18.5){
			bmiCategory = "Healthy weight";
		} else {
			bmiCategory = "Underweight, needs review";
		} 
		return bmiCategory;

	}//end method 4/ user story 4 

//User Story 5: Method: AskToContinue
	public static boolean AskToContinue(java.util.Scanner methodInput) {
	char userCharInput='z';
	boolean isValidChar=false;
	while (isValidChar==false) {
	System.out.println("would you like to calculate the BMI for another athlete? (y or n)");
	userCharInput = methodInput.next().toLowerCase().charAt(0);
	if (userCharInput == 'y' || userCharInput == 'n') {
        isValidChar = true;// queue to exit loop 
	}
	}
	return userCharInput == 'y';
	}//end method 5/ user story 5 
	
}//end class