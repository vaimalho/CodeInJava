/*
Reverse String

Add to List

Share
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.


Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */

package leetcodeeasy;

public class ReverseString {

    public static void printArray(char[] arr) {
	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + " ");
	    System.out.println();
	}
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	char[] arr = new char[] { 'h', 'e', 'l', 'l', 'o' };
	String s = "hello";
	// printArray(arr);

	reverseString(arr);

	// printArray(arr);

	System.out.println(reverseString1(s));
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static void reverseString(char[] s) {

	int l = 0;
	int r = s.length - 1;

	while(l<r) {
	    char temp = s[l];
	    s[l]=s[r];
	    s[r] = temp;

	    l++;
	    r--;

	}
    }

    public static String reverseString1(String s) {

	char[] ch = s.toCharArray();
	int l = 0;
	int r = ch.length - 1;

	while (l < r) {
	    char temp = ch[l];
	    ch[l] = ch[r];
	    ch[r] = temp;

	    l++;
	    r--;

	}

	return String.valueOf(ch);
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static void reverseString1(char[] s) {

	for (int i = 0, j = s.length - 1; i < j; i++, j--) {
	    char temp = s[i];
	    s[i] = s[j];
	    s[j] = temp;

	}
    }

}
