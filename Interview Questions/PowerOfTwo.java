/*Power of Two

Solution
Given an integer, write a function to determine if it is a power of two.

Example 1:

Input: 1
Output: true 
Explanation: 20 = 1
Example 2:

Input: 16
Output: true
Explanation: 24 = 16
Example 3:

Input: 218
Output: false
*/
package leetcode;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 16;
		//isPowerOfTwo(n);
		System.out.println(isPowerOfTwo1(n));
	}

	//Approach 1
	public static boolean isPowerOfTwo(int n) {
		int m = n;
		int i=0;
		if(n==1)
			return true;
        while(n%2==0 && m<=n) {
        	m=(int)Math.pow(2,i);
        	if(m==n)
        		return true;
        	i++;
        }
		return false;

    }
	
	//Approach 2
	public static boolean isPowerOfTwo1(int n) {
				
		if(n<=0)
			return false;
		if(n==1)
			return true;
		return n%2==0 && (n&(-n))==n;

    }
}
