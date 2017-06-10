```
@Copyright:LintCode
@Author:   Cloud-Wong
@Problem:  http://www.lintcode.com/problem/median
@Language: Markdown
@Datetime: 17-06-04 11:45
```

要求：
给定一个未排序的整数数组，找到其中位数。
思路：
中位数就是取排序后的数组中间那位
由于给定的数组为排序
直接采用快速排序整理数组
取中间位置的值
坑：
数组从0开始，因此要返回的位置应该是 (数组长度-1)/2