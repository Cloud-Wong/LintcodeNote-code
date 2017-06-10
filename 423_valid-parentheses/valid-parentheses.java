/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/valid-parentheses
@Language: Java
@Datetime: 17-06-10 13:36
*/

public class Solution {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // Write your code here
        Stack<Character> stack = new Stack<Character>();
        for(Character c : s.toCharArray()){
            if("{[(".contains(String.valueOf(c)))
                stack.push(c);
            else{
                if(!stack.isEmpty() && isValid(stack.peek(),c)){
                    stack.pop();
                }
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
    
    public boolean isValid(char c1,char c2){
        if(c1=='('&&c2==')' || c1=='['&&c2==']' || c1=='{'&&c2=='}')
            return true;
        return false;
    }
}