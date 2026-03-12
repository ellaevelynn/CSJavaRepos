import java.util.Arrays;

public class LabL15ArraysIntro
{//start class

	public static void main(String[] args)
	{//start main

//Declare an array called finalGrades to hold doubles 
		double[] finalGrades;
//Declare an array called firstNames to hold Strings.
		String[] firstNames;
//ask the user how many students are in the class
	java.util.Scanner input = new java.util.Scanner(System.in);
	System.out.println("enter the number of students in the class");
	int numberStudents = input.nextInt();
	System.out.println("You have "+numberStudents+" students in your class.");

//construct finalGrades and firstNames array using the number of students as the size 
	finalGrades = new double[numberStudents];
	firstNames = new String[numberStudents];
//Create a loop to have the user enter each name and finalGrade and store in the parallel arrays. 
// No need to validate the score range.
// Enter the names for students. print names to double check for accuracy
	System.out.println("Enter the first names of each student in your class ");
	for (int index = 0; index < numberStudents; index++) {//start loop
      firstNames[index] = input.next();
    }//end loop
	System.out.println("the students you entered are: " +Arrays.toString(firstNames));
//Enter grades for each student. print grades to check for accuracy
	System.out.println("Now, enter the grades for each student in your class");
	for (int index = 0; index < numberStudents; index++) {//start loop
		System.out.println("Enter the final grade for: "+firstNames[index]);
	      finalGrades[index] = input.nextDouble();
	}//end loop
	System.out.println("the grades for  " +Arrays.toString(firstNames)+ " are "+Arrays.toString(finalGrades));

//Create a loop to find the sum of the final grades.
	double sumGrades=0;
	for (int index = 0; index < numberStudents; index++) {
	    sumGrades= sumGrades+finalGrades[index];
	    }
	System.out.println("sum is " + sumGrades); //test for accuracy in adding all grade scores up
	
//Find the average of the final grades.
	double averageGrade = sumGrades / numberStudents;
	System.out.println("class average is " + averageGrade);
//Create a method to display all names and grades of students that scored above the average.
//Pass the two arrays to the method

	}//end main

}//end class
