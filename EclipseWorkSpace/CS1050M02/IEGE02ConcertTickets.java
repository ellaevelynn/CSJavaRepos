/*
 *  Name: Isabella Eaton
 *  Class: CS1050-004 (T/TH)
 *  Description: Guided Exploration 02     
 *  The program will produce the cost of your selected seat for a concert given the section and seat number.
 */
import java.util.Scanner;
public class IEGE02ConcertTickets
{
	public static void main(String[] args)
	{
		//step 1: prompt the user for a character representing seating section.
		int seatCost=100;
		char seatingAssignment='C';
		Scanner input = new Scanner(System.in);//call in scanner for keyboard input
		System.out.println("see the section cost for your concert.");
		System.out.println("Enter your seating section (F-front, C-center, S-side, U-upper):");
		seatingAssignment=input.next().charAt(0);
	
		//step 2: make sure seating assignments are capitalized.
		//step 4" after section character is read and verified, display section information
		if (seatingAssignment=='f') {
		seatingAssignment=Character.toUpperCase(seatingAssignment);
		System.out.println("Selected Front Section");
		}
		else if (seatingAssignment=='c') {
		seatingAssignment=Character.toUpperCase('C');
		System.out.println("Selected Center Section");
		}
		else if (seatingAssignment=='s') {
		seatingAssignment=Character.toUpperCase('S');
		System.out.println("Selected Side Section");
		}
		else if (seatingAssignment=='u') {
		seatingAssignment=Character.toUpperCase('U');
		System.out.println("Selected Upper Section");
		}
		//step 3: if an invalid entry is entered, quit program
		else {
			System.out.println("Invalid selection, session ending.");
		}
		// step 5:prompt the user for seat number, quit program if an invalid seating number is entered (outside of 1-60)
		//step 6: assign the correct pricing to the seating assignments.
		Scanner seatingNumberInput = new Scanner(System.in);
		System.out.println("Enter your seat number");
		int seatNumber=seatingNumberInput.nextInt();
		if ((seatNumber>=1)&&(seatNumber<=15)){
			System.out.println("Row 1-15 cost is $450");
			seatCost=450;
		}
		else if ((seatNumber>=16)&&(seatNumber<=30)) {
			System.out.println("Row 16-30 cost is $300");
			seatCost=300;
		}
		else if ((seatNumber>=31)&&(seatNumber<=60)) {
			System.out.println("Row 31-60 cost is $200");
			seatCost=200;
		}
		else {
			System.out.println("Invalid selection, session ending.");
		}
		//step 7: produce final output
		System.out.println("The cost of section "+seatingAssignment+ " seat "+seatNumber+ " is " +"$"+ seatCost+".");
		seatingNumberInput.close();
		input.close();
	}//end class
}// end main

