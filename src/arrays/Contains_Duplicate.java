package arrays;

import java.util.HashMap;

public class Contains_Duplicate {

    /**
     * Given an integer array nums, return true if any value appears at least twice in the array,
     * and return false if every element is distinct.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,1]
     *
     * Output: true
     *
     * Explanation:
     *
     * The element 1 occurs at the indices 0 and 3.
     *
     * Example 2:
     *
     * Input: nums = [1,2,3,4]
     *
     * Output: false
     *
     * Explanation:
     *
     * All elements are distinct.
     *
     * Example 3:
     *
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     *
     * Output: true
     *
     *
     *
     * Constraints:
     *
     * 1 <= nums.length <= 105
     * -109 <= nums[i] <= 109*/

    public static boolean containsDuplicate(int[] nums) {
        boolean isDuplicate = false;
        HashMap<Integer,Integer> iv = new HashMap<>();
        for(int i: nums){
            if(iv.containsKey(i)){iv.put(i,iv.get(i)+1);isDuplicate=true;break;}
            else{
                iv.put(i,1);
            }
        }
        return isDuplicate;
    }
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4,5,6,7,7,8,9}));
    }
}