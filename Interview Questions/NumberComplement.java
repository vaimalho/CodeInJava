package leetcode;

/*Number Complement
Solution
Given a positive integer num, output its complement number. The complement strategy is to flip the bits of its binary representation.

 

Example 1:

Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
Example 2:

Input: num = 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 

Constraints:

The given integer num is guaranteed to fit within the range of a 32-bit signed integer.
num >= 1
You could assume no leading zero bit in the integer’s binary representation.
This question is the same as 1009: https://leetcode.com/problems/complement-of-base-10-integer/
*/	
import java.util.*;
public class NumberComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(findComplement1(num));
 
	}

	// #Approach 1
    public static int findComplement(int num) {
    	String binNum = Integer.toBinaryString(num);
    	String result="";
    	for(Character ch:binNum.toCharArray()) {
    		if(ch=='1')
    			result += "0";
    		else
    			result +="1";
    	}
    	return Integer.parseInt(result, 2);
    }
    
    // #Approach 2
    public static int findComplement1(int num) {
    	
    	int result=0;
    	int power=1;
    	while(num>0) {
    		result+=((num%2) ^ 1) * power;
    		power=power*2;
    		num=num/2;
    	}
    	return result;
    }
}
