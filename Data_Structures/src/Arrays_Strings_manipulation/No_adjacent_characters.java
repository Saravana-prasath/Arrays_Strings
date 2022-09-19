// Method 2

/* You are given a string containing characters A and B only.
 * Your task is to change it into a string such that there are no matching adjacent characters.
 * To do this, you are allowed to delete zero or more characters in the string.
 * Your task is to find the minimum number of required deletions.
 */

/*Sample Input :
	5
	AAAA
	BBBBB
	ABABABAB
	BABABA
	AAABBB
Sample Output :
	3
	4
	0
	0
	4
*/

package Arrays_Strings_manipulation;

import java.util.Arrays;
import java.util.Scanner;

public class No_adjacent_characters {

	public static void main(String[] args) {
		// try to find any exception 
		try {
			Scanner sc = new Scanner(System.in);
			// Get array size from user
					System.out.print("Enter the Array size: ");
					int arraySize = sc.nextInt();
					
					if(arraySize==0) {
						System.out.println("The array is empty, Please put some values");
					}
					else {
			// array declaration
					String[] inputArray = new String[arraySize];
					
			// get array elements from user
					System.out.println("Enter the array elements: ");
					for(int i=0; i<arraySize; i++) {
						inputArray[i] = sc.next();
					}
					System.out.println(" ");
					
			// print input array
					System.out.println("Input array: " + Arrays.toString(inputArray));
					
			// convert elements from string to array
					System.out.println(" ");
					System.out.println("No.of deletions required: ");
					for(int i=0; i<arraySize; i++) {
						int stringLength = inputArray[i].length();
						int count=0;
						for(int j=0; j<stringLength-1; j++) {
							if(inputArray[i].charAt(j) == inputArray[i].charAt(j+1)) {
								count++;
							}
						}
						System.out.println(count);
					}
					}
		}
// catch the NegativeArraySizeException 
		catch (NegativeArraySizeException e) {
			System.out.println("");
			System.out.println("Nope! Array size have only positive value");
			System.out.println("Please try again");
		}
			
		}
}