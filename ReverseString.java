package leetcode;
/*Reverse String
Solution
Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

 

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
		
*/
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//char[] arr = {'h','e','l','l','o'};
		char[] arr = {'H','a','n','n','a','h'};
		printArray(arr);
		reverseString(arr);
		printArray(arr);
	}

	public static void printArray(char[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// Approach 1
    public static void reverseString(char[] s) {
    	int n=s.length;
    	int i=0;
    	int j=n-1;
    	while(i<j) {
    		char temp = s[i];
    		s[i]=s[j];
    		s[j]=temp;
    		i++;
    		j--;
    	}
    }
    
    // Approach 2 --> Fast
    public static void reverseString1(char[] s) {
        for(int i=0,j=s.length-1;i<j;i++,j--) {
        	char temp = s[i];
        	s[i]=s[j];
        	s[j]=temp;
        }
    }

}
