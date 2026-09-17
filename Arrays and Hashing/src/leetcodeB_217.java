//Easy-Contains Duplicate
//Given an integer array nums, return true if any value appears at least twice in the array
//and return false if every element is distinct.
//Hashset-Find any duplicate return true
//time-O(n) space-O(n)

import java.util.HashSet;

public class leetcodeB_217 {
    public boolean containsDuplicate(int[] nums){
//        create a HashSet to store elements from the array
        HashSet<Integer> seenNumbers = new HashSet<>();

//        Iterate through each element in the array
        for(int num: nums){
//            check if the element is already in the HashSet
            if(seenNumbers.contains(num)){
                return true;
            }
//            add the element to the HashSet
            seenNumbers.add(num);
        }
//        No duplicate found
        return false;
    }
}
