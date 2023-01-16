/*
20. Valid Parentheses

        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.


        Example 1:

        Input: s = "()"
        Output: true
        Example 2:

        Input: s = "()[]{}"
        Output: true
        Example 3:

        Input: s = "(]"
        Output: false
*/

package top145questions;

import java.util.Stack;

public class ValidParenthesis_20 {

    public static void main(String[] args) {

        String s = "]";
        System.out.println(isValid(s));

    }

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static boolean isValid(String s) {

        Stack<Character> stk = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ')'){
                if(stk.isEmpty() || stk.pop() != '(')
                    return false;
            }

            else if(s.charAt(i) == ']'){
                if(stk.isEmpty() || stk.pop() != '[')
                    return false;

            }

            else if(s.charAt(i) == '}'){
                if(stk.isEmpty() || stk.pop() != '{')
                    return false;
            }
            else{
                stk.add(s.charAt(i));
            }
        }
        return stk.isEmpty();
    }
}
