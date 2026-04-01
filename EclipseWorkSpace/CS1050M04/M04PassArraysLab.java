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
	
	
	
	}
}