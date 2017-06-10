/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/unique-characters
@Language: Java
@Datetime: 17-05-31 15:17
*/

public class Solution {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        char c[];
        c = str.toCharArray();
        int len = c.length;
        int a[] = new int[127];
        for(int i=0;i<len;i++){
            a[c[i]]++;
            if(a[c[i]]==2)
                return false;
        }
        return true;
        
    }
}