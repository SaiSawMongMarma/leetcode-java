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

//            If duplicate exist, remove characters
//            From the left until duplicate is gone

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
//            Add current character
            set.add(s.charAt(right));

//            Calculate current window length
            int length = right - left + 1;
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcacbb";
        int answer = lengthOfLongestSubstring(s);
        System.out.println(answer);
    }
}
