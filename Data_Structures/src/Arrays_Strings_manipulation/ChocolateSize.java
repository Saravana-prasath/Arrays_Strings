/*Bruce works as a quality supervisor in a chocolate factory. He checks each chocolate size based on require size given. 
If the chocolate size is less than the size mentioned then he will process those chocolates again. 
Find how many times he needs to process to get the chocolate size greater than the required size.

Bruce follow the below process 
size = (1* 1st small size chocolate) + (2 * 2nd small size chocolate).
------------------------------------------------------------------------
For example :
Size of the chocolate: 
1, 2, 4, 8, 10, 12.
size require - 7

Output: 
2
---------------------------------------------------------------------------
Explanation:
Combine the first two chocolates to create a chocolate with a size of = 1*1 + 2*2 = 5
After this operation, the chocolates are 4, 5, 8, 10, 12. still there are few chocolates'(4, 5) size less than require size(7).
Now do same process 1*4 + 2*5 = 14.
After this operation, the chocolates are 8, 10, 12, 14. Now all the chocolates size are greater than required size (7). 

All the chocolates have a size >= 7.
Thus, 2 operations are required to increase the size.

*/

package Arrays_Strings_manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChocolateSize {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Get array size from user
		System.out.print("Enter the number of chocolates: ");
		int noOfChocolates = sc.nextInt();
		
		if(noOfChocolates==0) {
			System.out.println("Here no Chocolates");
		}
		else {
		// Arraylist declaration
		ArrayList<Integer> Chocolates = new ArrayList<Integer>();
		
        // get array elements from user
		System.out.println("Enter the size of Chocolates: ");
		for(int i=0; i<noOfChocolates; i++) {
			int temp = sc.nextInt();
			Chocolates.add(i, temp);
		}
		System.out.println("Size of the Chocolates: " + Chocolates);
		
		// Enter the Required size
		System.out.print("Enter the Required size: ");
		int requiredSize = sc.nextInt();
		
		// Find number of operations
		int noOfOPerations = 0;
		for(int i=0; i<noOfChocolates; i++) {
			// sort the array
			Collections.sort(Chocolates);
			if(Chocolates.get(0) < requiredSize) {
				int temp = Chocolates.get(0) + Chocolates.get(1)*2;
				Chocolates.remove(0);
				Chocolates.remove(0);
				
				Chocolates.add(0, temp);
				noOfOPerations++;
				i--;
			}
		}
		System.out.println("Final size of Chocolates: " + Chocolates);
		System.out.println("number of Operations required: " + noOfOPerations);
		}
	}
}
