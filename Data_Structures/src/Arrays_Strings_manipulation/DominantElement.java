/*You are given an array A of length N. An element X is said to be dominant 
 *if the frequency of X in A is strictly greater than the frequency of any other element in the A.

For example, if 
A = [2, 1, 4, 4, 4] then 
4 is a dominant element since its frequency is higher than the frequency of any other element in A.
Find if there exists any dominant element in A. Print YES if there exists any dominant element in A. 
Otherwise, print NO.
--------------------------------------------------------------------------------------------------
Sample Input :
6 
1 1 2 2 3 4
Output : 
NO (No dominant element. Elements 1 and 2 has same frequency.)
-----------------------------------------------------------------.
Sample Input :
5 
2 2 2 2 2
Output :
YES  (2 is the dominant element.)
------------------------------------------------------------------
Sample Input :
4 
1 2 3 4
Output :
NO (There does not exist any dominant element.)
------------------------------------------------------------------*/

package Arrays_Strings_manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DominantElement {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		// Get array size from user
				System.out.print("Enter the Array size: ");
				int arraySize = sc.nextInt();
				
				if(arraySize==0) {
					System.out.println("Array is empty, Please put values");
				}
				else if(arraySize==1) {
					System.out.println("Only one element in an array");
				}
				else {
		// array declaration
				int[] inputArray = new int[arraySize];
				ArrayList<Integer> answerArray = new ArrayList<Integer>();
				
		// get array elements from user
				System.out.println("Enter the values: ");
				for(int i=0; i<arraySize; i++) {
					inputArray[i] = sc.nextInt();
				}
				System.out.println(" ");
				
		// print input array
				System.out.println("Input array: " + Arrays.toString(inputArray));
				
		// sort array
				Arrays.sort(inputArray);
				//System.out.println("Sorted array: " + Arrays.toString(inputArray));
				
	    // Logic
				int i,j;
				int length = inputArray.length;
				for(i=0; i<length; ) {
					int count = 0;
					for(j=i; j<length; j++) {
						if(inputArray[i] == inputArray[j]) {
							count++;
						}
						else {
							break;
						}
					}
					answerArray.add(count);
					i = j;
				}
				Collections.sort(answerArray);
				//System.out.println(answerArray);
				
				if(answerArray.size() == 1) {
					System.out.println("YES");
				}
				else {
					if(answerArray.get(answerArray.size()-1) == answerArray.get(answerArray.size()-2) ) {
						System.out.println("NO");
					}
					else {
						System.out.println("YES");
					}
				}		
				}
		}
// catch the NegativeArraySizeException
		catch (NegativeArraySizeException e) {
			System.out.println("");
			System.out.println("Nope! Array size should have only positive value");
			System.out.println("Please try again");
		}
// catch the InputMismatchException 
		catch (InputMismatchException e) {
			System.out.println("");
			System.out.println("Nope! Array size must be an integer");
			System.out.println("Please try again");
		}
	}
}
