/*
Power of Two

        Given an integer n, return true if it is a power of two. Otherwise, return false.

        An integer n is a power of two, if there exists an integer x such that n == 2x.



        Example 1:

        Input: n = 1
        Output: true
        Explanation: 20 = 1
        Example 2:

        Input: n = 16
        Output: true
        Explanation: 24 = 16
        Example 3:

        Input: n = 3
        Output: false


        Constraints:

        -231 <= n <= 231 - 1


        Follow up: Could you solve it without loops/recursion?

*/
package leetcodeeasy;

public class PowerOfTwo {
    public static void main(String[] args) {

        int n=16;
        System.out.println(isPowerOfTwo(n));

    }

    public static boolean isPowerOfTwo(int n) {

        int i=0;
        int m=n;

        if(n==1)
            return true;
        while(n%2==0 && m<=n){
             m = (int) Math.pow(2,i);
            if(m == n)
                return true;
            i++;
        }
        return false;
    }

    // Time Complexity: O(LogN)
    // SPace Complexity: O(1)
    public static boolean isPowerOfTwo1(int n) {

        if(n==0)
            return false;
        long i=1;
        while(n%2==0 && i<n){
            i *= 2;
        }
        return n==i;
    }

    // Time Complexity: O(LogN)
    // SPace Complexity: O(1)
    public static boolean isPowerOfTwo2(int n) {

        if(n==0)
           return false;
       while(n%2==0){
           n=n/2;
       }
       return n==1;
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static boolean isPowerOfTwo3(int n) {

        if(n<=0)
            return false;
        if(n==1)
            return true;
        return n%2==0 && (n&(-n))==n;
    }
}
