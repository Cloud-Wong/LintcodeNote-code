```
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/first-position-of-target
@Language: Markdown
@Datetime: 17-06-08 15:13
```

要求：
给定一个排序的整数数组（升序）和一个要查找的整数target，用O(logn)的时间查找到target第一次出现的下标（从0开始），如果target不存在于数组中，返回-1。
思路：
首先是二分查找
中心思想是从排序数组的中间位置开始判断，看目标数是在数组的左半边还是又半边，然后继续切半查找。
但此题要求返回第一次出现目标数的位置，因此当找到目标数时还要再判断它的前以为是否也是目标数。若依然是目标数则把end设为该目标数前以为然后继续二分查找