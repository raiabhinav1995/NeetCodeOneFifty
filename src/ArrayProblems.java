import java.util.Arrays;
import java.util.HashSet;

public class ArrayProblems {
    boolean containsDuplicate(int[] arr) {
        // Given an integer array nums, return true if any value appears at least twice in the array, and return false
        // if every element is distinct.
        // Solution 1: Using HashSets.
//        HashSet<Integer> set=new HashSet<>();
        // Created the hashset to hold all array elements
//        for(int i: arr){
//            set.add(i);
        //Iterating over array and adding each element into set. If any duplicate element is there it won`t be added
        // twice into set, hence size of set would be equal to number of elements only if no duplicates are there.
//        }
        // Checking actually size of set is equal to number of elements in array.
        // If so we return duplicates aren`t there
//        return arr.length != set.size();
        // Else we can conclude duplicates do exist.
// Time Complexity for this approach: O(n) as we are traversing linearly over array.
        // Space complexity if O(n) as we are using hashset.

        // <---------------------------------------------------------------------------------------------------------->
        //Approach 2: For each element we check if it`s duplicate is present or not, if any such element is found we can
        // just return true from there as the duplicate actually exists in case we traverse all the elements and still
        // do not encounter any such element we can return true. Here the time complexity will be O(n^2) but the space
        // complexity will be constant as we are not using any extra space.

//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    return true;
//                }
//            }
//        }
//        return false;

//        Approach to solve in O(n log n) using a sorted array. In a case of a sorted if any element and it`s next
        //element is equal we can conclude that array contains duplicate, but we if we reach the end and do not encounter
        // any such element we can conclude array does not contain duplicates.
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
