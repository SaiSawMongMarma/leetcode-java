//Easy-Valid Anagram
//Given two strings s and t, return true if t is an anagram of s and false otherwise
//Every character present in t also present in s called anagram
//S: cat T: tac
//check length then HashMap
//if we use Array
public class leetcodeB_242 {
    public boolean isAnagram(String s, String t) {

//        If the length are different, they can't be anagrams
        if(s.length() != t.length()){
            return false;
        }

//        Create an array to count character frequencies
        int[] charCounts = new int[26]; //assuming only lowercase English letter

//        Increment count for each character in s and decrement for each in t
        for(int i=0; i<s.length(); i++){
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

//        check if all counts are zero
        for(int count: charCounts){
            if(count != 0){
                return false;
            }
        }

//        All counts are zero, so t is an anagram of s
        return true;
    }
}
