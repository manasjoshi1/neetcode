package arrays;

/*
Given an array of integers nums and an integer target,
return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.
 */
public class TwoIntegerSum {
    public int[] twoSum(int[] nums, int target) {
        int[] abc = new int[2];
        for( int i =0; i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    abc[0]=i;
                    abc[1]=j;
                }
            }
        }

    return abc;
    }
}
