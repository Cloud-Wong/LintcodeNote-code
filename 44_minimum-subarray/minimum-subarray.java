/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/minimum-subarray
@Language: Java
@Datetime: 17-06-07 06:11
*/

public class Solution {
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(ArrayList<Integer> nums) {
        // write your code
        int min_ending_here = nums.get(0);
        int min_so_far = nums.get(0);
        for(int i=1;i<nums.size();i++)
        {
            min_ending_here = Math.min(nums.get(i), nums.get(i)+ min_ending_here);
            min_so_far = Math.min(min_ending_here, min_so_far);
        }
        return min_so_far;
    }
}
