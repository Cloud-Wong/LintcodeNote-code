/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/remove-element
@Language: Java
@Datetime: 17-05-31 15:00
*/

public class Solution {
    /** 
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        int count=0;
        int len = A.length;
        int left=0;
        int term;
        for(int i=0;i<len;i++){
            if(A[i]!=elem)
                count++;
        }
        for(int i=0;i<len;i++){
            if(A[i]!=elem){
                term=A[i];
                A[i]=A[left];
                A[left]=term;
                left++;
            }
        }
        
        return count;
        
    }
}
