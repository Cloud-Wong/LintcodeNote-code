/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/singleton
@Language: Java
@Datetime: 17-05-30 05:10
*/

class Solution {
    /**
     * @return: The same instance of this class every time
     */
     private static Solution solution = new Solution();
     private  Solution(){};
     public static Solution getInstance() {
        return solution;
    }
};