/*
Detect Capital

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

 

Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false
*/

package leetcodeeasy;

public class DetectCapital {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	String word = "AGRA";
	System.out.println(detectCapitalUse(word));

    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean detectCapitalUse(String word) {
	
	if(word.length()<=1)
	    return true;

	if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
	    for (int i = 2; i < word.length(); i++) {
		if (Character.isLowerCase(word.charAt(i)))
		    return false;
	    }

	}
	else {
	    for (int i = 1; i < word.length(); i++) {
		if (Character.isUpperCase((word.charAt(i))))
		    return false;
	    }
	}

	return true;

    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean detectCapitalUse1(String word) {

	int count = 0;

	for (int i = 0; i < word.length(); i++) {
	    if (Character.isUpperCase(word.charAt(i)))
		count++;
	}

	return count == word.length() || count == 0 || count == 1 && Character.isUpperCase(word.charAt(0));
    }

}
