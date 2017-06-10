/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/maximum-subarray
@Language: Java
@Datetime: 17-06-07 06:38
*/

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code
        int temp = 0;
        int max = nums[0];
        int len = nums.length;
        for(int i=0;i<len;i++){
            temp = Math.max(nums[i],nums[i]+temp);
            max = Math.max(temp,max);
        }
        return max;
    }
}