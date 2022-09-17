/*
Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*/

package leetcodeeasy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	String s = "aacc";
	String t = "caac";

	System.out.println(isAnagram(s, t));

    }

    // Recommended

    // Time Comlexity: O(N)
    // Space Complexity: O(1)
    public static boolean isAnagram1(String s, String t) {

	if (s.length() != t.length())
	    return false;

	int[] count = new int[26];

	for (int i = 0; i < s.length(); i++) {
	    count[s.charAt(i) - 'a']++;
	    count[t.charAt(i) - 'a']--;
	}

	for (int i : count) {
	    if (i != 0)
		return false;
	}

	return true;

    }

    // Time Complexity: O(S) or O(T)
    // SPace Complexity: O(S)
    public static boolean isAnagram(String s, String t) {

	if (s.length() != t.length())
	    return false;

	Map<Character, Integer> map = new HashMap<>();
	
	for (char c : s.toCharArray()) {
	    map.put(c, map.getOrDefault(c, 0) + 1);
	}

	for (char c : t.toCharArray()) {
	    if (map.containsKey(c)) {
		map.put(c, map.get(c) - 1);

	    } else {
		return false;
	    }
	}

	for (int i : map.values()) {
	    if (i != 0)
		return false;
	}
	return true;
    }

    // Time Complexity: O(NlogN)
    // SPace Complexity: O(1)
    public static boolean isAnagram2(String s, String t) {

	if (s.length() != t.length())
	    return false;

	char[] s1 = s.toCharArray();
	char[] t1 = t.toCharArray();
	java.util.Arrays.sort(s1);
	java.util.Arrays.sort(t1);

	return java.util.Arrays.equals(s1, t1);
    }

}
