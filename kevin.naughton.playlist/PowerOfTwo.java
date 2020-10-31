/*Power of Two

Given an integer n, write a function to determine if it is a power of two.

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
Example 4:

Input: n = 4
Output: true

*/
package kevin.naughton.playlist;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(isPowerOfTwo(n));

	}
	
	// Approach 1
	public static boolean isPowerOfTwo(int n) {
		int result=0;
		int i=0;
		if(n==1)
			return true;
		while(n%2==0 && result<n) {
			result = (int)Math.pow(2, i);
			if(result==n)
				return true;
			i++;
		}
		return false;
	}
	
	// Approach 2
	public static boolean isPowerOfTwo1(int n) {
		if(n<=0)
			return false;
		if(n==1)
			return true;
		return n%2==0 && (n&(-n))==n;
	}
	
	// Approach 3
	public static boolean isPowerOfTwo2(int n) {
		long i=1;
		while(n%2==0 && i<n) {
			i*=2;
		}
		return i == n;
	}

}
