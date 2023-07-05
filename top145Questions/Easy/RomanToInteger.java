/*
13. Roman to Integer
Easy

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.



Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

        String s = "III";
        System.out.println(romanToInt1(s));
    }

    // Time Complexity: O(1)
    // Space COmplexity: O(1)
    public static int romanToInt(String s) {

        int count=0;
        int result =0;

        Map<String,Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        // MCMXCIV

        while(count < s.length()){
            int currVal = map.get(s.substring(count, count+1));
            int nextVal = 0;
            if(count + 1 < s.length()) {
                nextVal = map.get(s.substring(count + 1, count + 2));
            }
            if(currVal < nextVal ){
                result += nextVal - currVal;
                count += 2;
            }
            else{
                result += currVal;
                count++;
            }
        }
        return result;
    }

    // Time Complexity: O(1)
    // Space COmplexity: O(1)
    public static int romanToInt1(String s) {

        int count=0;
        int result =0;

        Map<String,Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        // MCMXCIV

        while(count < s.length()){
            String nextVal ="";
            if(count + 1  <s.length()) {
                nextVal = s.substring(count, count + 2);
            }
            if(map.containsKey(nextVal)){
                result += map.get(nextVal);
                count +=2;
            }
            else{
                nextVal = s.substring(count,count+1);
                result += map.get(nextVal);
                count++;
            }
        }
        return result;
    }

}

