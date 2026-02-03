/**
 * 
 */

/**
 * 
 */
public class AverageScores
{
	public static void main(String[] args)
	{
       int score1 = 80;
//assigns the integer variable score1 the value of 80       
       int score2 = 97;
//assigns the integer variable score1 the value of 97 
       int score3 = 85;
//assigns the integer variable score1 the value of 85
       int total = score1 + score2 + score3;
//adds up the three variables of scores = 262 (prediction)
//this is stored as an integer
       double average = total /(double)3;
//takes the total and divides by 3, stores this value as a double 
//results 87.33 (prediction)
//issue: dividing integers, the remainder is dropped, then it is stored as a double 
//how do we fix, need to make one value a double. either cast total OR 3 as a double 
//change 3 to 3.0, OR can explicitly cast if its a variable (double)3 
//ONLY do this during an operation
       System.out.println("Total: " + total);
       System.out.println("Average " + average);
// prints out total 262 and average 87.33
	}//end of main
}//end of class
