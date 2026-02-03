/*
 *  Name: Isabella Eaton
 *  Class: CS1050-004 (T/TH)
 *  Description: GEM01 2.2 (Calculate Grades)    
 *  The program will calculate a final grade for this class based on the category weights 
 */

public class CalculateGrade
{
	public static void main(String[] args)
	{
		
	final double CLASS_PART_WT =0.15;
	double classPartGrade=95;
	final double CLASS_EXPLORE_WT =0.20;
	double classExploreGrade=92;
	final double CLASS_QUIZZ_WT =0.25;
	double classQuizzGrade=88;
	final double CLASS_PROJECT_WT =0.20;
	double classProjectGrade=93;
	
	double pointsObtained= 
			(classPartGrade*CLASS_PART_WT)
			+ (classExploreGrade*CLASS_EXPLORE_WT)
			+ (classQuizzGrade*CLASS_QUIZZ_WT)
			+(classProjectGrade*CLASS_PROJECT_WT);
	double gradeScorePercent = pointsObtained /(double)100;
	System.out.println("Total Points Achieved: " + pointsObtained);
	System.out.println("Current Score " + gradeScorePercent);
	
	}//end main

}//end class
