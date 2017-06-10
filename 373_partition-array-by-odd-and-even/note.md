```
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/partition-array-by-odd-and-even
@Language: Markdown
@Datetime: 17-05-31 05:01
```

要求：
分割一个整数数组，使得奇数在前偶数在后。
思路：
和移动零那道题目思路类似，设置一个左指针。
当遇到第一个奇数时，将它与数组第一位的数字交换位置
当遇到第二个奇数时，将它与数组第二位的数字交换位置
。。。
直到遍历完成，数组的奇数全部都在前面，由于题目并不要求偶数要按原顺序排列，因此直接交换即可。