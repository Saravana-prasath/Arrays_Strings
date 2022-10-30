/* Snake Festival

The annual snake festival is upon us, and all the snakes of the kingdom have gathered to 
participate in the procession. Mowgli has been tasked with reporting on the procession, and for 
this he decides to first keep track of all the snakes. When he sees a snake first, it'll be its 
Head, and hence he will mark a 'H'. The snakes are long, and when he sees the snake finally 
slither away, he'll mark a 'T' to denote its tail. In the time in between, when the snake is 
moving past him, or the time between one snake and the next snake, he marks with '.'s.

Formally, a snake is represented by a 'H' followed by some (possibly zero) '.'s, and then a 'T'. 
A valid report is one such that it begins with a (possibly zero length) string of '.'s, and then 
some (possibly zero) snakes between which there can be some '.'s, and then finally ends with some (possibly zero) '.'s.

Because the snakes enter a procession, and one by one, a valid report would be something 
like "..H..T...HTH....T.", or "...", or "HT", whereas "T...H..H.T", "H..T..H", "H..H..T..T" would be invalid reports.

Mowgli had binged on the festival food and had been very drowsy. So his report might be invalid. 
You need to help him discover if his report is valid or not.
-----------------------------------------------------------------------------------------------------------------------
Input
●	A single integer, L, the length of the report.
●	Report, R, containing a string of length L. The string contains only the characters '.', 'H', and 'T'.

Output
●	Output the string Valid or Invalid in a new line, depending on whether it was a valid report or not.

Constraints
●	1≤R≤500
●	1≤L≤500
-------------------------------------------------------------------------------------------------------------
Input :
18 
..H..T...HTH....T.
Output :
Valid 
-------------------------
Input
3 
... 
Output : 
Valid 
------------------------
Input
10 
H..H..T..T 
Output : 
Invalid (The second snake starts before the first snake ends, which is not allowed.)
--------------------------------------------------------------------------------------
Input
2 
HT 
Output :  
Valid 
-----------------------------------*/

package Arrays_Strings_manipulation;

public class Snake_Festival {

	public static void main(String[] args) {
		System.out.println(isValidReport("HT"));

	}
	
	public static boolean isValidReport(String report){
	    
	    int count=0;
	    for(int i=0;i<report.length();i++){
	        if(report.charAt(i)=='H'){
	           count++;
	        }
	        if(report.charAt(i)=='T'){
	            if(count != 1) {
	                return false;
	            }
	            count--;
	        }
	    }
	    if(count != 0){
	        //System.out.println(count);
	        return false;
	    }
	    return true;
	}

}
