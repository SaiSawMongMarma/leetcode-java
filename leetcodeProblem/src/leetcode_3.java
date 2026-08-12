//Longest Substring without repeating characters.
//Given a string s, find the length of the longest substring without duplicate characters.
//Input: "abcabcbb"
//output: 3
//Because abc is the longest substring without repeating characters.
//Sliding Window + Hashset

import java.util.HashSet;
public class leetcode_3 {

    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for(int right = 0; right<s.length(); right++){

        }
    }

    public static void main(String[] args) {
        String s = "abcacbb";
        int answer = lengthOfLongestSubstring(s);
        System.out.println(answer);
    }
}
