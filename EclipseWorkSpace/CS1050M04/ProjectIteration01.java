
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
	java.util.Scanner userInput = new java.util.Scanner(System.in);
	//declaring arrays that will be needed later in the program
	String athleteFirstNames[];
	double athleteBMI[];
	double athleteMHR[];
	//User Story 1: display program overview 
	//call method in main
	displayProgramOverview();
	//User Story 2: Specify number of athletes
	String questionPrompt="placeholder";
	int athleteCount=getPositiveInteger(userInput,"\nEnter the number of athletes on the team:");
	athleteFirstNames=new String[athleteCount];
	athleteBMI=new double [athleteCount];
	athleteMHR= new double[athleteCount];
	//user story 3: validate age, weight, and height
	getUserStats(userInput, athleteCount, athleteFirstNames, athleteBMI, athleteMHR);
	
	
	}//end main
	//method to display program overview (User story 1)
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
	}//end method, return nothing to main 

	//Method to validate integer input (User story 2,3)
	public static int getPositiveInteger(java.util.Scanner userInput, String questionPrompt){//need to use java.util.Scanner instead of just Scanner 
		System.out.print(questionPrompt);
		int userIntInput=userInput.nextInt();
		while (userIntInput<=0){
		System.out.print("Error: value must be greater than 0.");
		System.out.print(questionPrompt);
		userIntInput = userInput.nextInt();
		}//end while statement
		return userIntInput;
		}//end method 
	
	//Method to validate double input (User story 3)
	public static double getPositiveDouble(java.util.Scanner userInput, String questionPrompt){//need to use java.util.Scanner instead of just Scanner 
		System.out.print(questionPrompt);
		double userDoubleInput=userInput.nextDouble();
		while (userDoubleInput<=0.00){
		System.out.print("Error: value must be greater than 0.00");
		System.out.print(questionPrompt);
		userDoubleInput = userInput.nextDouble();
		}//end while statement
		return userDoubleInput;
		}//end method
	//validating athlete age, height, and weight (used to calculate BMI and MHR) (user story 3)
	public static void getUserStats(java.util.Scanner userInput,int athleteCounter, String athleteFirstNames[], double athleteBMI[], double athleteMHR[]) {
	for (int i=0; i<athleteCounter;i++) {
	System.out.print("\nEnter athlete's first name: ");
    athleteFirstNames[i] = getAthleteNames(userInput);
	int athleteAge=getPositiveInteger(userInput, "enter the age in years:");
	double athleteWeight=getPositiveDouble(userInput, "enter weight in pounds:");
	double athleteHeight=getPositiveDouble(userInput,"enter height in inches");
	athleteBMI[i]=getAthleteBMI(athleteWeight, athleteHeight);
	athleteMHR[i]=getAthleteMHR(athleteAge);
	}//for loop end 
	} //method end 
	//method to enter athlete names 
	public static String getAthleteNames(java.util.Scanner userInput) {
	String athleteName= userInput.next();
	return athleteName;
	}//end method 
	//method to calculate BMI (user story 4)
	public static double getAthleteBMI(double athleteWeight, double athleteHeight) {
	final double bmiConstant=703.00;
	double athleteBMI=(bmiConstant*athleteWeight)/(athleteHeight*athleteHeight);
	return athleteBMI;
	}//end method 
	public static double getAthleteMHR(int athleteAge) {
	final double mhrConstant=220;
	double athleteMHR=mhrConstant-athleteAge;
	return athleteMHR;
	}//end method 
	
	//Method to calculate and store BMI 
}//end class