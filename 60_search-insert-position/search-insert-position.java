/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/search-insert-position
@Language: Java
@Datetime: 17-06-06 09:34
*/

public class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        int len = A.length;
        int i;
        for(i=0;i<len;i++){
            if(A[i]==target||A[i]>target)
                return i;
        }       
        return len;
    }
}
