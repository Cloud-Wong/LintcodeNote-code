/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/first-position-of-target
@Language: Java
@Datetime: 17-06-08 15:13
*/

class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        int len = nums.length;
        int start = 0;
        int end = len-1;
        int middle=0;
        while(start<=end){
            middle = (start+end)/2;
            if(target==nums[middle])
                if(middle>0&&nums[middle-1]==target)
                    end = middle-1;
                else
                    return middle;
            else if(nums[middle]<target)
                start = middle+1;
            else
                end = middle-1;
            
        }
        return -1;
        
        
    }
}