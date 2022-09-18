/*
Valid Palindrome

        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

        Given a string s, return true if it is a palindrome, or false otherwise.



        Example 1:

        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.
        Example 2:

        Input: s = "race a car"
        Output: false
        Explanation: "raceacar" is not a palindrome.
        Example 3:

        Input: s = " "
        Output: true
        Explanation: s is an empty string "" after removing non-alphanumeric characters.
        Since an empty string reads the same forward and backward, it is a palindrome.
*/

package leetcodeeasy;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s=".,";
        System.out.println(isPalindrome(s));
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean isPalindrome(String s) {

        s = s.trim();
        s = s.toLowerCase();

        int i=0;
        int j=s.length()-1;

        while(i<j){
            while(!Character.isLetterOrDigit(s.charAt(i)) && i<j)
                i++;
            while(!Character.isLetterOrDigit(s.charAt(j)) && i<j)
                j--;

            if(s.charAt(i)!= s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;

    }

    // TIme Complexity: O(N)
    // Space Complexity: O(N)
    public static boolean isPalindrome1(String s) {

        if(s.length()<=1)
            return true;
        s = s.trim();
        s = s.toLowerCase();

        StringBuilder str = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c))
                str.append(c);
        }

        return str.toString().equals(str.reverse().toString());

    }
}
