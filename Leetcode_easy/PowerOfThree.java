/*
Power of Three

        Given an integer n, return true if it is a power of three. Otherwise, return false.

        An integer n is a power of three, if there exists an integer x such that n == 3x.


        Example 1:

        Input: n = 27
        Output: true
        Explanation: 27 = 33
        Example 2:

        Input: n = 0
        Output: false
        Explanation: There is no x where 3x = 0.
        Example 3:

        Input: n = -1
        Output: false
        Explanation: There is no x where 3x = (-1).


        Constraints:

        -231 <= n <= 231 - 1


        Follow up: Could you solve it without loops/recursion?


*/package leetcodeeasy;

public class PowerOfThree {
    public static void main(String[] args) {

        int n =9;
        System.out.println((1.99)%1);
        System.out.println(isPowerOfThree1(n));

    }

    // Time Complexity: O(LogN)
    // Space Complexity: O(1)
    public static boolean isPowerOfThree(int n) {

        if(n==0)
            return false;
        while(n%3==0)
            n=n/3;
        return n==1;
    }

    // Time Complexity: O(LogN)
    // Space Complexity: O(1)
    public static boolean isPowerOfThree1(int n) {

        if(n==0)
            return false;
        long i=1;
        while(n%3==0 && i<n){
            i *= 3;
        }
        return n==i;
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static boolean isPowerOfThree2(int n) {

        if(n==0)
            return false;
        return (Math.log10(n)/Math.log10(3)) % 1 == 0;
    }
}
