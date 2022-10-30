/*Hari is a person who is interested in stock market. He tries to understand it
 *but unfortunately couldn't. So he plans to create a report analysis of the stock market rise 
 *and drop. Now Hari needs help in creating the report.

We have a series of n daily price quotes for a stock and we need to calculate the span of 
the stock’s price for all n days. The span Si of the stock’s price on a given day i is 
defined as the maximum number of consecutive days just before the given day, 
for which the price of the stock on the current day is less than its price on the given day. 
--------------------------------------------------------------------------------------------
Input Format
The First line of the input contains an integer N denoting the number of elements.
The next line contains N space-separated integers contained in the array.
 
Output Format
Print N values stock span. 
-----------------------------------------------------------------------------------------
Sample Input 1
N = 7
price[] = [100 80 60 70 60 75 85]
 
Sample Output 1
1 1 1 2 1 4 6

Explanation: Traversing the given input span for 100 will be 1, 
80 is smaller than 100 so the span is 1, 60 is smaller than 80 so the span is 1, 
70 is greater than 60 so the span is 2 and so on. Hence the output will be 1 1 1 2 1 4 6.
--------------------------------------------------------------------------------------------
Sample Input 2
N = 6
price[] = [10 4 5 90 120 80]
 
Sample Output 2
1 1 2 4 5 1
-----------------------------------------------------------------------------------------
*/

package Arrays_Strings_manipulation;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StocksSpan {

	public static void main(String[] args) {
// try to find any exception 
		try {
		Scanner sc = new Scanner(System.in);
		// Get array size from user
				System.out.print("Enter the number of stocks: ");
				int noOfStocks = sc.nextInt();
				
				if(noOfStocks==0) {
					System.out.println("The Stock is empty, Please add Stock");
				}
				else {
		// array declaration
				int[] stocks = new int[noOfStocks];
				int[] stocksSpan = new int[noOfStocks];
				
		// get array elements from user
				System.out.println("Enter the Stocks: ");
				for(int i=0; i<noOfStocks; i++) {
					stocks[i] = sc.nextInt();
				}
				System.out.println(" ");
				
		// print input array
				System.out.println("Stocks: " + Arrays.toString(stocks));
		
	    // Stock's span calculation
				System.out.print("Stocks Span: ");
				for(int i=0; i<noOfStocks; i++) {
					int temp = 0;
					for(int j=i; j>=0; j--) {
						if(stocks[j]<=stocks[i]) {
							temp++;
						}
						else {
							break;
						}
					}
					System.out.print(temp + " ");
				}
				}
		}
// catch the NegativeArraySizeException
		catch (NegativeArraySizeException e) {
			System.out.println("");
			System.out.println("Nope! number stocks must be a positive value");
			System.out.println("Please try again");
		}
// catch the InputMismatchException 
		catch (InputMismatchException e) {
			System.out.println("");
			System.out.println("Nope! number stocks must be an integer");
			System.out.println("Please try again");
		}
	}
}
