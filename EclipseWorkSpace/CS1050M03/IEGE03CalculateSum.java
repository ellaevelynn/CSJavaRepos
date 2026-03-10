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
	final double sumOfMaxValues=sum(Max(numberOne,numberTwo));
	}//end main
	public static double Max (double numberOne, double numberTwo) {
	double result;

	if (numberOne > numberTwo) {
	      result = numberOne;
	    }
	    else  { 
	      result = numberTwo;
	   }
	    return result; // 
	}//end max
	
	
}//end class 
