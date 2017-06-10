```
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/merge-intervals
@Language: Markdown
@Datetime: 17-06-09 08:31
```

要求：
给出若干闭合区间，合并所有重叠的部分。
思路：
贪心算法， 把区间的左端点从大到小排序，然后判断右端点与下一个区间左端点的大小，若右端点小于下一个区间的左端点，则判断两者左端点是否能合并。
直到合并所有元素