/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/median
@Language: Java
@Datetime: 17-06-04 11:45
*/

public class Solution {
    /**
     * @param nums: A list of integers.
     * @return: An integer denotes the middle number of the array.
     */
    public int median(int[] nums) {
        // write your code here
        
        int len = nums.length;
        this.sort(nums,0,len-1);
        return nums[(len-1)/2];
    }
    
    private int getMiddle(int nums[],int low,int height){
        int temp = nums[low];
        while(low<height){
            while(low<height && nums[height]>=temp)
                height--;
            nums[low] = nums[height];
            while(low<height && nums[low]<=temp)
                low++;
            nums[height] = nums[low];
        }
        nums[low] = temp;
        return low;
    }
    
    private void sort(int nums[],int low,int height){
        if(low<height){
            int middle = this.getMiddle(nums,low,height);
            sort(nums,low,middle-1);
            sort(nums,middle+1,height);
        }
    }
}
