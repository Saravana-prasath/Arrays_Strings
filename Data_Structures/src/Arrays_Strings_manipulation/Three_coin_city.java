/* Prasath resides in a city where people give exactly 3 coins to buy any item.
 * It is a strict rule to pay the total amount using the 3 coins(each coin may have different values).
 * Given an array of integers denoting the coin value 
 * and K denoting the total amount to pay, 
 * determine if there are any three coin(value) in the array whose sum equals the given Total amount K.
*/
/*
 * Sample Input 1
	N = 7
	coin[] = [3, 7, 1, 2, 8, 4, 5]
	K = 10
	
	Sample Output 1
	[1, 4, 5]
	-----------------------------------------
	Sample Input 2
	N = 7
	coin[] = [3, 7, 1, 2, 8, 4, 5]
	K = 4
	 
	Sample Output 2
	No
	(No 3 values sum upto 4)
	------------------------------------------
 */

package Arrays_Strings_manipulation;

import java.util.Arrays;
import java.util.Scanner;

public class Three_coin_city {

	public static void main(String[] args) {
		
		try {
			// Get No.of coins from user
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the No.of coins: ");
			int arraySize = sc.nextInt();
	// array declaration
			int[] inputArray = new int[arraySize];
	// coins less than three - can't able to buy any item 
			if(arraySize<3) {
				System.out.println("You should have minimum 3 coins to buy any item");
			}
	// coins more than three - yeah! now can buy any items
			else if(arraySize>3) {
				// Get values of each coins from user
				System.out.println("Enter the values of each coins: ");
				for(int i=0; i<arraySize; i++) {
					inputArray[i] = sc.nextInt();
				}
				// print the value of coins
				System.out.println("Values of coins: " + Arrays.toString(inputArray));
				// total amount to pay
				System.out.print("Enter the total amount to pay: ");
				int payAmount = sc.nextInt();
				// Find three coins whose sum is equal to total pay
				boolean flag = false;
				for(int i=0; i<=arraySize-3; i++) { //------>loop for fixing 1st coin
					for(int j=i+1; j<=arraySize-2; j++) { //------>loop for fixing 2nd coin
						for(int k=j+1; k<=arraySize-1; k++) { //------>loop for fixing 3rd coin
							int sum = inputArray[i]+inputArray[j]+inputArray[k];
							if (sum == payAmount) {
								flag = true;
								System.out.println("Coins you have to give: " + inputArray[i]+","+inputArray[j]+","+inputArray[k]);
								break;
							}
						}
						if(flag==true) {
							break;
						}
					}
					if(flag==true) {
						break;
					}
				}
				if(flag == false) {
					System.out.println("No 3 values sum upto " + payAmount);
				}
		    }
			else {
				// Get values of each coins from user
				System.out.println("Enter the values of each coins: ");
				for(int i=0; i<arraySize; i++) {
					inputArray[i] = sc.nextInt();
				}
				// print the value of coins
				System.out.println("Values of coins: " + Arrays.toString(inputArray));
				// Result
				int sum = inputArray[0] + inputArray[1] + inputArray[2];
				System.out.println("You can only buy " + sum + " value worth of item");
			}
		}
		catch (NegativeArraySizeException e) {
			System.out.println("");
			System.out.println("Nope! No.of coins should have only positive value");
			System.out.println("Please try again");
		}

}
}