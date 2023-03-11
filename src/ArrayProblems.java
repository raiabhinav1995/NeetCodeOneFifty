import java.util.HashSet;

public class ArrayProblems {
    boolean containsDuplicate(int[] arr){
        // Given an integer array nums, return true if any value appears at least twice in the array, and return false
        // if every element is distinct.
        // Solution 1: Using HashSets.
        HashSet<Integer> set=new HashSet<>();
        // Created the hashset to hold all array elements
        for(int i: arr){
            set.add(i);
            //Iterating over array and adding each element into set. If any duplicate element is there it won`t be added
            // twice into set, hence size of set would be equal to number of elements only if no duplicates are there.
        }
        // Checking actually size of set is equal to number of elements in array.
        // If so we return duplicates aren`t there
        return arr.length != set.size();
        // Else we can conclude duplicates do exist.
// Time Complexity for this approach: O(n) as we are traversing linearly over array.
        // Space complexity if O(n) as we are using hashset.
    }
}
