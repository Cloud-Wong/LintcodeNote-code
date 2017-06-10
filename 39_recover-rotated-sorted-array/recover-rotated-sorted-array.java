/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/recover-rotated-sorted-array
@Language: Java
@Datetime: 17-06-07 10:20
*/

public class Solution {
    /**
     * @param nums: The rotated sorted array
     * @return: void
     */
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        // write your code
        int len = nums.size();
        int exc=-1;
        for(int i=1;i<len;i++){
            if(nums.get(i)<nums.get(i-1)){
                exc = i-1;
                break;
            }
        }
        if(exc==-1) return;
        int temp;
        for(int i=0;i<=exc;i++){
            temp = nums.remove(0);
            nums.add(temp);
        }
    }
}