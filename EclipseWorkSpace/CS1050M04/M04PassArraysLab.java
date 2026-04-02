/*
 * Add comments to the code
 */

public class M04PassArraysLab
{
	public static void main(String[] args)
	{

		// Part 1: explore assigning one array to another
		System.out.println("-------- Part 1 Assign an array to another array ---------");
		// explain what is happening

		System.out.println("Declare and initialize array1 and array2");
		int[] array1 =
		{ 10, 2, 45, 12 };//array 1 has been declared as a 4-entry long array with the data type of integer
		int[] array2 = new int[4]; //array 2 has been created as a int array with 4 entries, these 4 entries have not been defined.
		//because the entries have not been defined yet for array2, the default values are 0 for each of the 4 array indices.

		System.out.println("reference variable array1 " + array1); //displays the reference to memory location where the data is stored
		System.out.println("reference variable array2 " + array2);//displays the reference to memory location where the data is stored, not the values themselves
		//to see actual array contents, you must use traverse the array through a loop.
		
		
		array2[0] = 1;// setting the first index value to 1 in array2, stored in memory
		array2[1] = 112; //setting the second index value to 112 in array2, stored in memory
		array2[2] = 82; //setting the third index value to 82 in array2, stored in memory

		System.out.println("Display array1\n");
		displayArray(array1);//calls method displAyarray using the index inputs for array1
		System.out.println("Display array2\n");
		displayArray(array2);//calls method displAyarray using the input of the entries of array2
		
		array1[1] = 9000; //changes second index of array 1 to value 9000 from 112
		array2[3] = 1000;//changes fourth index of array 3 to 1000 from 0

		System.out.println("Display array1\n");
		displayArray(array1);//follows method for displayArray again, method uses updated array1
		System.out.println("Display array2\n");
		displayArray(array2);//follows method for displayArray again, method uses updated array2

		// Summarize part 1
		//part one declares and creates array 1 and array 2, then uses the methods displayArray to print out the entries of each array and their index location.

		// Part 2 Copy Array 1 one element at a time into arrayCopy
		System.out.println("-------- Part 2 Copy with For Loop ---------");

		int[] arrayCopy = new int[4];//declares and creates a 4 entry long int array called arrayCopy. default value for array is 0000

		System.out.println("\nreference variable array1 " + array1); //shows reference code for this variable
		System.out.println("reference variable arrayCopy " + arrayCopy); //shows reference memory for this variable

		System.out.println("Display array1\n");
		displayArray(array1);//uses displayArray method to print out index locations and values for each entry of this array
		System.out.println("Display arrayCopy\n");
		displayArray(arrayCopy);//uses displayArray method to print out index locations and values for each entry of this array


		for (int i = 0; i < array1.length; i++) //uses array 1, starts at the first index value and completes once it reaches the end of the array.
		{
			arrayCopy[i] = array1[i];//each entry for array copy will be assigned the entries of array1 at their shared indices.
		}

		array1[1] = -400;//after completing the for loop, array 1 is then altered at the second index
		arrayCopy[3] = -999;//after completing the for loop, the 4th index entry of this array is altered

		System.out.println("\nreference variable array1 " + array1);//shows reference memory for this variable
		System.out.println("reference variable arrayCopy " + arrayCopy);//shows reference memory for this variable

		System.out.println("Display array1\n");
		displayArray(array1);//uses displayArray method to print out index locations and values for each entry of this array
		System.out.println("Display arrayCopy\n");
		displayArray(arrayCopy);//uses displayArray method to print out index locations and values for each entry of this array

		// Summarize part 2
		//part two creates a new array called copyArray that starts out as an array of default values, it then goes thorugh a for loop where each index value of the new array is assigned the same values that are in array1. FInally, array1 and arrayCopy receive edits to their entries after completing the for loop

		// Part 3 Passing array3 into updatePassedArray Method
		System.out.println("-------- Part 3 Pass Arrays---------");

		int[] array3 =
		{ 100, 200, 300, 400 };//array 3 is declared and created with non-default values.

		System.out.println("\nreference variable array3 " + array3);

		System.out.println("Display array3\n");
		displayArray(array3);//displayArraymethod used again

		updatePassedArray(array3);//different method referenced using entries of array3

		System.out.println("Display array3\n");
		displayArray(array3);

		// summarize Part 3

		// Part 4 Returning arrays from a method
		System.out.println("-------- Part 4 Return Arrays from method---------");

		System.out.println("call createArray method\n");

		int[] array4 = createArray(5);//new array is declared and created with default values, it is 5 entries long.

		System.out.println("after createArray method");
		System.out.println("reference variable array4 " + array4);
		System.out.println("Display array4\n");
		displayArray(array4);

	}// end main

	/*
	 * 
	 */
	public static void updatePassedArray(int passedArray[])//void, returns nothing to main
	{
		System.out.println("\n** STACK updatePassedArray method start **");//prints before method continues
		System.out.println("passedArray " + passedArray);

		for (int i = 0; i < passedArray.length; i++)//follows the array specified in main when referencing the method, goes from fromt to end of array.
		{

			passedArray[i] = passedArray[i] + 100;//for each index entry of the array, it adds 100 to whatever value is at that index for the array, because method is void, these changed index values only occur in this method, it is not returned back to the array in main

		}

		// Notice you can call a method from with in this method to display passedArray
		displayArray(passedArray);//the updated array is displayed, but not saved to main, the array is only changed in this one instance, and then memory is removed.
		System.out.println("** STACK updatePassedArray method end**\n");

	}//end method

	/*
	 * 
	 */
	public static int[] createArray(int arraySize)//returns an int
	{
		System.out.println("\n** STACK createArray method start** ");

		int[] newArray = new int[arraySize];//declares and creates an array of the size that is input in the method parameters
		System.out.println("createArray " + newArray);
		for (int i = 0; i < newArray.length; i++)//then follows a loop that assigns random values multiplied by 10 and +1 for each index of the created array
		{

			newArray[i] = (int) (Math.random() * 10 + 1);
		}
		System.out.println("** STACK createArray method end ** \n");

		return newArray;//returns new array to main, returns index entries for the array to main.
	}//end method

	/*
	 * 
	 */
	public static void displayArray(int passedArray[])//void means it returns nothing to main, uses array defined and stored in main
	{
		System.out.println("\n** STACK displayArray method start** ");//prints this message first every time this method is called
		System.out.println("passedArray " + passedArray);//prints the reference code to the memory of this array

		for (int i = 0; i < passedArray.length; i++)// start at the beginning of the array index and loop ends when it reaches the last index
		{

			System.out.printf("array[%d] = %d \n", i, passedArray[i]); //prints index location and the number stored at that location
		}
		System.out.println("** STACK displayArray method end** \n");//signals that the method has ended, returns back to main method. does not return anything, only prints and returns to the main method.
	}//end method

}// end of class
	