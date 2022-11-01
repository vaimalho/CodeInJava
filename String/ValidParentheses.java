/* Valid Parentheses

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
package strings;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String s = "(]";
        System.out.println(isValid(s));

    }


    // TIme Complexity: O(N)
    // Space Complexity; O(1)
    public static boolean isValid(String s) {

        Stack<Character> st = new Stack();
        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) == ')'){
                if(st.isEmpty() || !st.pop().equals('(')){
                    return false;
                }
            }

            else if(s.charAt(i) == '}'){
                if(st.isEmpty() || !st.pop().equals('{')){
                    return false;
                }
            }

            else if(s.charAt(i) == ']'){
                if(st.isEmpty() || !st.pop().equals('[')){
                    return false;
                }
            }

            else{
                st.add(s.charAt(i));
            }

        }
        return st.isEmpty();
    }


}
