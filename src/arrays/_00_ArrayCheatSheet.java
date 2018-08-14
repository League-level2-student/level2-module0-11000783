package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String names[] = new String[5];
		names[0] = "jeff";
		names[1] = "sara";
		names[2] = "jeffery";
		names[3] = "ellie";
		names[4] = "henery";
		// 2. print the third element in the array
 System.out.println(names[names.length - 2]);
		// 3. set the third element to a different value

		// 4. print the third element again

		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			// System.out.println(names[i]);

		}
		// 6. make an array of 50 integers
		int ages[] = new int[50];
		int smallest = 0;
		// 7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();

		for (int i = 0; i < ages.length; i++) {
			ages[i] = rand.nextInt(50);
			if (ages[i] > smallest) {
				smallest = ages[i];
			}

		}
		System.out.println(smallest);
		// 8. without printing the entire array, print only the smallest number in the
		// array

		// 9 print the entire array to see if step 8 was correct

		// 10. print the largest number in the array.
	}
}
