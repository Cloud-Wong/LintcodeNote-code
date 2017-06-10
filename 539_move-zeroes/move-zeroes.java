/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/move-zeroes
@Language: Java
@Datetime: 17-05-30 14:33
*/

public class Solution {
    /**
     * @param nums an integer array
     * @return nothing, do this in-place
     */
    public void moveZeroes(int[] nums) {
        // Write your code here
        int len = nums.length;
        int left=0;
        int right;
        int term;
        for(int i=0;i<len;i++)
            if(nums[i]!=0)
                {
                    term=nums[i];
                    nums[i]=nums[left];
                    nums[left]=term;
                    left++;
                }
        
    }
}