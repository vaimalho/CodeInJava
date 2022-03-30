/*
344. Reverse String

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

*/

package arrays;

public class ReverseString {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	char[] arr = new char[] { 'h', 'e', 'l', 'l', 'o' };
	printArray(arr);

	reverseString(arr);

	printArray(arr);

    }

    public static void printArray(char[] arr) {
	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + " ");
	    System.out.println();
	}
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static void reverseString(char[] s) {

	int i = 0;
	int j = s.length - 1;

	char temp;

	while (i < j) {

	    temp = s[i];
	    s[i] = s[j];
	    s[j] = temp;

	    i++;
	    j--;
	}
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static void reverseString1(char[] s) {

	char temp;

	for (int i = 0, j = s.length - 1; i < j; i++, j--) {

	    temp = s[i];
	    s[i] = s[j];
	    s[j] = temp;
	}
    }

}
