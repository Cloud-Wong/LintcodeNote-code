/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/remove-duplicates-from-sorted-array-ii
@Language: Java
@Datetime: 17-06-04 11:37
*/

public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        int len = nums.length;
        if(nums == null)
            return 0;
        int term;
        int left=1;
        int count=0;
        if(len<=1) return len;
        for(int i=1;i<len;i++){
            if(nums[i]!=nums[left-1]){
                nums[left]=nums[i];
                left++;
                count=0;
            }
            else{
                if(count==0){
                    count++;
                    nums[left]=nums[i];
                    left++;
                }
            }
            
        }
        return left;
    }
}