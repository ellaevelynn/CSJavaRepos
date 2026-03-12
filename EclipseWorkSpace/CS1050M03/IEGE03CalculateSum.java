/*
 *  Name: Isabella Eaton
 *  Class: CS1050-004 (T/TH)
 *  Description: Guided Exploration 03     
 *  The program will find the sum of the maximum of two values.
 */
import java.util.Scanner;
public class IEGE03CalculateSum
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a number");
	int numberOne=input.nextInt();
	System.out.println("Please enter another number");
	int numberTwo=input.nextInt();
	System.out.print("the numbers you entered are "+numberOne+" and "+numberTwo);
	//checking that the values were stored properly
	int maximumValue=FindMax(numberOne,numberTwo);
	System.out.print("the maximum value between the two numbers is " + maximumValue);
	
	//method one: determining the maximum value and replacing 
	}//end main method
	public static int FindMax(int numberOne,int numberTwo) {
	int maximumValue=1;
	if (numberOne>numberTwo) {
		maximumValue=numberOne;
	}
		else {
			maximumValue=numberTwo;
		}
		return maximumValue;
	}//end method one: finding max value

	//method two: finding the sum of the maximum value 
	public static int FindSum(int maximumValue) {
	sum=
		return sum;
	}//end method 2 
	
}//end class
