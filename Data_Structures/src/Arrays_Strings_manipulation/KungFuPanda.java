/*Po is receiving training for master Shifu for his big fight 
 *with Tie Lung scheduled for the upcoming week. Apart from his 
 *physical training master Shifu also decides to train him mentally by giving him puzzle to solve.

He gives Po a puzzle, an array of N numbers and tells Po at a time in one move Po can choose 
an element P from the array, and delete that element along with all elements with 
value P+1 and P-1. For this move he will get P dumplings. As dumplings are Po's favourite, 
Help Po in finding the maximum number of dumplings he can get. 
-------------------------------------------------------------------------------------
Input Specification:
	Input1: N, size of array
	Input2:The array of numbers
	Output : Return the maximum number of dumplings Po can get
-------------------------------------------------------------------------------------
Example1:
	Input1: 5
	Input2: [3,3,4,5,4]
	Output : 11

Explanation: 
	Steps1: choose 3 array becomes [3,5] dumplings point 3
	steps2: choose 3 array becomes [5] dumplings point 3+3=6
	steps3: choose 5 array becomes [] dumplings point 3+3+5=11
--------------------------------------------------------------------------------------
*/

package Arrays_Strings_manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class KungFuPanda {
	
	static ArrayList<Integer> Answer = new ArrayList<Integer>();
	static int answerArraySize = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Get Arraysize from user
				System.out.print("Enter the Arraysize: ");
				int arraySize = sc.nextInt();
				
				if(arraySize==0) {
					System.out.println("Array is empty");
				}
				else {
		// Arraylist declaration
				ArrayList<Integer> inputArray = new ArrayList<Integer>();
					
		// get array elements from user
				System.out.println("Enter the Array elements: ");
				for(int i=0; i<arraySize; i++) {
					int temp = sc.nextInt();
					inputArray.add(i, temp);
					}
				Collections.sort(inputArray);
				System.out.println("Input Array: " + inputArray);
				
		//  Calling logic method
				dumplings(inputArray);
				
				int sum = 0;
				for(int i=0; i<answerArraySize; i++) {
					sum += Answer.get(i);
				}
				System.out.println("the maximum number of dumplings he can get: " + sum);
				}
			}
	
// Method for logic	
	public static void dumplings(ArrayList<Integer> a) {
		if(a.isEmpty()) {return;} // ----------> Base condition for recursion
		
		int P = a.get(0);               //-----> Removing P & P+1 elements
		a.remove(0);					
		int Q = P+1;
		for(int i=0; i<a.size(); i++) {
			if(a.get(i) == Q) {
				a.remove(i);
				i--;
			}
		}
		
		Answer.add(answerArraySize, P);
		answerArraySize++;
		
		dumplings(a);   //---------------------> Recursive 
	}
}
