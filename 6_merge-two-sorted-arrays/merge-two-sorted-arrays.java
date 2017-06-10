/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/merge-two-sorted-arrays
@Language: Java
@Datetime: 17-06-08 16:36
*/

class Solution {
    /**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // Write your code here
        if (A == null || B == null) {
            return null;
        }
        int result[] = new int[A.length+B.length];
        int i=0,j=0,index=0;
        while (i < A.length && j < B.length){
            if (A[i] < B[j]) {
                result[index++] = A[i++];
            } else {
               result[index++] = B[j++];
            }
        }
        while(i<A.length){
            result[index++] = A[i++];
        }
        while(j<B.length){
            result[index++] = B[j++];
        }
        return result;
    }
}