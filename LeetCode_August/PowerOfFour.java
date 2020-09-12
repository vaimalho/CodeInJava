package leetcode.august;

/*Power of Four

Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example 1:

Input: 16
Output: true
Example 2:

Input: 5
Output: false
Follow up: Could you solve it without loops/recursion?
*/		
public class PowerOfFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2147483647;
		System.out.println(isPowerOfFour(num));
	}
	public static boolean isPowerOfFour(int num) {
        int i=1;
        int result=0;  
        if(num==1)
        	return true;
        while(num%4==0 && result<=num) {
        	result=(int) Math.pow(4, i);
        	if(result==num)
        		return true;
        	i++;
        }
		return false;
    }
}
