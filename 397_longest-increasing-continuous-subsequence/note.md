```
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/longest-increasing-continuous-subsequence
@Language: Markdown
@Datetime: 17-05-30 17:09
```

要求：
给定一个整数数组（下标从 0 到 n-1， n 表示整个数组的规模），请找出该数组中的最长上升连续子序列。（最长上升连续子序列可以定义为从右到左或从左到右的序列。）
思路：
首先排除掉空数组，如传入空数组，则返回0.
若数组非空，则上升连续子序列最大至少为1。
于是先正序遍历最长子序列和。当A[i]>A[i]时，计数器加一。
计数器的值大于当前最大值是则将最大值设为计数器的值。
以此类推求出逆序的最长子序列和。

