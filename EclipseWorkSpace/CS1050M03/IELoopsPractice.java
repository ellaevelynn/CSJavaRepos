/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class IELoopsPractice
{
	public static void main(String[] args)
	{
		int positiveValue= 1;	
		Scanner input = new Scanner(System.in);
		System.out.println("enter a positive number");
		positiveValue = positiveValue.nextInt();
		while (positiveValue <=0.0)
		{
			System.out.println("error: your number is too low!");
			System.out.println("enter a positive number");
			positiveValue = positiveValue.nextInt();
		}
		System.out.println("the exponent is:"+positiveValue);
		
}
	
}

