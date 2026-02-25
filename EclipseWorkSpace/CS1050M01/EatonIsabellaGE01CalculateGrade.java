/*
 *  Name: Isabella Eaton
 *  Class: CS1050-004 (T/TH)
 *  Description: Guided Exploration 01 (Calculate Grades)    
 *  The program will calculate a final grade for this class based on the category weights 
 */

import java.util.Scanner; //import the scanner class for later use.

public class EatonIsabellaGE01CalculateGrade
{ //start of class EatonIsabellaGE01CalculateGrade
	
	public static void main(String[] args)
	{ //start of method "main"
//initialize each constant (grade category weights) as a double.
//assign the correct weight to each grading category.
	final double CLASS_PART_WT =0.15;
	final double CLASS_EXPLORE_WT =0.20;
	final double CLASS_QUIZZ_WT = 0.25;
	final double CLASS_PROJECT_WT =0.20;
	final double FINAL_DEMO= 0.20;
//initialize each variable (points obtained in each grading category) as a double.
//Initially assigning all points obtained for each grading category to 0 as you will change;
//your points obtained throughout the semester.
	double classPartGrade=0;
	double classExploreGrade=0;
	double classQuizzGrade=0;
	double classProjectGrade=0;
	double finalDemo=0;
//scanner is a class used to obtain user inputs. 
//create the scanner object and assign to the variable keyboardInput
//read user input for points obtained in each grading category and assign the user input to the correct variable for each entry;
// (the user is asked to enter points obtained for each grading category)
	
	Scanner keyboardInput = new Scanner(System.in);
	System.out.print("\nEnter your score for class participation: ");
	classPartGrade = keyboardInput.nextInt();// score entered: 95
	System.out.print("\nEnter your score for guided explorations: ");
	classExploreGrade = keyboardInput.nextInt();// score entered: 92
	System.out.print("\nEnter your score for quizzes: ");
	classQuizzGrade = keyboardInput.nextInt();// score entered: 88
	System.out.print("\nEnter your score for projects: ");
	classProjectGrade = keyboardInput.nextInt();// score entered: 87
	System.out.print("\nEnter your score for your final demonstration: ");
	finalDemo = keyboardInput.nextInt();// score entered: 93
//initialize the double variable pointsObtained.
//the value pointsObtained will be assigned is the sum of the updated user input for each grading category multiplied by their category weights.
	double pointsObtained= 
			+(classPartGrade*CLASS_PART_WT)
			+ (classExploreGrade*CLASS_EXPLORE_WT)
			+ (classQuizzGrade*CLASS_QUIZZ_WT)
			+(classProjectGrade*CLASS_PROJECT_WT)
			+(finalDemo*FINAL_DEMO);
//print/display your resulting grade derived from the sum of points obtained input multiplied by its correlated weight.
	System.out.println("Isabella E, your current grade is " + pointsObtained + " percent.");
	//output:Isabella E, your current grade is 90.65 percent.
	
//2/11 in class exercise, print letter grade 

	if (pointsObtained >= 90)
	{ System.out.println("Isabella E, you have an A");}
	else if (pointsObtained >= 80)
	{ System.out.println("Isabella E, you have a B");}
	else if (pointsObtained >= 70)
	{ System.out.println("Isabella E, you have a C");}
	else if (pointsObtained >= 60)
	{ System.out.println("Isabella E, you have a D");}
	else if (pointsObtained >= 0)
	{ System.out.println("Isabella E, you have a F");}
	
	
	 keyboardInput.close(); 
//close the scanner class to prevent data warning message.
//NOTE: you will have to restart the code any time you edit your grade as the scanner class will have to be initialized again.
	}//end main
}//end class GE01
