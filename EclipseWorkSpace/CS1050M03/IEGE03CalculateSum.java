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
	double numberOne=input.nextDouble();
	System.out.println("Please enter another number");
	double numberTwo=input.nextDouble();
	double maxValue=CalculateMaxValue(numberOne,numberTwo);
	double totalSum=CalculateSum(maxValue);
	System.out.println("The sum of the maximum value "+maxValue+"is "+ totalSum);
	}//end main
	
	
	public static double CalculateMaxValue (double numberOne, double numberTwo) {
	double maxValue;
	//determine which is the maximum value
	if (numberOne > numberTwo) {
	      maxValue = numberOne;
	    }
	    else  { 
	      maxValue = numberTwo;
	   }
	return maxValue;
	} //end method one 
	//method 2 calculate sum 
	public static double CalculateSum (double maxValue) {
	int loopCounter=1;
	while (loopCounter<= maxValue) {
		maxValue= maxValue+loopCounter;
		loopCounter++;
	}
	    return maxValue; // 
	}//end method
	
}//end class 
