/**
 * 
 */

/**
 * 
 */
import java.util.Scanner; //allows scanner to be used in program
public class L06MathCharStrings
{
	
	public static void main(String[] args)
	{
		//exercise 1
// What is happening for each line?
double randomDouble = Math.random();
//produce random double value 
int randomInt = (int) Math.random();
//produce random integer/ turn random value into an integer
randomInt = (int) (Math.random() * 10);
//random value *10, truncate decimal to make integer 
randomInt = (int) (Math.random() * 10 + 1);
//random value *10+1 , truncate decimal to make integer
	//exercise 2 
char charTest= 'a';
int charAsciiValue= (int)charTest;
String firstName = "Herbierto";
System.out.printf("char: %c ascii value: %d \n", charTest, charAsciiValue);
//when using printf: save space and put variables in after the strong 
//println: variables can catinate 
//prinitive vs non primitive
		//Exercise 3 
System.out.println("Hello " + firstName);
int stringLength = firstName.length();
char firstInitial = firstName.charAt(0);
char lastCharacter=firstName.charAt((firstName.length()-1));
System.out.println(lastCharacter);
//alternative method 
char lastLetter= firstName.charAt(stringLength-1);
// Last class example (stopped here, add more comments)
Scanner input = new Scanner(System.in);
System.out.println(lastLetter);
System.out.println("Enter first name");
firstName = input.next();
System.out.println("First name " + firstName);
System.out.println("Enter the initial of your last name");
char lastInitial = input.next().charAt(0);
String summary = "Hello " + firstName + " " + lastInitial + ".";
System.out.println(summary);
input.close();	
	}

}
