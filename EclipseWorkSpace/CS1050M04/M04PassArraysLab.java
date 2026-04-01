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
		displayArray(array1);
		System.out.println("Display array2\n");
		displayArray(array2);
		
		array1[1] = 9000;
		array2[3] = 1000;

		System.out.println("Display array1\n");
		displayArray(array1);
		System.out.println("Display array2\n");
		displayArray(array2);

		// Summarize part 1

		// Part 2 Copy Array 1 one element at a time into arrayCopy
		System.out.println("-------- Part 2 Copy with For Loop ---------");

		int[] arrayCopy = new int[4];

		System.out.println("\nreference variable array1 " + array1);
		System.out.println("reference variable arrayCopy " + arrayCopy);

		System.out.println("Display array1\n");
		displayArray(array1);
		System.out.println("Display arrayCopy\n");
		displayArray(arrayCopy);

		for (int i = 0; i < array1.length; i++)
		{
			arrayCopy[i] = array1[i];
		}

		array1[1] = -400;
		arrayCopy[3] = -999;

		System.out.println("\nreference variable array1 " + array1);
		System.out.println("reference variable arrayCopy " + arrayCopy);

		System.out.println("Display array1\n");
		displayArray(array1);
		System.out.println("Display arrayCopy\n");
		displayArray(arrayCopy);

		// Summarize part 2

		// Part 3 Passing array3 into updatePassedArray Method
		System.out.println("-------- Part 3 Pass Arrays---------");

		int[] array3 =
		{ 100, 200, 300, 400 };

		System.out.println("\nreference variable array3 " + array3);

		System.out.println("Display array3\n");
		displayArray(array3);

		updatePassedArray(array3);

		System.out.println("Display array3\n");
		displayArray(array3);

		// summarize Part 3

		// Part 4 Returning arrays from a method
		System.out.println("-------- Part 4 Return Arrays from method---------");

		System.out.println("call createArray method\n");

		int[] array4 = createArray(5);

		System.out.println("after createArray method");
		System.out.println("reference variable array4 " + array4);
		System.out.println("Display array4\n");
		displayArray(array4);

	}// end main

	/*
	 * 
	 */
	public static void updatePassedArray(int passedArray[])
	{
		System.out.println("\n** STACK updatePassedArray method start **");
		System.out.println("passedArray " + passedArray);

		for (int i = 0; i < passedArray.length; i++)
		{

			passedArray[i] = passedArray[i] + 100;
		}

		// Notice you can call a method from with in this method to display passedArray
		displayArray(passedArray);
		System.out.println("** STACK updatePassedArray method end**\n");

	}

	/*
	 * 
	 */
	public static int[] createArray(int arraySize)
	{
		System.out.println("\n** STACK createArray method start** ");

		int[] newArray = new int[arraySize];
		System.out.println("createArray " + newArray);
		for (int i = 0; i < newArray.length; i++)
		{

			newArray[i] = (int) (Math.random() * 10 + 1);
		}
		System.out.println("** STACK createArray method end ** \n");

		return newArray;
	}

	/*
	 * 
	 */
	public static void displayArray(int passedArray[])
	{
		System.out.println("\n** STACK displayArray method start** ");
		System.out.println("passedArray " + passedArray);

		for (int i = 0; i < passedArray.length; i++)
		{

			System.out.printf("array[%d] = %d \n", i, passedArray[i]);
		}
		System.out.println("** STACK displayArray method end** \n");
	}

}// end of class
	