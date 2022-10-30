/*You are given an m x n binary matrix grid.
In one operation, you can choose any row or column and flip each value in that row or column 
(i.e., changing all 0's to 1's, and all 1's to 0's).
Return true if it is possible to remove all 1's from grid using any number of operations or 
false otherwise.
----------------------------------------------------------------------------------------
Example 1:
Input: grid = [[0,1,0],[1,0,1],[0,1,0]]
Output: true
Explanation: One possible way to remove all 1's from grid is to:
- Flip the middle row
- Flip the middle column
------------------------------------------------------------------
Example 2:
Input: grid = [[1,1,0],[0,0,0],[0,0,0]]
Output: false
Explanation: It is impossible to remove all 1's from grid.
------------------------------------------------------------------*/
package Arrays_Strings_manipulation;

import java.util.Arrays;

public class RemoveAllOnes {

	public static void main(String[] args) {
		//System.out.println(isRemoveAllOnePossible(new int[][]{{0,1,0},{1,0,1},{0,1,0}}));
		System.out.println(isRemoveAllOnePossible(new int[][]{{1,1,0},{0,0,0},{0,0,0}}));
		//System.out.println(isRemoveAllOnePossible(new int[][]{{0}}));
		//System.out.println(isRemoveAllOnePossible(new int[][]{{1,1,1},{0,0,0},{0,0,0}}));
	}
	
	public static boolean isRemoveAllOnePossible(int[][] array){
	    
	    int i=0,j=0,numberToCheck=0;
	    
	    for(i=0;i<array[0].length;i++)
	        if(array[0][i] == 1)
	            flipColumn(array,i);
	            
	   for(i=0;i<array[0].length;i++){
	       numberToCheck=array[i][0];
	       
	       for(j=0;j<array[0].length;j++){
	           //System.out.println(arr[i][j]+"    "+numberToCheck);
	           if(array[i][j] != numberToCheck)
	            return false;
	       }
	   }
	    return true;
	}
	
	static void flipColumn(int[][] array , int columnNumToFlip){
	    for(int i=0;i<array.length;i++){
	        array[i][columnNumToFlip] = 1-array[i][columnNumToFlip];
	    }
	    
	    System.out.println(Arrays.deepToString(array));
	}
}
