```
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/merge-sorted-array
@Language: Markdown
@Datetime: 17-06-05 16:07
```

要求：
合并两个排序的整数数组A和B变成一个新的排序数组。
思路：
方法一：
先把两个数组合为一个数组，然后快排
方法二：
从A数组向后开始摆放元素
谁大摆谁
当其中一个数组元素摆放完后，依次填充剩余的另一个数组即可
