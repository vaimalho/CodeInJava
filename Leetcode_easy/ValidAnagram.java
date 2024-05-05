package interviewprep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagramMain {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram_optimized2(s,t));

    }

    // Time Complexity: O(NLogN)
    // Space Complexity: O(1)
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);
        for(int i=0; i<s1.length; i++){
            if(s1[i] != t1[i])
                return false;
        }
        return true;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean isAnagram_optimized(String s, String t) {
        if(s.length() != t.length())
            return false;

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
        }
        for(int i : map.values()){
            if(i!=0)
                return false;
        }
        return true;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean isAnagram_optimized2(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] arr = new int[26];

        for(int i=0 ;i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int i : arr){
            if(i!=0)
                return false;
        }
        return true;
    }
}
