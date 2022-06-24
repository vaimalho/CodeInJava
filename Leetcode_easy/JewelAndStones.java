/*
Jewels and Stones

You're given strings jewels representing the types of stones that are jewels, 
and stones representing the stones you have. Each character in stones is a type of stone you have. 
You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
*/

package leetcodeeasy;

import java.util.HashSet;
import java.util.Set;

public class JewelAndStones {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	String jewels = "aA";
	String stones = "aAAbbbb";

	System.out.println(numJewelsInStones1(jewels, stones));

    }

    // Time Complexity: O(J.lenght + S.length)
    // Space Complexity: O(J.length)
    public static int numJewelsInStones(String jewels, String stones) {

	Set<Character> set = new HashSet<>();
	int result = 0;

	for (int i = 0; i < jewels.length(); i++) {
	    set.add(jewels.charAt(i));
	}
	
	for(int i=0;i<stones.length();i++) {
	    if(set.contains(stones.charAt(i)))
		result++;
	}
	
	return result;
    }

    // Brute Force

    // Time Complexity: O(J.lenght * S.length)
    // Space Complexity: O(1)
    public static int numJewelsInStones1(String jewels, String stones) {
	
	int result=0;
	for (char s : stones.toCharArray()) {
	    for (char j : jewels.toCharArray()) {
		if(j==s)
		    result++;
	    }
	}
	return result;
    }

}
