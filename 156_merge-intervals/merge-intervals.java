/*
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/merge-intervals
@Language: Java
@Datetime: 17-06-09 08:31
*/

/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */

class Solution {
    /**
     * @param intervals, a collection of intervals
     * @return: A new sorted interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }
        int len = intervals.size();
        Collections.sort(intervals,new IntervalComparator());
        ArrayList<Interval> result  = new ArrayList<Interval>();
        Interval last = intervals.get(0);
        for(int i=1;i<len;i++){
            int temp = intervals.get(i).start;
            if(temp<=last.end)
                last.end = Math.max(intervals.get(i).end,last.end);
            else{
                result.add(last);
                last = intervals.get(i);
            }
                
        }
        result.add(last);
        return result;
    }
    
    private class IntervalComparator implements Comparator<Interval>{
        public int compare(Interval a, Interval b){
            return a.start-b.start;
            
        }
    }
    
    
    
}