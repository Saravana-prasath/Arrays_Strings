/* Given an array of integers represents the daily temperatures,
 * return an array answer such that answer[i] is the number of days
 * you have to wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
 -------------------------------------
Example 1:
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
-------------------------------------------
Example 2:
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
----------------------------------------------
Example 3:
Input: temperatures = [30,60,90]
Output: [1,1,0]
----------------------------------------------
Constraints:
●	1 <= temperatures.length <= 105
●	30 <= temperatures[i] <= 100
*/

package Arrays_Strings_manipulation;

import java.util.Arrays;
import java.util.Scanner;

public class Daily_temperatures {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Get number of days from user
				System.out.print("Enter the number of days: ");
				int noOfDays = sc.nextInt();
				
				if(noOfDays==0) {
					System.out.println("Number of days must be some value, Please try again");
				}
				else {
		// array declaration
				int[] temperatures = new int[noOfDays];
				int[] answer = new int[noOfDays];
				int size=0;
		// get temperatures from user
				System.out.println("Enter the Temperatures: ");
				for(int i=0; i<noOfDays; i++) {
					int temp = sc.nextInt();
					if(temp>=30 && temp<=100) {
						temperatures[i] = temp;
					}
					else {
						System.out.println("The temperature must be >= 30 and <=100");
						System.out.println("Try again");
						i--;
					}
				}
				
		// print input array
				System.out.println("Input array: " + Arrays.toString(temperatures));

	    // logic-------------------------------------------------------------------------------
				int tempCount = 0;
				int count  = 0;
				for(int i=0; i<noOfDays; i++) {
					for(int j= i+1; j<noOfDays; j++) {
						
						if(temperatures[i]<temperatures[j]) {
							tempCount = j-i;
							answer[size++] = tempCount;
							break;
						}
					}
				}
				System.out.println("Answer array: "  + Arrays.toString(answer));
				}
	}

}
