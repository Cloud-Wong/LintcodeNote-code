/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/partition-array-by-odd-and-even
@Language: Java
@Datetime: 17-05-31 05:01
*/

public class Solution {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here;
        int len = nums.length;
        int left=0;
        int term;
        for(int i=0;i<len;i++){
            if(nums[i]%2!=0){
                term = nums[i];
                nums[i] = nums[left];
                nums[left] = term;
                left++;
            }
        }
    }
}