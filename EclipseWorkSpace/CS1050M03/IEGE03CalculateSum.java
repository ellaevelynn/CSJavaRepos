/*
 *  Name: Isabella Eaton
 *  Class: CS1050-004 (T/TH)
 *  Description: Guided Exploration 03     
 *  The program will find the sum of the maximum of two values.
 */
import java.awt.im.spi.InputMethodDescriptor;
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
	System.out.println("the numbers you entered are "+numberOne+" and "+numberTwo);
	//checking that the values were stored properly
	int maximumValue=FindMax(numberOne,numberTwo);
	System.out.println("the maximum value between the two numbers is " + maximumValue);
	int sumMaxValue=CalculateSum(maximumValue);
	System.out.println("the sum of " + maximumValue+" is "+ sumMaxValue);
	input.close();
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
	public static int CalculateSum(int maximumValue) {
	int sumMaxValue=0;
	for (int integerCounter = 0; integerCounter <= maximumValue; integerCounter++) {
			      sumMaxValue = sumMaxValue+ integerCounter;
			    }
		return sumMaxValue;
	}//end method 2 
	
}//end class
