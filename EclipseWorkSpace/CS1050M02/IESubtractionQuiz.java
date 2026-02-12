/**
 * 
 */

/**
 * 
 */
import java.util.Scanner; 
/*import scanner  before introducing your class always! 
 or else your code will not run.*/

public class IESubtractionQuiz 
{//start class 
  public static void main(String[] args) 
  {// start main 
	  
// 1. Generate two random single-digit integers
    int number1 = (int)(Math.random() * 10); 
    /*casts the random number to an integer so the random number will be
     * a whole value (truncates any existing decimal values)*/
    int number2 = (int)(Math.random() * 10);

    
// 2. If number1 < number2, swap number1 with number2
    if (number1 < number2) {// start of if commands
      int temp = number1; 
      //temp will not exist if n1>n2. the only scope for temp is within these braces
      //Variables remain within their declared braces.
      // create another variable to store the value of number 1 in case it needs to swap places 
      number1 = number2;
      number2 = temp;
      System.out.println("temp value is" +temp);
    }//end of if statement 

 
// 3. Prompt the student to answer "what is number1 – number2?"
    System.out.print
      ("What is " + number1 + " - " + number2 + "? ");
    Scanner input = new Scanner(System.in);
    int answer = input.nextInt();

    // 4. Grade the answer and display the result
    if (number1 - number2 == answer)
      System.out.println("You are correct!");
    else {
      System.out.println("Your answer is wrong.");
      System.out.println(number1 + " - " + number2 + 
        " should be " + (number1 - number2)); 
    }
  }//end main
}//end class 
