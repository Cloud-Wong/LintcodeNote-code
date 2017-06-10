```
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/minimum-subarray
@Language: Markdown
@Datetime: 17-06-07 06:11
```

要求：
给定一个整数数组，找到一个具有最小和的子数组。返回其最小和。
思路：
方式一：
两重循环求出所有子数组的和，保存最小子数组的和
方式二：
每个数组的元素都有两种情况，加与不加，所以我们从第一个元素开始判断，包括第一个元素时，和不包括第一个元素的情况取最小值，进行判断选择。
