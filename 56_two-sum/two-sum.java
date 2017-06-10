/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/two-sum
@Language: Java
@Datetime: 17-06-07 05:41
*/

public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int result[] = new int[2];
        int len = numbers.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++)
                if(numbers[i]+numbers[j]==target){
                    result[0]=i+1;
                    result[1]=j+1;
                    return result;
                }
        }
        return result;
    }
}