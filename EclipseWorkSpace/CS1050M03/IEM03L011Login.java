
import java.util.Scanner;//for keyboard input later in program
public class IEM03L011Login
{
	public static void main(String[] args)
	{
	//scenario 1: user puts in the correct user name and correct password 
		//storing correct use name and password as strings
	
	String correctStoredUsername="Test";
	String correctStoredPassword="p@$$";
	
	//declaring and initializing password attempts
	String usernameAttempt="test";
	String passwordAttempt="passtest";
	
	Scanner input = new Scanner(System.in);//call scanner for user input 
	
	//replace placeholder string values  for user name and password attempts with user input 
	System.out.println("Enter your username:");
	usernameAttempt= input.next();
	//cant get to password without getting a correct username!
	//for loop not good, not always runnning 3 times/iterations
	//don't have to worry about first 3 scenarios, have to think about algorithm notes 
	//1 thing I need to know in order to repeat
	//need to keep track of attempts (start at 0)
	//every time loop entered ++attempt
	//boolean flag needs to be set to true when all conditions happen
	//start boolean flag at false , then check for username
	//if username else-> error username (sucess false)
	//if username true ->sucess
	//iff psswd else->error 
	// loop while attempt<=3
	//then enter if startement with boolean
	//can exit loop when boolean flag is true for both 
	
	System.out.println("Enter your password:");
	passwordAttempt= input.next();
	
	if ((correctStoredUsername.equals(usernameAttempt))&&(correctStoredPassword.equals(passwordAttempt)))
	{
		System.out.println("Login Succesful! Welcome.");
	}
	else if ((correctStoredPassword.equals(passwordAttempt)&&(correctStoredUsername!=usernameAttempt)))
	{
		System.out.println("Incorrect username entered.");
	}
	else if ((correctStoredUsername.equals(usernameAttempt)&&(correctStoredPassword!=passwordAttempt)))
	{
		System.out.println("Incorrect password entered.");
	}
	else {
		System.out.println("Incorrect login entered.");
		//NEED TO SEPARATE, CANNOT GET TO PASSWORD WITHOUT HAVING A CORRECT USERNAME 
	}
	
	 input.close();

	}//end main

}//end class
