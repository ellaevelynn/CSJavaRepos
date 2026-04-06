/*
 *  Name: Isabella Eaton
 *  Class: CS1050-004 (T/TH)
 *  Description: Guided Exploration 04   
 *  The program will get the final grades and first names of students. Then find the average and display all students that were above the average. 
 */
public class IELabL15ArraysIntro
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
	java.util.Scanner userKeyboardInput = new java.util.Scanner(System.in);
	//1. Declare an array called finalGrades to hold doubles.
	double[] finalGrades;// no memory stored yet or size of array
		
	//2. Declare an array called firstNames to hold Strings.
	String[]firstNames;// no memory stored yet or size of array
		
	//2. Ask the user how many student in the class
	int numberStudents=0;
	System.out.println("Please enter the number of students in your class:");
	numberStudents = userKeyboardInput.nextInt();
		
	//3. Construct the finalGrades and firstNames array using the number of students as the size
	finalGrades=new double [numberStudents];
	firstNames=new String [numberStudents];
		
	//method to pass arrays and scanner to be able to fill in arrays with user input together 
	fillStudentData(firstNames,finalGrades,userKeyboardInput);
	
	
	//getting averages from students (create a method L16 lab)
	double finalGradeAverage=calculateAverage(finalGrades);
	
	//method to display students above average for the final 
	displayAboveAverage(firstNames, finalGrades, finalGradeAverage);
    userKeyboardInput.close();//avoid data leak risk by closing keyboard input 
	}	//end main method  
    
	//4. Create a method to have the user enter each name and finalGrade and store in the parallel arrays. 
		//No need to validate the score range.
		
	public static void fillStudentData(String[] firstNames, double[] grades, java.util.Scanner input) {
	for (int i = 0; i < firstNames.length; i++) {
	System.out.print("\nEnter student first name # " + (i + 1) + ": ");//i + 1 takes into account for index starting at 0 (less confusing for user)
	firstNames[i] = input.next();
	System.out.print("Enter final Grade for " + firstNames[i] + ": ");
	grades[i] = input.nextDouble();
	 }//end for loop
	}//end method

		
	//5&6. Find the sum and average of the final grades. update: create a method for the sum and average
	public static double calculateAverage (double[] finalGrades) {
	double sumFinalGrades=0;
	for (int integerCounter = 0; integerCounter < finalGrades.length; integerCounter++) {
	sumFinalGrades +=finalGrades[integerCounter];
	}
	System.out.println("the sum of final grades is: "+sumFinalGrades );
	double finalGradeAverage= (double)sumFinalGrades/finalGrades.length;
	System.out.println(" the class average for final is: "+finalGradeAverage);
	return finalGradeAverage;
	}
	
	//7. Create a method to display all names and grades of students that scored above the average.
		//Pass the two arrays to the method
	public static void displayAboveAverage (String[] firstNames, double[] finalGrades, double finalGradeAverage) {
	System.out.println("\nStudents who scored above the average:");
	for (int i = 0; i < finalGrades.length; i++) {
	        // Checking if the current student's grade is higher than the average
	if (finalGrades[i] > finalGradeAverage) {
	System.out.println(firstNames[i] + ": " + finalGrades[i]);
	    }// end if statement
	    }//end for loop
	    }	//end method
}//end class

