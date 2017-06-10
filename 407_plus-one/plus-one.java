/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/plus-one
@Language: Java
@Datetime: 17-05-31 11:06
*/

public class Solution {
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public int[] plusOne(int[] digits) {
        // Write your code here
        int len = digits.length;
        long sum=0;
        int carry;
        if(len==0) return digits;
        
        for(int i=len-1;i>=0;i--){
            int num = (digits[i]+1)%10;
            carry = (digits[i]+1)/10;
            digits[i] = num;
            if(carry==0)
                return digits;
        }
        
        int a[] = new int[len+1];
        a[0]=1;
        return a;
    }
}