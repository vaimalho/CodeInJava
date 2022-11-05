/*First Unique Character in a String

Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.
 

Note: You may assume the string contains only lowercase English letters.
*/
package kevin.naughton.playlist;
import java.util.*;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "loveleetcode";
		System.out.println(firstUniqChar(s));

	}
	
	// Time Complexity: O(N)
	// Space Complexity: O(1) --> Only 26 lower case Alphabets i.e 0<=N<=26
	public static int firstUniqChar(String s) {
		if(s.length()==0)
			return -1;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for(int i=0; i<s.length(); i++) {
			if(map.get(s.charAt(i))==1)
				return i;
			
		}
		return -1;
	}

}
