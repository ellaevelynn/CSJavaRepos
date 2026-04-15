
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
		displayProgramOverview();
	
	//User Story 2: Specify number of athletes.
		String questionPrompt="placeholder"; //to adapt text prompts in various methods
		int athleteCount=getPositiveInteger(userInput,"\nEnter the number of athletes on the team:");
	//declare length of arrays:
		athleteFirstNames=new String[athleteCount];
		athleteBMI=new double [athleteCount];
		athleteMHR= new double[athleteCount];
		
	//user story 3: validate age, weight, and height.
		getUserStats(userInput, athleteCount, athleteFirstNames, athleteBMI, athleteMHR);
		//User story 4: calculate BMI (method created and called in getStatsmethod)
		//User story 5: Calculate MHR (method created and called within getStats method)
		
	//User story 6: display athlete BMI value, category, and MHR.
		System.out.println("Team Summary");
	for (int i=0; i<athleteCount;i++) {
		System.out.println(athleteFirstNames[i]);
		System.out.println("BMI: "+ String.format("%.1f", athleteBMI[i]));
		String bmiCategory=getBMICategory(athleteBMI[i]);
		System.out.println("Category: " +bmiCategory);
		System.out.println("MHR: " +athleteMHR[i]);
		}//end loop
	
	//User story 7: List all athletes outside of normal BMI Range.
	getBMIOutliers(athleteCount, athleteBMI, athleteFirstNames);
	
	//user story 8: calculate and display average MHR.
	getAverage(athleteMHR,athleteCount, "\nAverage max heart rate is: ");
	
	//user story 9: identify athlete with highest max HR.
	findMaxIndex(athleteMHR,athleteFirstNames,athleteCount," has the highest max heart rate of: ");
		//user story 10: list all the athletes above or equal to max HR (method called in user story 9 findMaxIndex)
	
	
	//user story 11: calculate and display training HR (if user requests to).
	}//end main
	
	
	//method to display program overview (called in user story 1).
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

	//Method to validate integer input (called in user story 2,3).
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
	
	//Method to validate double input (called in user story 3).
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
	
	//validating athlete age, height, and weight (used to calculate BMI and MHR) (called in user story 3).
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
	
	//method to enter athlete names (called in user story 3).
	public static String getAthleteNames(java.util.Scanner userInput) {
		String athleteName= userInput.next();
		return athleteName;
	}//end method 
	
	//method to calculate BMI (called in user story 4).
	public static double getAthleteBMI(double athleteWeight, double athleteHeight) {
		final double bmiConstant=703.00;
		double athleteBMI=(bmiConstant*athleteWeight)/(athleteHeight*athleteHeight);
		return athleteBMI;
		}//end method 
	//method to calculate MHR (called in user story 5).
	public static double getAthleteMHR(int athleteAge) {
		final double mhrConstant=220;
		double athleteMHR=mhrConstant-athleteAge;
		return athleteMHR;
		}//end method 
	
	//method to determine athlete category (called in user story 6).
	public static String getBMICategory(double bmi) {
		String bmiCategory="Placeholder";
		if (bmi >= 30.0){
			bmiCategory = "High";
		} else if (bmi>= 18.5){
			bmiCategory = "Normal";
		} else {
			bmiCategory = "Underweight";
		} 
		return bmiCategory;
	}//end method 
	
	//method to obtain BMI outliers (called in user story 7).
	public static void getBMIOutliers(int athleteCount,double athleteBMI[], String athleteFirstNames[]) {
		final double minNormalBMI=18.50;
		final double maxNormalBMI=29.9;
		boolean foundAbove=false;
		boolean foundBelow=false;
		
		for (int i = 0; i < athleteCount; i++) {
	        if (athleteBMI[i] > maxNormalBMI) {
	        	if(foundAbove==false) {
	        		System.out.println("Athletes above normal BMI: ");
	        	}//end foundABove if statement 
	         System.out.println(athleteFirstNames[i]);
	         foundAbove = true;
	        }//end athleteBMI if statement
	    }//end for loop
		for (int i = 0; i < athleteCount; i++) {
	        if (athleteBMI[i] < minNormalBMI) {
	        	if(foundBelow==false) {
	        		System.out.println("Athletes below normal BMI: ");
	        	}//end if statement
	         System.out.println(athleteFirstNames[i]);
	         foundBelow = true;
	        }//end if statement
		}//end for loop
	    if(foundAbove==false && foundBelow==false) {
	    	System.out.println("No athletes outside of normal range.");
	    }//end if statement
	}//end method 
	
	//general method to calculate average (called in user story 8).
	public static void getAverage(double athleteMHR[],int athleteCount,String questionPrompt) {
	double sumMHR=0;
	for (int index = 0; index < athleteCount; index++) {
	    sumMHR= sumMHR+athleteMHR[index];
	    }// end for loop
	double calculatedAverage=sumMHR/athleteCount;
	System.out.println(questionPrompt + calculatedAverage);
	}//end method 
	
	// method to identify the location of a maximum value, then display the maximum value and the athlete associated (user story 9)
	public static void findMaxIndex(double[]athleteMHR,String athleteFirstNames[], int athleteCount,String questionPrompt){
	int maxIndex=0;
	double maxValue=athleteMHR[0];
		for(int index=1; index<athleteCount; index ++){
		if(maxValue<athleteMHR[index]){
		maxValue=athleteMHR[index];
		maxIndex=index;
		}
		}
		System.out.println(athleteFirstNames[maxIndex]+questionPrompt+maxValue);
		listAboveOrEqual(maxValue,athleteFirstNames,athleteCount, "Athletes above or equal to MHR: ");
	}//end method
	
	//method to list athletes above or equal to a value (user story 10)
	public static void listAboveOrEqual(int athleteCount, double maxValue,double athleteMHR[], String athleteFirstNames[], String questionPrompt) {
	System.out.println(questionPrompt);
	for (int i=0;i<athleteCount;i++) {
	if (athleteMHR[i]>=maxValue) {
	System.out.println(athleteFirstNames[i]);
	}//end if statement
	}//end for loop
	}//end method
	
	
	
	
}//end class