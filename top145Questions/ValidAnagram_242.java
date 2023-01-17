/*
242. Valid Anagram

        Given two strings s and t, return true if t is an anagram of s, and false otherwise.

        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
        typically using all the original letters exactly once.

        Example 1:

        Input: s = "anagram", t = "nagaram"
        Output: true
        Example 2:

        Input: s = "rat", t = "car"
        Output: false


        Constraints:

        1 <= s.length, t.length <= 5 * 104
        s and t consist of lowercase English letters.


        Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*/

package top145questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_242 {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram_optimized(s,t));
    }

    // Time Complexity: O(NlogN)
    // Space Complexity: O(N)
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1,t1);
    }


    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static boolean isAnagram_optimized(String s, String t) {

        if(s.length() != t.length())
            return false;

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0) - 1);

        }

        for(int i : map.values()){
            if(i!=0)
                return false;
        }
        return true;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean isAnagram_optimized2(String s, String t) {

        if(s.length() != t.length())
            return false;

        int[] arr = new int[26];

        for(int i=0;i <s.length(); i++){
            arr[s.charAt(i) - 'a'] ++;
            arr[t.charAt(i) -'a'] --;
        }

        for(int i : arr)
            if(i!=0)
                return false;
        return true;
    }
}
