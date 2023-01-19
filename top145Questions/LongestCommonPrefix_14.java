/*
14. Longest Common Prefix

        Write a function to find the longest common prefix string amongst an array of strings.

        If there is no common prefix, return an empty string "".



        Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"
        Example 2:

        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.
*/

package top145questions;

public class LongestCommonPrefix_14 {

    public static void main(String[] args) {

        String[] str = new String[] {"flower","flow","flight"};
        System.out.println(longestCommonPrefix1(str));
    }

    // Horizontal Scanning

    // Time Complexity: O(S) --> S: Sum of all the characters in the array
    // Space Complexity: O(1)
    public static String longestCommonPrefix(String[] str) {

        if(str.length == 0)
            return "";

        String prefix = str[0];

        for(int i=1; i<str.length; i++){
            while(str[i].indexOf(prefix) != 0 ){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }

    // Vertical Scanning

    // Time Complexity: O(S) --> S: Sum of all the characters in the array
    // Space Complexity: O(1)
    public static String longestCommonPrefix1(String[] strs) {

        if(strs.length == 0)
            return "";

        String prefix = strs[0];

        for(int i=0; i<strs[0].length(); i++){
            for(int j=1; j<strs.length; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != prefix.charAt(i))
                    return prefix = prefix.substring(0,i);;
            }
        }
        return prefix;
    }
}
