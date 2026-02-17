/**
 * 
 */

/** This program creates a short Mad Lib story 
 */
import java.util.Scanner; //allows scanner to be used in program
public class IEMGE02MathCharsStrings
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// declare and initialize string variables that will later be edited when your program is ran
		 String firstName="name";
		 String lastName ="last";
		 String nounAny= "noun";
		 String ingVerb="verb";
		 String adjectiveAny="adjective";
		 String placeAny="place";
		 String favoriteLetter="A";
		
		// incorperate scanner so that keyboard inputs can be used 
		 Scanner input = new Scanner(System.in); //call scanner to use keyboard inputs 
		 
		//fill-in-the-blank for your MadLib, replace initial values for variables with keyboard inputs
		 System.out.println("Let's create a MadLib!");
		 System.out.println("Enter a first name:");
		 firstName = input.next();
		 System.out.println("Enter a last name:");
		 lastName = input.next();
		//extract first character of the name and store it as a char 
		 char lastInitial = lastName.charAt(0);
		 
		 System.out.println("Enter a noun (a person, place or thing):");
		 nounAny = input.next();
		 System.out.println("Enter a verb (action word) ending in -ing:");
		 ingVerb = input.next();
		 System.out.println("Enter an adjective (a descriptive word):");
		 adjectiveAny = input.next();
		 System.out.println("Enter a place:");
		 placeAny = input.next();
		 System.out.println("Enter your favorite letter:");
		 favoriteLetter = input.next();
		 
		
		//Print the final completed  MadLib 
		 String summary = "Once upon a time " + firstName + " " + lastInitial + " was "
		 		+ ingVerb+" through the "+ placeAny+ " with a "+ nounAny+". "+ "It was a very "
				 +adjectiveAny+ " day. Their favorite letter was "+ favoriteLetter +".";
		 System.out.println(summary);
		 input.close();	

	}

}
