
import java.util.Scanner;//for keyboard input later in program
public class IEM03L011Login
{
	public static void main(String[] args)
	{
	//scenario 1: user puts in the correct user name and correct password 
		//storing correct use name and password as strings
		final String CORRECT_USERNAME = "Test";
		final String CORRECT_PASSWORD = "p@$$";
		
		Scanner input = new Scanner(System.in);
		boolean loggedIn = false; // boolean flag
		int loginAttempts=0; //storing login attempts
		
		System.out.println("Enter username and password to log in securely.");
		do{
			System.out.print("Enter username: ");
			String username = input.nextLine().trim();
			if (username.equals(CORRECT_USERNAME)){
				System.out.println("Correct username.");
				System.out.print("Enter password: ");
				String password = input.next();
			//gets username correct, moved on to prompt for password.
				if (password.equals(CORRECT_PASSWORD)){
					System.out.println("Login successful! Welcome.");
					loggedIn = true; // set flag to exit loop
				} else{
					System.out.println("Incorrect password.");
					loginAttempts++;
				}
			} else{
				System.out.println("Incorrect username");
				loginAttempts++;
			}
		} while (loggedIn == false && loginAttempts <3);
		if (loginAttempts>=3) {
			System.out.println("You are locked out.");
		}
		input.close();
	
	}//end main

}//end class
