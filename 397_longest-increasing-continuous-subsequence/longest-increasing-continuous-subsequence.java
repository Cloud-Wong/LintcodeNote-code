/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/longest-increasing-continuous-subsequence
@Language: Java
@Datetime: 17-05-30 17:09
*/

public class Solution {
    /**
     * @param A an array of Integer
     * @return  an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // Write your code here
        int max=1;
        int term=1;
        int len = A.length;
        for(int i=0;i<len-1;i++){
            if(A[i]>A[i+1]){
               term++; 
               if(term>=max)
                max=term;
            }
            else{
                if(term>max)
                    max=term;
                term=1;
            }
        }
        term=1;
        for(int i=0;i<len-1;i++){
            if(A[i]<A[i+1]){
               term++; 
               if(term>=max)
                max=term;
            }
            else{
                if(term>max)
                    max=term;
                term=1;
            }
        }
        if(len==0) return 0;
        
        return max;
    }
}