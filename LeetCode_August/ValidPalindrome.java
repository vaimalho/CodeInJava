/*Valid Palindrome

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
*/
package leetcode.august;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = ".,";
		String str1 = "A man, a plan, a canal -- Panama";
		System.out.println(isPalindrome(str));
	}
	
	public static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;

		while(i<j) {
			while(!Character.isLetterOrDigit(s.charAt(i)) && i<s.length()-1) {
				i++;
			}
			while(!Character.isLetterOrDigit(s.charAt(j)) && j>0) {
				j--;
			}
			if(i<=j) {
				if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
					return false;
				i++;
				j--;
			}
		}
		return true;
	}

}
