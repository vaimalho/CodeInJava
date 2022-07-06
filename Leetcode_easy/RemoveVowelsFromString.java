/*
Remove Vowels from a String

Given a string s, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, 
and return the new string.

 
Example 1:

Input: s = "leetcodeisacommunityforcoders"
Output: "ltcdscmmntyfrcdrs"
Example 2:

Input: s = "aeiou"
Output: ""
*/

package leetcodeeasy;

import java.util.ArrayList;
import java.util.List;

public class RemoveVowelsFromString {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	String s = "leetcodeisacommunityforcoders";
	System.out.println(removeVowels(s));

    }

    public static String removeVowels(String s) {

	List<Character> ls = new ArrayList<>();
	ls.add('a');
	ls.add('e');
	ls.add('i');
	ls.add('o');
	ls.add('u');

	// String result = "";

	StringBuilder result = new StringBuilder();

	for (char c : s.toCharArray()) {
	    if (!ls.contains(c))
		result = result.append(c);
	}

	return result.toString();

    }

}
