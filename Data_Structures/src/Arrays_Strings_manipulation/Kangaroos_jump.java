/*You are choreographing a circus show with various animals.
 *For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).
●	The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
●	The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
You have to figure out a way to get both kangaroos at the same location at the same time as part of the show.
If it is possible, return YES, otherwise return NO.
----------------------------------------------------------------------------------------------------
Sample Input 1
0 3 4 2
Sample Output 1
YES

Explanation 1
It is clear that the kangaroos meet at the same location (number 12 on the number line)
after same number of jumps (4 jumps), and we print YES.
--------------------------------------------------------------------------------------------
Sample Input 2
0 2 5 3
Sample Output 2
NO

Explanation 2
The second kangaroo has a starting location that is ahead (further to the right)
of the first kangaroo's starting location (i.e., x2> x1). Because the second kangaroo moves at 
a faster rate (meaning v2>v1 ) and is already ahead of the first kangaroo, 
the first kangaroo will never be able to catch up. Thus, we print NO.
---------------------------------------------------------------------------------------------------
*/

package Arrays_Strings_manipulation;

import java.util.Scanner;

public class Kangaroos_jump {

	public static void main(String[] args) {
// Get input from user 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Kangarro1's position: ");
		int kangaroo1_Position = sc.nextInt();
		System.out.print("Enter the Kangarro1's Jumpcount: ");
		int kangaroo1_Jumpcount = sc.nextInt();
		System.out.print("Enter the Kangarro2's position: ");
		int kangaroo2_Position = sc.nextInt();
		System.out.print("Enter the Kangarro2's Jumpcount: ");
		int kangaroo2_Jumpcount = sc.nextInt();
		System.out.println("");
		
		int K1_position = kangaroo1_Position;
		int K2_position = kangaroo2_Position;
		boolean flag = false;

// logic
		for(int i=0; i<=10000; i++) {
			K1_position = K1_position + kangaroo1_Jumpcount;
			K2_position = K2_position + kangaroo2_Jumpcount;
			
				if(K1_position == K2_position) {
					System.out.println("Is this possible to the kangaroos meet at same Location at same time: YES");
					System.out.println("Both kangaroos will Meet at: " + K1_position);
					flag = true;
					break;
				}
			}
		if(flag == false) {
			System.out.println("Is this possible to the kangaroos meet at same Location at same time: NO");
		}
	}
}
