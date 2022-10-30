/*Find the longest common prefix in an array of Strings. 
--------------------------------------------------------
So let's say you have string array as below:
String[] strArr={"java2blog","javaworld","javabean","javatemp"};	

So Longest common prefix in above String array will be “java” as all above string starts with “java”.
-----------------------------------------------------------------------------------------------------
Lets take one more example:
String[] strArr={"sqlblog","sql2world","sqlquery","sqlproc"};

So Longest common prefix in the above String array will be “sql” as all above string starts with “sql”.
-------------------------------------------------------------------------------------------------------
*/

package Arrays_Strings_manipulation;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		// Get number of Strings from user
				System.out.print("Enter the number of Strings: ");
				int noOfStrings = sc.nextInt();
		// array declaration
				String[] stringArray = new String[noOfStrings];
				
				if(noOfStrings==0) {
					System.out.println("The array is empty");
				}
				else if(noOfStrings==1) {
		// get array element from user
					System.out.println("Enter the Strings: ");
					for(int i=0; i<noOfStrings; i++) {
						stringArray[i] = sc.next();
					}
					System.out.println(" ");
					
		// print input array
					System.out.println("String array: " + Arrays.toString(stringArray));
					
					System.out.println("Longest commen prefix: " + stringArray[0]);
				}
				else {
		// get array elements from user
					System.out.println("Enter the Strings: ");
					for(int i=0; i<noOfStrings; i++) {
						stringArray[i] = sc.next();
					}
					System.out.println(" ");
					
		// print input array
					System.out.println("String array: " + Arrays.toString(stringArray));
		
				Arrays.sort(stringArray);
				
		// find Longest common prefix		
				int length = stringArray[0].length();
				String LongestCommenPrifix = "";
				for(int i=0; i<length; i++) {
					if(stringArray[0].charAt(i)==stringArray[1].charAt(i)) {
						LongestCommenPrifix = LongestCommenPrifix + stringArray[0].charAt(i);
					}
					else {
						break;
					}
				}
				System.out.println("Longest common prefix in the above String array will be: " + LongestCommenPrifix);
				}
		}
		// catch the NegativeArraySizeException
				catch (NegativeArraySizeException e) {
					System.out.println("");
					System.out.println("Nope! number of Strings must be a positive value");
					System.out.println("Please try again");
				}
		// catch the InputMismatchException 
				catch (InputMismatchException e) {
					System.out.println("");
					System.out.println("Nope! number of Strings must be an integer");
					System.out.println("Please try again");
				}
	}
}
