package leetcodeeasy;
/*
Fizz Buzz

Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
 

Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
*/

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int n = 5;
	System.out.println(fizzBuzz(n));

    }


    public static List<String> fizzBuzz(int n) {

	List<String> str = new ArrayList<>();

	for (int i = 1; i <= n; i++) {
	    if (i % 5 == 0 && i % 3 == 0)
		str.add("FizzBuzz");
	    else if (i % 5 == 0)
		str.add("Buzz");
	    else if (i % 3 == 0)
		str.add("Fizz");
	    else
		str.add(""+i);
	}
	return str;

    }

}
